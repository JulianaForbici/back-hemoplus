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
public class CriarAgendamentoHandlerImplTest {

    @Mock
    private AgendamentoService agendamentoService;

    @Mock
    private TranslationHubApi translationHubApi;

    @InjectMocks
    private CriarAgendamentoHandlerImpl handler;

    @Test
    @DisplayName("Deve lançar ServiceException quando request for nulo")
    public void deveLancarQuandoRequestNulo() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.requisicao.obrigatoria"))
                .thenReturn("Request obrigatória");

        try {
            handler.criarAgendamento(null);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("Request obrigatória", e.getMessage());
        }

        verify(translationHubApi).getMessage("br.com.senior.my_domain.my_service.common.requisicao.obrigatoria");
        verifyNoInteractions(agendamentoService);
    }

    @Test
    @DisplayName("Deve lançar ServiceException quando usuarioId for nulo ou em branco")
    public void deveLancarQuandoUsuarioIdInvalido() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.criar.usuarioIdObrigatorio"))
                .thenReturn("UsuarioId obrigatório");

        CriarAgendamentoInput in = new CriarAgendamentoInput();
        in.usuarioId = "   ";
        in.hemocentroId = "x";
        in.dataHora = Instant.now();

        try {
            handler.criarAgendamento(in);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("UsuarioId obrigatório", e.getMessage());
        }

        verify(translationHubApi).getMessage("br.com.senior.my_domain.my_service.agendamento.criar.usuarioIdObrigatorio");
        verifyNoInteractions(agendamentoService);
    }

    @Test
    @DisplayName("Deve lançar ServiceException quando hemocentroId for nulo ou em branco")
    public void deveLancarQuandoHemocentroIdInvalido() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.hemocentro.obrigatorio"))
                .thenReturn("HemocentroId obrigatório");

        CriarAgendamentoInput in = new CriarAgendamentoInput();
        in.usuarioId = "u";
        in.hemocentroId = "   ";
        in.dataHora = Instant.now();

        try {
            handler.criarAgendamento(in);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("HemocentroId obrigatório", e.getMessage());
        }

        verify(translationHubApi).getMessage("br.com.senior.my_domain.my_service.common.hemocentro.obrigatorio");
        verifyNoInteractions(agendamentoService);
    }

    @Test
    @DisplayName("Deve lançar ServiceException quando dataHora for nula")
    public void deveLancarQuandoDataHoraNula() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.criar.dataHoraObrigatoria"))
                .thenReturn("DataHora obrigatória");

        CriarAgendamentoInput in = new CriarAgendamentoInput();
        in.usuarioId = "u";
        in.hemocentroId = "h";
        in.dataHora = null;

        try {
            handler.criarAgendamento(in);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("DataHora obrigatória", e.getMessage());
        }

        verify(translationHubApi).getMessage("br.com.senior.my_domain.my_service.agendamento.criar.dataHoraObrigatoria");
        verifyNoInteractions(agendamentoService);
    }

    @Test
    @DisplayName("Deve criar e retornar output com retorno ok e dto mapeado")
    public void deveCriarERetornarOutput() {
        // Arrange
        CriarAgendamentoInput in = new CriarAgendamentoInput();
        in.usuarioId = UUID.randomUUID().toString();
        in.hemocentroId = UUID.randomUUID().toString();
        in.dataHora = Instant.parse("2026-02-10T10:00:00Z");
        in.observacao = "obs";

        UUID id = UUID.randomUUID();

        AgendamentoEntity entity = new AgendamentoEntity();
        entity.setId(id);
        entity.setDataHora(in.dataHora);
        entity.setStatus(StatusAgendamento.PENDENTE);
        entity.setObservacao(in.observacao);
        entity.setMotivoStatus(null);
        entity.setDataCriacao(Instant.parse("2026-02-01T00:00:00Z"));
        entity.setDataAtualizacao(Instant.parse("2026-02-01T00:00:00Z"));
        entity.setToken(null);
        entity.setTokenExpiraEm(null);
        entity.setTokenUsadoEm(null);

        when(agendamentoService.criar(in.usuarioId, in.hemocentroId, in.dataHora, in.observacao))
                .thenReturn(entity);

        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.criar.sucesso"))
                .thenReturn("Criado com sucesso");

        // Act
        CriarAgendamentoOutput out = handler.criarAgendamento(in);

        // Assert
        assertNotNull(out);
        assertNotNull(out.retorno);
        assertEquals("Criado com sucesso", out.retorno.mensagem);
        assertEquals(id.toString(), out.retorno.codigo);
        assertFalse(Boolean.TRUE.equals(out.retorno.contemErro));

        assertNotNull(out.agendamento);
        assertEquals(id.toString(), out.agendamento.id);
        assertEquals(entity.getDataHora(), out.agendamento.dataHora);
        assertEquals(entity.getStatus(), out.agendamento.status);
        assertEquals(entity.getObservacao(), out.agendamento.observacao);
        assertEquals(entity.getMotivoStatus(), out.agendamento.motivoStatus);
        assertEquals(entity.getDataCriacao(), out.agendamento.dataCriacao);
        assertEquals(entity.getDataAtualizacao(), out.agendamento.dataAtualizacao);
        assertNull(out.agendamento.token);
        assertNull(out.agendamento.tokenExpiraEm);
        assertNull(out.agendamento.tokenUsadoEm);

        assertNull(out.agendamento.usuario);
        assertNull(out.agendamento.hemocentro);
        assertNull(out.agendamento.doacoes);

        verify(agendamentoService, times(1))
                .criar(in.usuarioId, in.hemocentroId, in.dataHora, in.observacao);
        verify(translationHubApi, times(1))
                .getMessage("br.com.senior.my_domain.my_service.agendamento.criar.sucesso");
    }
}