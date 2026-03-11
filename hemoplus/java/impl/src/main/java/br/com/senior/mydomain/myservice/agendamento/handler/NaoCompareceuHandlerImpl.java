package br.com.senior.mydomain.myservice.agendamento.handler;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.agendamento.AgendamentoService;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.springframework.transaction.annotation.Transactional;
import javax.inject.Inject;

@HandlerImpl
public class NaoCompareceuHandlerImpl implements MarcarNaoCompareceuPorPeriodo {

    @Inject
    private AgendamentoService agendamentoService;

    @Inject
    private TranslationHubApi translationHubApi;

    @Override
    @Transactional
    public MarcarNaoCompareceuPorPeriodoOutput marcarNaoCompareceuPorPeriodo(MarcarNaoCompareceuPorPeriodoInput request) {

        if (request == null || request.agendamentoId == null || request.agendamentoId.isBlank()) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.agendamento.obrigatorio"));
        }

        final AgendamentoEntity salvo = agendamentoService.marcarNaoCompareceu(request.agendamentoId);
        final Retorno retorno = new Retorno();
        retorno.mensagem = translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.naoCompareceu.sucesso");
        retorno.codigo = salvo.getId() != null ? salvo.getId().toString() : null;
        retorno.contemErro = false;
        final MarcarNaoCompareceuPorPeriodoOutput out = new MarcarNaoCompareceuPorPeriodoOutput();
        out.retorno = retorno;

        return out;
    }
}