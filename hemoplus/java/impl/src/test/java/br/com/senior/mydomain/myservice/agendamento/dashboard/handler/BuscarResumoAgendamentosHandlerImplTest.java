package br.com.senior.mydomain.myservice.agendamento.dashboard.handler;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.BuscarDashboardResumoAgendamentosInput;
import br.com.senior.mydomain.myservice.BuscarDashboardResumoAgendamentosOutput;
import br.com.senior.mydomain.myservice.DashboardResumoAgendamentos;
import br.com.senior.mydomain.myservice.agendamento.dashboard.DashboardService;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.time.Instant;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class BuscarResumoAgendamentosHandlerImplTest {

    @Mock
    private DashboardService dashboardService;

    @Mock
    private TranslationHubApi translationHubApi;

    @InjectMocks
    private BuscarResumoAgendamentosHandlerImpl handler;

    @Test
    @DisplayName("Deve lançar ServiceException quando request for nulo")
    public void deveLancarQuandoRequestNulo() {
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.dashboard.requisicaoInvalida")).thenReturn("Requisição inválida");

        try {
            handler.buscarDashboardResumoAgendamentos(null);
            fail("Esperava ServiceException");
        } catch (ServiceException e) {
            assertEquals(ErrorCategory.BAD_REQUEST, e.getCategory());
            assertEquals("Requisição inválida", e.getMessage());
        }

        verify(translationHubApi, times(1)).getMessage("br.com.senior.my_domain.my_service.dashboard.requisicaoInvalida");
        verifyNoInteractions(dashboardService);
    }

    @Test
    @DisplayName("Deve retornar retorno ok e resumo quando request válido")
    public void deveRetornarResumoQuandoRequestValido() {
        BuscarDashboardResumoAgendamentosInput in = new BuscarDashboardResumoAgendamentosInput();
        in.dataInicio = Instant.parse("2026-02-01T00:00:00Z");
        in.dataFim = Instant.parse("2026-02-10T00:00:00Z");
        in.hemocentroId = "123";
        DashboardResumoAgendamentos resumo = new DashboardResumoAgendamentos();
        when(dashboardService.buscarResumo(in.dataInicio, in.dataFim, in.hemocentroId)).thenReturn(resumo);
        when(translationHubApi.getMessage("br.com.senior.my_domain.my_service.ok")).thenReturn("OK");

        BuscarDashboardResumoAgendamentosOutput out = handler.buscarDashboardResumoAgendamentos(in);

        assertNotNull(out);
        assertNotNull(out.retorno);
        assertEquals("OK", out.retorno.mensagem);
        assertFalse(Boolean.TRUE.equals(out.retorno.contemErro));
        assertEquals(resumo, out.resumo);

        verify(dashboardService, times(1)).buscarResumo(in.dataInicio, in.dataFim, in.hemocentroId);
        verify(translationHubApi, times(1)).getMessage("br.com.senior.my_domain.my_service.ok");
    }
}