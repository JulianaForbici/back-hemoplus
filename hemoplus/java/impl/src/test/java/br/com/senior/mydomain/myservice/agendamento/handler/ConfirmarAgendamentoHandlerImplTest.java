package br.com.senior.mydomain.myservice.agendamento.handler;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.agendamento.AgendamentoService;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.time.Instant;
import java.util.UUID;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ConfirmarAgendamentoHandlerImplTest {

    @Mock
    private AgendamentoService agendamentoService;

    @Mock
    private TranslationHubApi translationHubApi;

    @InjectMocks
    private ConfirmarAgendamentoHandlerImpl handler;

    @Test
    @DisplayName("Deve lançar ServiceException quando request for nulo")
    public void deveLancarQuandoRequestNulo() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.agendamento.obrigatorio"))
                .thenReturn("AgendamentoId obrigatório");

        try {
            handler.confirmarAgendamento(null);
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

        ConfirmarAgendamentoInput in = new ConfirmarAgendamentoInput();
        in.agendamentoId = null;

        try {
            handler.confirmarAgendamento(in);
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

        ConfirmarAgendamentoInput in = new ConfirmarAgendamentoInput();
        in.agendamentoId = "   ";

        try {
            handler.confirmarAgendamento(in);
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
    @DisplayName("Deve confirmar e retornar output com retorno ok e dto mapeado")
    public void deveConfirmarERetornarOutput() {
        // Arrange
        ConfirmarAgendamentoInput in = new ConfirmarAgendamentoInput();
        in.agendamentoId = UUID.randomUUID().toString();

        UUID id = UUID.fromString(in.agendamentoId);

        AgendamentoEntity entity = new AgendamentoEntity();
        entity.setId(id);
        entity.setDataHora(Instant.parse("2026-02-10T10:00:00Z"));
        entity.setStatus(StatusAgendamento.CONFIRMADO);
        entity.setObservacao("obs");
        entity.setMotivoStatus(null);
        entity.setDataCriacao(Instant.parse("2026-02-01T00:00:00Z"));
        entity.setDataAtualizacao(Instant.parse("2026-02-02T00:00:00Z"));
        entity.setToken("token123");
        entity.setTokenExpiraEm(Instant.parse("2026-02-10T12:00:00Z"));
        entity.setTokenUsadoEm(null);

        when(agendamentoService.confirmar(in.agendamentoId)).thenReturn(entity);

        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.confirmar.sucesso"))
                .thenReturn("Confirmado com sucesso");

        // Act
        ConfirmarAgendamentoOutput out = handler.confirmarAgendamento(in);

        // Assert
        assertNotNull(out);
        assertNotNull(out.retorno);
        assertEquals("Confirmado com sucesso", out.retorno.mensagem);
        assertEquals("token123", out.retorno.codigo);
        assertFalse(Boolean.TRUE.equals(out.retorno.contemErro));

        assertNotNull(out.agendamento);
        assertEquals(id.toString(), out.agendamento.id);
        assertEquals(entity.getDataHora(), out.agendamento.dataHora);
        assertEquals(entity.getStatus(), out.agendamento.status);
        assertEquals(entity.getObservacao(), out.agendamento.observacao);
        assertEquals(entity.getMotivoStatus(), out.agendamento.motivoStatus);
        assertEquals(entity.getDataCriacao(), out.agendamento.dataCriacao);
        assertEquals(entity.getDataAtualizacao(), out.agendamento.dataAtualizacao);
        assertEquals(entity.getToken(), out.agendamento.token);
        assertEquals(entity.getTokenExpiraEm(), out.agendamento.tokenExpiraEm);
        assertNull(out.agendamento.tokenUsadoEm);

        // mapeamento fixo
        assertNull(out.agendamento.usuario);
        assertNull(out.agendamento.hemocentro);
        assertNull(out.agendamento.doacoes);

        verify(agendamentoService, times(1)).confirmar(in.agendamentoId);
        verify(translationHubApi, times(1))
                .getMessage("br.com.senior.my_domain.my_service.agendamento.confirmar.sucesso");
    }
}