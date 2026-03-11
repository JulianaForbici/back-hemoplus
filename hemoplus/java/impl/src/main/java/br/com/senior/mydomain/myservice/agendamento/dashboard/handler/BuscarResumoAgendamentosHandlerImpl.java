package br.com.senior.mydomain.myservice.agendamento.dashboard.handler;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.agendamento.dashboard.DashboardService;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import javax.inject.Inject;

@HandlerImpl
public class BuscarResumoAgendamentosHandlerImpl implements BuscarDashboardResumoAgendamentos {

    @Inject
    private DashboardService dashboardService;

    @Inject
    private TranslationHubApi translationHubApi;

    @Override
    public BuscarDashboardResumoAgendamentosOutput buscarDashboardResumoAgendamentos(BuscarDashboardResumoAgendamentosInput request) {

        if (request == null) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.dashboard.requisicaoInvalida"));
        }

        final DashboardResumoAgendamentos resumo = dashboardService.buscarResumo(request.dataInicio, request.dataFim, request.hemocentroId);

        BuscarDashboardResumoAgendamentosOutput out = new BuscarDashboardResumoAgendamentosOutput();
        out.retorno = retornoOk();
        out.resumo = resumo;
        return out;
    }

    private Retorno retornoOk() {
        Retorno r = new Retorno();
        r.mensagem = translationHubApi.getMessage("br.com.senior.my_domain.my_service.ok");
        r.contemErro = false;
        return r;
    }
}