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
import java.util.List;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ListarEstoquePorHemocentroHandlerImplTest {

    @Mock
    private EstoqueService estoqueService;

    @Mock
    private TranslationHubApi translationHubApi;

    @InjectMocks private ListarEstoquePorHemocentroHandlerImpl handler;

    @Test
    @DisplayName("Deve lançar BAD_REQUEST quando request for null")
    void listarEstoquePorHemocentro_deveLancarQuandoRequestNull() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.hemocentro.obrigatorio")).thenReturn("HEMO_OBRIG");
        ServiceException ex = assertThrows(ServiceException.class, () -> handler.listarEstoquePorHemocentro(null));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("HEMO_OBRIG", ex.getMessage());
        verifyNoInteractions(estoqueService);
    }

    @Test
    @DisplayName("Deve lançar BAD_REQUEST quando hemocentroId for null")
    void listarEstoquePorHemocentro_deveLancarQuandoHemocentroIdNull() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.hemocentro.obrigatorio")).thenReturn("HEMO_OBRIG");
        ListarEstoquePorHemocentroInput in = new ListarEstoquePorHemocentroInput();
        in.hemocentroId = null;
        ServiceException ex = assertThrows(ServiceException.class, () -> handler.listarEstoquePorHemocentro(in));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("HEMO_OBRIG", ex.getMessage());
        verifyNoInteractions(estoqueService);
    }

    @Test
    @DisplayName("Deve lançar BAD_REQUEST quando hemocentroId for blank")
    void listarEstoquePorHemocentro_deveLancarQuandoHemocentroIdBlank() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.hemocentro.obrigatorio")).thenReturn("HEMO_OBRIG");
        ListarEstoquePorHemocentroInput in = new ListarEstoquePorHemocentroInput();
        in.hemocentroId = "   ";
        ServiceException ex = assertThrows(ServiceException.class, () -> handler.listarEstoquePorHemocentro(in));
        assertEquals(ErrorCategory.BAD_REQUEST, ex.getCategory());
        assertEquals("HEMO_OBRIG", ex.getMessage());
        verifyNoInteractions(estoqueService);
    }

    @Test
    @DisplayName("Deve retornar lista mapeada para DTO quando serviço retornar entidades")
    void listarEstoquePorHemocentro_deveRetornarListaMapeada() {
        String hemocentroId = UUID.randomUUID().toString();
        ListarEstoquePorHemocentroInput in = new ListarEstoquePorHemocentroInput();
        in.hemocentroId = hemocentroId;
        UUID e1Id = UUID.randomUUID();
        Instant agora = Instant.parse("2026-02-24T12:00:00Z");

        EstoqueEntity e1 = new EstoqueEntity();
        e1.setId(e1Id);
        e1.setTipoSangue(TipoSangue.A);
        e1.setFatorRh(FatorRh.POSITIVO);
        e1.setQuantidadeMl(1000L);
        e1.setMinimoMl(500L);
        e1.setDataAtualizacao(agora);

        EstoqueEntity e2 = new EstoqueEntity();
        e2.setId(null);
        e2.setTipoSangue(TipoSangue.O);
        e2.setFatorRh(FatorRh.NEGATIVO);
        e2.setQuantidadeMl(200L);
        e2.setMinimoMl(300L);
        e2.setDataAtualizacao(agora);

        when(estoqueService.listarPorHemocentro(hemocentroId)).thenReturn(List.of(e1, e2));

        ListarEstoquePorHemocentroOutput out = handler.listarEstoquePorHemocentro(in);

        assertNotNull(out);
        assertNotNull(out.resultado);
        assertEquals(2, out.resultado.size());

        Estoque dto1 = out.resultado.get(0);
        assertEquals(e1Id.toString(), dto1.id);
        assertEquals(e1.getTipoSangue(), dto1.tipoSangue);
        assertEquals(e1.getFatorRh(), dto1.fatorRh);
        assertEquals(1000L, dto1.quantidadeMl);
        assertEquals(500L, dto1.minimoMl);
        assertEquals(agora, dto1.dataAtualizacao);
        assertNull(dto1.hemocentro);

        Estoque dto2 = out.resultado.get(1);
        assertNull(dto2.id);
        assertEquals(e2.getTipoSangue(), dto2.tipoSangue);
        assertEquals(e2.getFatorRh(), dto2.fatorRh);
        assertEquals(200L, dto2.quantidadeMl);
        assertEquals(300L, dto2.minimoMl);
        assertEquals(agora, dto2.dataAtualizacao);
        assertNull(dto2.hemocentro);

        verify(estoqueService).listarPorHemocentro(hemocentroId);
    }
}