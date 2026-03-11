package br.com.senior.mydomain.myservice.agendamento.dashboard;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.DashboardResumoAgendamentos;
import br.com.senior.mydomain.myservice.DashboardSerieDia;
import br.com.senior.mydomain.myservice.agendamento.AgendamentoRepository;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.springframework.stereotype.Service;
import javax.inject.Inject;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Service
public class DashboardService {

    @Inject
    private AgendamentoRepository agendamentoRepository;

    @Inject
    private TranslationHubApi translationHubApi;

    public DashboardResumoAgendamentos buscarResumo(Instant dataInicio, Instant dataFim, String hemocentroIdStr) {

        validarPeriodo(dataInicio, dataFim);

        final UUID hemocentroId = parseUuidOrNull(hemocentroIdStr, "br.com.senior.my_domain.my_service.dashboard.hemocentroIdInvalido");

        return agendamentoRepository.buscarDashboardResumoAgendamentos(dataInicio, dataFim, hemocentroId);
    }

    public List<DashboardSerieDia> buscarSeriePorDia(Instant dataInicio, Instant dataFim, String hemocentroIdStr) {

        validarPeriodo(dataInicio, dataFim);

        final UUID hemocentroId = parseUuidOrNull(hemocentroIdStr, "br.com.senior.my_domain.my_service.dashboard.hemocentroIdInvalido");

        return agendamentoRepository.buscarDashboardSerieAgendamentosPorDia(dataInicio, dataFim, hemocentroId);
    }

    private void validarPeriodo(Instant inicio, Instant fim) {
        if (inicio != null && fim != null && inicio.isAfter(fim)) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.dashboard.periodoInvalido"));
        }
    }

    private UUID parseUuidOrNull(String value, String keyErro) {
        if (value == null || value.trim().isEmpty()) {
            return null;
        } try {
            return UUID.fromString(value.trim());
        } catch (Exception e) {
             throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage(keyErro));
        }
    }
}