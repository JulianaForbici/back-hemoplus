package br.com.senior.mydomain.myservice.agendamento.handler;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.Agendamento;
import br.com.senior.mydomain.myservice.AgendamentoEntity;
import br.com.senior.mydomain.myservice.ListarAgendamentosPorPeriodoInput;
import br.com.senior.mydomain.myservice.ListarAgendamentosPorPeriodoOutput;
import br.com.senior.mydomain.myservice.StatusAgendamento;
import br.com.senior.mydomain.myservice.agendamento.AgendamentoService;
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
public class ListarAgendamentosPorPeriodoHandlerImplTest {

    @Mock
    private AgendamentoService agendamentoService;

    @Mock
    private TranslationHubApi translationHubApi;

    @InjectMocks
    private ListarAgendamentosPorPeriodoHandlerImpl handler;

    @Test
    @DisplayName("Deve lançar ServiceException quando request for nulo ou dataInicio nula")
    public void deveLancarQuandoRequestNuloOuDataInicioNula() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.listarPorPeriodo.param.dataInicio.obrigatoria"))
                .thenReturn("DataInicio obrigatória");

        try {
            handler.listarAgendamentosPorPeriodo(null);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("DataInicio obrigatória", e.getMessage());
        }

        ListarAgendamentosPorPeriodoInput in2 = new ListarAgendamentosPorPeriodoInput();
        in2.dataInicio = null;

        try {
            handler.listarAgendamentosPorPeriodo(in2);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("DataInicio obrigatória", e.getMessage());
        }

