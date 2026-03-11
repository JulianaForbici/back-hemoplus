package br.com.senior.mydomain.myservice.agendamento.dashboard;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.DashboardResumoAgendamentos;
import br.com.senior.mydomain.myservice.DashboardSerieDia;
import br.com.senior.mydomain.myservice.agendamento.AgendamentoRepository;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class DashboardServiceTest {

    @Mock
    private AgendamentoRepository agendamentoRepository;

    @Mock
    private TranslationHubApi translationHubApi;

    @InjectMocks
    private DashboardService dashboardService;

    @Test
    @DisplayName("buscarResumo deve chamar repository e retornar resumo quando uuid valido")
    public void buscarResumo_DeveRetornarQuandoUuidValido() {
        Instant ini = Instant.parse("2026-02-01T00:00:00Z");
        Instant fim = Instant.parse("2026-02-10T00:00:00Z");
        String hemocentroId = UUID.randomUUID().toString();

        DashboardResumoAgendamentos resumo = new DashboardResumoAgendamentos();
        when(agendamentoRepository.buscarDashboardResumoAgendamentos(eq(ini), eq(fim), any(UUID.class))).thenReturn(resumo);

        DashboardResumoAgendamentos out = dashboardService.buscarResumo(ini, fim, hemocentroId);

        assertNotNull(out);
        assertEquals(resumo, out);
        verify(agendamentoRepository, times(1)).buscarDashboardResumoAgendamentos(eq(ini), eq(fim), any(UUID.class));
        verifyNoInteractions(translationHubApi);
    }

    @Test
    @DisplayName("buscarResumo deve passar hemocentroId null quando vazio")
    public void buscarResumo_DevePassarNullQuandoHemocentroVazio() {
        Instant ini = Instant.parse("2026-02-01T00:00:00Z");
        Instant fim = Instant.parse("2026-02-10T00:00:00Z");

        DashboardResumoAgendamentos resumo = new DashboardResumoAgendamentos();
        when(agendamentoRepository.buscarDashboardResumoAgendamentos(eq(ini), eq(fim), isNull())).thenReturn(resumo);
        DashboardResumoAgendamentos out = dashboardService.buscarResumo(ini, fim, "   ");

        assertNotNull(out);
        verify(agendamentoRepository, times(1)).buscarDashboardResumoAgendamentos(eq(ini), eq(fim), isNull());
        verifyNoInteractions(translationHubApi);
    }

    @Test
    @DisplayName("buscarSeriePorDia deve chamar repository e retornar lista quando uuid valido")
    public void buscarSeriePorDia_DeveRetornarQuandoUuidValido() {
        Instant ini = Instant.parse("2026-02-01T00:00:00Z");
        Instant fim = Instant.parse("2026-02-10T00:00:00Z");
        String hemocentroId = UUID.randomUUID().toString();
        List<DashboardSerieDia> lista = Collections.singletonList(new DashboardSerieDia());
        when(agendamentoRepository.buscarDashboardSerieAgendamentosPorDia(eq(ini), eq(fim), any(UUID.class))).thenReturn(lista);
        List<DashboardSerieDia> out = dashboardService.buscarSeriePorDia(ini, fim, hemocentroId);
        assertNotNull(out);
        assertEquals(1, out.size());
        verify(agendamentoRepository, times(1)).buscarDashboardSerieAgendamentosPorDia(eq(ini), eq(fim), any(UUID.class));
        verifyNoInteractions(translationHubApi);
    }

    @Test
    @DisplayName("deve lancar ServiceException quando periodo invalido")
    public void validarPeriodo_DeveLancarQuandoInicioMaiorQueFim() {
        Instant ini = Instant.parse("2026-02-10T00:00:00Z");
        Instant fim = Instant.parse("2026-02-01T00:00:00Z");
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.dashboard.periodoInvalido")).thenReturn("Periodo invalido");
        try {
            dashboardService.buscarResumo(ini, fim, null);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("Periodo invalido", e.getMessage());
        }

        verify(translationHubApi, times(1)).getMessage("br.com.senior.my_domain.my_service.dashboard.periodoInvalido");
        verifyNoInteractions(agendamentoRepository);
    }

    @Test
    @DisplayName("deve lancar ServiceException quando hemocentroId invalido")
    public void parseUuid_DeveLancarQuandoUuidInvalido() {
        Instant ini = Instant.parse("2026-02-01T00:00:00Z");
        Instant fim = Instant.parse("2026-02-10T00:00:00Z");

        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.dashboard.hemocentroIdInvalido")).thenReturn("UUID invalido");

        try {
            dashboardService.buscarSeriePorDia(ini, fim, "abc");
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("UUID invalido", e.getMessage());
        }

        verify(translationHubApi, times(1)).getMessage("br.com.senior.my_domain.my_service.dashboard.hemocentroIdInvalido");
        verifyNoInteractions(agendamentoRepository);
    }
}