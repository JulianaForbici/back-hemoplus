package br.com.senior.mydomain.myservice.agendamento.handler;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.AgendamentoEntity;
import br.com.senior.mydomain.myservice.MarcarNaoCompareceuPorPeriodoInput;
import br.com.senior.mydomain.myservice.MarcarNaoCompareceuPorPeriodoOutput;
import br.com.senior.mydomain.myservice.agendamento.AgendamentoService;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.UUID;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class NaoCompareceuHandlerImplTest {

    @Mock
    private AgendamentoService agendamentoService;

    @Mock
    private TranslationHubApi translationHubApi;

    @InjectMocks
    private NaoCompareceuHandlerImpl handler;

    @Test
    @DisplayName("Deve lançar ServiceException quando request for nulo")
    public void deveLancarQuandoRequestNulo() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.agendamento.obrigatorio"))
                .thenReturn("AgendamentoId obrigatório");

        try {
            handler.marcarNaoCompareceuPorPeriodo(null);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("AgendamentoId obrigatório", e.getMessage());
        }

        verify(translationHubApi, times(1))
                .getMessage("br.com.senior.my_domain.my_service.common.agendamento.obrigatorio");
        verifyNoInteractions(agendamentoService);
    }

    @Test
    @DisplayName("Deve lançar ServiceException quando agendamentoId for nulo")
    public void deveLancarQuandoAgendamentoIdNulo() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.agendamento.obrigatorio"))
                .thenReturn("AgendamentoId obrigatório");

        MarcarNaoCompareceuPorPeriodoInput in = new MarcarNaoCompareceuPorPeriodoInput();
        in.agendamentoId = null;

        try {
            handler.marcarNaoCompareceuPorPeriodo(in);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("AgendamentoId obrigatório", e.getMessage());
        }

        verify(translationHubApi, times(1))
                .getMessage("br.com.senior.my_domain.my_service.common.agendamento.obrigatorio");
        verifyNoInteractions(agendamentoService);
    }

    @Test
    @DisplayName("Deve lançar ServiceException quando agendamentoId estiver em branco")
    public void deveLancarQuandoAgendamentoIdEmBranco() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.agendamento.obrigatorio"))
                .thenReturn("AgendamentoId obrigatório");

        MarcarNaoCompareceuPorPeriodoInput in = new MarcarNaoCompareceuPorPeriodoInput();
        in.agendamentoId = "   ";

        try {
            handler.marcarNaoCompareceuPorPeriodo(in);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("AgendamentoId obrigatório", e.getMessage());
        }

        verify(translationHubApi, times(1))
                .getMessage("br.com.senior.my_domain.my_service.common.agendamento.obrigatorio");
        verifyNoInteractions(agendamentoService);
    }

    @Test
    @DisplayName("Deve marcar não compareceu e retornar output com retorno ok")
    public void deveMarcarNaoCompareceuERetornarOutput() {
        // Arrange
        String agendamentoId = UUID.randomUUID().toString();

        MarcarNaoCompareceuPorPeriodoInput in = new MarcarNaoCompareceuPorPeriodoInput();
        in.agendamentoId = agendamentoId;

        AgendamentoEntity entity = new AgendamentoEntity();
        entity.setId(UUID.fromString(agendamentoId));

        when(agendamentoService.marcarNaoCompareceu(agendamentoId)).thenReturn(entity);

        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.naoCompareceu.sucesso"))
                .thenReturn("Marcado com sucesso");

        // Act
        MarcarNaoCompareceuPorPeriodoOutput out = handler.marcarNaoCompareceuPorPeriodo(in);

        // Assert
        assertNotNull(out);
        assertNotNull(out.retorno);
        assertEquals("Marcado com sucesso", out.retorno.mensagem);
        assertEquals(agendamentoId, out.retorno.codigo);
        assertFalse(Boolean.TRUE.equals(out.retorno.contemErro));

        verify(agendamentoService, times(1)).marcarNaoCompareceu(agendamentoId);
        verify(translationHubApi, times(1))
                .getMessage("br.com.senior.my_domain.my_service.agendamento.naoCompareceu.sucesso");
    }
}