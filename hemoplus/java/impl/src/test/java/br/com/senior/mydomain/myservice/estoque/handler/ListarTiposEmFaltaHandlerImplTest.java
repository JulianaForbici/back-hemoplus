package br.com.senior.mydomain.myservice.estoque.handler;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.estoque.EstoqueService;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.time.Instant;
import java.util.Arrays;
import java.util.UUID;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ListarTiposEmFaltaHandlerImplTest {

    @Mock
    private EstoqueService estoqueService;

    @Mock
    private TranslationHubApi translationHubApi;

    @InjectMocks
    private ListarTiposEmFaltaHandlerImpl handler;

    @Test
    @DisplayName("Deve lançar ServiceException quando request for nulo")
    public void deveLancarQuandoRequestNulo() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.hemocentro.obrigatorio")).thenReturn("HemocentroId obrigatório");

        try {
            handler.listarTiposEmFalta(null);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("HemocentroId obrigatório", e.getMessage());
        }

        verify(translationHubApi).getMessage("br.com.senior.my_domain.my_service.common.hemocentro.obrigatorio");
        verifyNoInteractions(estoqueService);
    }

    @Test
    @DisplayName("Deve lançar ServiceException quando hemocentroId for nulo")
    public void deveLancarQuandoHemocentroIdNulo() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.hemocentro.obrigatorio")).thenReturn("HemocentroId obrigatório");

        ListarTiposEmFaltaInput in = new ListarTiposEmFaltaInput();
        in.hemocentroId = null;

        try {
            handler.listarTiposEmFalta(in);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("HemocentroId obrigatório", e.getMessage());
        }

        verify(translationHubApi).getMessage("br.com.senior.my_domain.my_service.common.hemocentro.obrigatorio");
        verifyNoInteractions(estoqueService);
    }

    @Test
    @DisplayName("Deve lançar ServiceException quando hemocentroId estiver em branco")
    public void deveLancarQuandoHemocentroIdBlank() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.hemocentro.obrigatorio")).thenReturn("HemocentroId obrigatório");

        ListarTiposEmFaltaInput in = new ListarTiposEmFaltaInput();
        in.hemocentroId = "   ";

        try {
            handler.listarTiposEmFalta(in);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("HemocentroId obrigatório", e.getMessage());
        }

        verify(translationHubApi).getMessage("br.com.senior.my_domain.my_service.common.hemocentro.obrigatorio");
        verifyNoInteractions(estoqueService);
    }

    @Test
    @DisplayName("Deve retornar lista (dto) e mapear campos corretamente")
    public void deveRetornarListaEMapearDtos() {
        String hemocentroId = UUID.randomUUID().toString();
        ListarTiposEmFaltaInput in = new ListarTiposEmFaltaInput();
        in.hemocentroId = hemocentroId;
        EstoqueEntity e1 = new EstoqueEntity();
        UUID id1 = UUID.randomUUID();
        e1.setId(id1);
        e1.setTipoSangue(TipoSangue.O);
        e1.setFatorRh(FatorRh.POSITIVO);
        e1.setQuantidadeMl(100L);
        e1.setMinimoMl(200L);
        e1.setDataAtualizacao(Instant.parse("2026-02-10T10:00:00Z"));

        EstoqueEntity e2 = new EstoqueEntity();
        e2.setId(null);
        e2.setTipoSangue(TipoSangue.A);
        e2.setFatorRh(FatorRh.NEGATIVO);
        e2.setQuantidadeMl(0L);
        e2.setMinimoMl(0L);
        e2.setDataAtualizacao(Instant.parse("2026-02-11T10:00:00Z"));

        when(estoqueService.listarEmFalta(hemocentroId)).thenReturn(Arrays.asList(e1, e2));
        ListarTiposEmFaltaOutput out = handler.listarTiposEmFalta(in);

        assertNotNull(out);
        assertNotNull(out.resultado);
        assertEquals(2, out.resultado.size());

        Estoque d1 = out.resultado.get(0);
        assertEquals(id1.toString(), d1.id);
        assertEquals(TipoSangue.O, d1.tipoSangue);
        assertEquals(FatorRh.POSITIVO, d1.fatorRh);
        assertEquals(Long.valueOf(100L), d1.quantidadeMl);
        assertEquals(Long.valueOf(200L), d1.minimoMl);
        assertEquals(e1.getDataAtualizacao(), d1.dataAtualizacao);
        assertNull(d1.hemocentro);

        Estoque d2 = out.resultado.get(1);
        assertNull(d2.id);
        assertEquals(TipoSangue.A, d2.tipoSangue);

        verify(estoqueService, times(1)).listarEmFalta(hemocentroId);
        verifyNoInteractions(translationHubApi);
    }
}