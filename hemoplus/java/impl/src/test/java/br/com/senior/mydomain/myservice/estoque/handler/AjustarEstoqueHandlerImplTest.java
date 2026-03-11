package br.com.senior.mydomain.myservice.estoque.handler;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.estoque.EstoqueService;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import java.time.Instant;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AjustarEstoqueHandlerImplTest {

    @Mock
    private EstoqueService estoqueService;

    @Mock
    private TranslationHubApi translationHubApi;

    @InjectMocks
    private AjustarEstoqueHandlerImpl handler;

    @Test
    @DisplayName("Deve lançar BAD_REQUEST quando request for null")
    void ajustarEstoque_deveLancarQuandoRequestNull() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.requisicao.obrigatoria")).thenReturn("REQ_OBRIG");
        ServiceException ex = assertThrows(ServiceException.class, () -> handler.ajustarEstoque(null));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("REQ_OBRIG", ex.getMessage());
        verifyNoInteractions(estoqueService);
    }

    @Test
    @DisplayName("Deve lançar BAD_REQUEST quando deltaMl não for inteiro")
    void ajustarEstoque_deveLancarQuandoDeltaNaoInteiro() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.estoque.ajustar.apenasInteiro")).thenReturn("APENAS_INTEIRO");
        AjustarEstoqueInput in = new AjustarEstoqueInput();
        in.deltaMl = 10.5;
        in.minimoMl = 1.0;
        in.hemocentroId = UUID.randomUUID().toString();
        in.tipoSangue = TipoSangue.A;
        in.fatorRh = FatorRh.POSITIVO;
        ServiceException ex = assertThrows(ServiceException.class, () -> handler.ajustarEstoque(in));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("APENAS_INTEIRO", ex.getMessage());
        verifyNoInteractions(estoqueService);
    }

    @Test
    @DisplayName("Deve lançar BAD_REQUEST quando minimoMl não for inteiro")
    void ajustarEstoque_deveLancarQuandoMinimoNaoInteiro() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.estoque.ajustar.apenasInteiro")).thenReturn("APENAS_INTEIRO");

        AjustarEstoqueInput in = new AjustarEstoqueInput();
        in.deltaMl = 10.0;
        in.minimoMl = 2.2;
        in.hemocentroId = UUID.randomUUID().toString();
        in.tipoSangue = TipoSangue.A;
        in.fatorRh = FatorRh.POSITIVO;

        ServiceException ex = assertThrows(ServiceException.class, () -> handler.ajustarEstoque(in));

        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("APENAS_INTEIRO", ex.getMessage());

        verifyNoInteractions(estoqueService);
    }

    @Test
    @DisplayName("Deve chamar service com valores arredondados e retornar sucesso com DTO preenchido")
    void ajustarEstoque_deveRetornarSucesso() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.estoque.ajustar.sucesso")).thenReturn("SUCESSO");
        AjustarEstoqueInput in = new AjustarEstoqueInput();
        in.hemocentroId = UUID.randomUUID().toString();
        in.tipoSangue = TipoSangue.A;
        in.fatorRh = FatorRh.POSITIVO;
        in.deltaMl = 450.0;
        in.minimoMl = 100.0;

        UUID estoqueId = UUID.randomUUID();
        Instant agora = Instant.parse("2026-02-24T12:00:00Z");

        EstoqueEntity salvo = new EstoqueEntity();
        salvo.setId(estoqueId);
        salvo.setTipoSangue(in.tipoSangue);
        salvo.setFatorRh(in.fatorRh);
        salvo.setQuantidadeMl(900L);
        salvo.setMinimoMl(100L);
        salvo.setDataAtualizacao(agora);

        when(estoqueService.ajustar(eq(in.hemocentroId), eq(in.tipoSangue), eq(in.fatorRh), eq(450L), eq(100L))).thenReturn(salvo);
        AjustarEstoqueOutput out = handler.ajustarEstoque(in);
        assertNotNull(out);
        assertNotNull(out.retorno);
        assertEquals("SUCESSO", out.retorno.mensagem);
        assertEquals(estoqueId.toString(), out.retorno.codigo);
        assertFalse(out.retorno.contemErro);
        assertNotNull(out.estoque);
        assertEquals(estoqueId.toString(), out.estoque.id);
        assertEquals(in.tipoSangue, out.estoque.tipoSangue);
        assertEquals(in.fatorRh, out.estoque.fatorRh);
        assertEquals(900L, out.estoque.quantidadeMl);
        assertEquals(100L, out.estoque.minimoMl);
        assertEquals(agora, out.estoque.dataAtualizacao);
        assertNull(out.estoque.hemocentro);
        verify(estoqueService).ajustar(in.hemocentroId, in.tipoSangue, in.fatorRh, 450L, 100L);
    }

    @Test
    @DisplayName("Deve passar null no delta/minimo quando request.deltaMl/minimoMl forem null")
    void ajustarEstoque_devePassarNullsQuandoNaoInformado() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.estoque.ajustar.sucesso")).thenReturn("SUCESSO");

        AjustarEstoqueInput in = new AjustarEstoqueInput();
        in.hemocentroId = UUID.randomUUID().toString();
        in.tipoSangue = TipoSangue.A;
        in.fatorRh = FatorRh.POSITIVO;
        in.deltaMl = null;
        in.minimoMl = null;
        EstoqueEntity salvo = new EstoqueEntity();
        salvo.setId(UUID.randomUUID());
        salvo.setTipoSangue(in.tipoSangue);
        salvo.setFatorRh(in.fatorRh);
        salvo.setQuantidadeMl(0L);
        salvo.setMinimoMl(0L);
        salvo.setDataAtualizacao(Instant.now());

        when(estoqueService.ajustar(eq(in.hemocentroId), eq(in.tipoSangue), eq(in.fatorRh), isNull(), isNull())).thenReturn(salvo);
        AjustarEstoqueOutput out = handler.ajustarEstoque(in);
        assertNotNull(out);
        verify(estoqueService).ajustar(in.hemocentroId, in.tipoSangue, in.fatorRh, null, null);
    }
}