        verify(translationHubApi, times(2))
                .getMessage("br.com.senior.my_domain.my_service.agendamento.listarPorPeriodo.param.dataInicio.obrigatoria");
        verifyNoInteractions(agendamentoService);
    }

    @Test
    @DisplayName("Deve lançar ServiceException quando dataFim for nula")
    public void deveLancarQuandoDataFimNula() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.listarPorPeriodo.param.dataFim.obrigatoria"))
                .thenReturn("DataFim obrigatória");

        ListarAgendamentosPorPeriodoInput in = new ListarAgendamentosPorPeriodoInput();
        in.dataInicio = Instant.parse("2026-02-01T00:00:00Z");
        in.dataFim = null;

        try {
            handler.listarAgendamentosPorPeriodo(in);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("DataFim obrigatória", e.getMessage());
        }

        verify(translationHubApi, times(1))
                .getMessage("br.com.senior.my_domain.my_service.agendamento.listarPorPeriodo.param.dataFim.obrigatoria");
        verifyNoInteractions(agendamentoService);
    }

    @Test
    @DisplayName("Deve lançar ServiceException quando periodo for invalido (inicio > fim)")
    public void deveLancarQuandoPeriodoInvalido() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.listarPorPeriodo.param.periodo.invalido"))
                .thenReturn("Período inválido");

        ListarAgendamentosPorPeriodoInput in = new ListarAgendamentosPorPeriodoInput();
        in.dataInicio = Instant.parse("2026-02-10T00:00:00Z");
        in.dataFim = Instant.parse("2026-02-01T00:00:00Z");

        try {
            handler.listarAgendamentosPorPeriodo(in);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("Período inválido", e.getMessage());
        }

        verify(translationHubApi, times(1))
                .getMessage("br.com.senior.my_domain.my_service.agendamento.listarPorPeriodo.param.periodo.invalido");
        verifyNoInteractions(agendamentoService);
    }

    @Test
    @DisplayName("Deve lançar ServiceException quando usuarioId for uuid invalido")
    public void deveLancarQuandoUsuarioIdInvalido() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.listarPorPeriodo.param.usuarioId.invalido"))
                .thenReturn("UsuarioId inválido");

        ListarAgendamentosPorPeriodoInput in = new ListarAgendamentosPorPeriodoInput();
        in.dataInicio = Instant.parse("2026-02-01T00:00:00Z");
        in.dataFim = Instant.parse("2026-02-10T00:00:00Z");
        in.usuarioId = "abc";
        in.hemocentroId = null;

        try {
            handler.listarAgendamentosPorPeriodo(in);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("UsuarioId inválido", e.getMessage());
        }

        verify(translationHubApi, times(1))
                .getMessage("br.com.senior.my_domain.my_service.agendamento.listarPorPeriodo.param.usuarioId.invalido");
        verifyNoInteractions(agendamentoService);
    }

    @Test
    @DisplayName("Deve lançar ServiceException quando hemocentroId for uuid invalido")
    public void deveLancarQuandoHemocentroIdInvalido() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.listarPorPeriodo.param.hemocentroId.invalido"))
                .thenReturn("HemocentroId inválido");

        ListarAgendamentosPorPeriodoInput in = new ListarAgendamentosPorPeriodoInput();
        in.dataInicio = Instant.parse("2026-02-01T00:00:00Z");
        in.dataFim = Instant.parse("2026-02-10T00:00:00Z");
        in.usuarioId = null;
        in.hemocentroId = "abc";

        try {
            handler.listarAgendamentosPorPeriodo(in);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("HemocentroId inválido", e.getMessage());
        }

        verify(translationHubApi, times(1))
                .getMessage("br.com.senior.my_domain.my_service.agendamento.listarPorPeriodo.param.hemocentroId.invalido");
        verifyNoInteractions(agendamentoService);
    }

    @Test
    @DisplayName("Deve retornar lista de agendamentos (dto) e chamar service com uuids nulos quando ids em branco")
    public void deveListarEConverterQuandoIdsEmBranco() {
        // Arrange
        Instant ini = Instant.parse("2026-02-01T00:00:00Z");
        Instant fim = Instant.parse("2026-02-10T00:00:00Z");

        ListarAgendamentosPorPeriodoInput in = new ListarAgendamentosPorPeriodoInput();
        in.dataInicio = ini;
        in.dataFim = fim;
        in.usuarioId = "   ";      // parse -> null
        in.hemocentroId = "   ";   // parse -> null
        in.status = StatusAgendamento.PENDENTE;

        AgendamentoEntity e1 = new AgendamentoEntity();
        e1.setId(UUID.randomUUID());
        e1.setDataHora(Instant.parse("2026-02-05T10:00:00Z"));
        e1.setStatus(StatusAgendamento.PENDENTE);
        e1.setObservacao("obs1");
        e1.setMotivoStatus(null);

        AgendamentoEntity e2 = new AgendamentoEntity();
        // id null pra cobrir ternário do toDto
        e2.setId(null);
        e2.setDataHora(Instant.parse("2026-02-06T10:00:00Z"));
        e2.setStatus(StatusAgendamento.CONFIRMADO);
        e2.setObservacao(null);
        e2.setMotivoStatus("m");

        when(agendamentoService.listarPorPeriodo(eq(ini), eq(fim), isNull(), isNull(), eq(in.status)))
                .thenReturn(Arrays.asList(e1, e2));

        // Act
        ListarAgendamentosPorPeriodoOutput out = handler.listarAgendamentosPorPeriodo(in);

        // Assert
        assertNotNull(out);
        assertNotNull(out.resultado);
        assertEquals(2, out.resultado.size());

        Agendamento d1 = out.resultado.get(0);
        assertEquals(e1.getId().toString(), d1.id);
        assertEquals(e1.getDataHora(), d1.dataHora);
        assertEquals(e1.getStatus(), d1.status);
        assertEquals(e1.getObservacao(), d1.observacao);
        assertNull(d1.usuario);
        assertNull(d1.hemocentro);
        assertNull(d1.doacoes);

        Agendamento d2 = out.resultado.get(1);
        assertNull(d2.id); // id null
        assertEquals(e2.getStatus(), d2.status);

        verify(agendamentoService, times(1))
                .listarPorPeriodo(eq(ini), eq(fim), isNull(), isNull(), eq(in.status));
        verifyNoInteractions(translationHubApi);
    }
}