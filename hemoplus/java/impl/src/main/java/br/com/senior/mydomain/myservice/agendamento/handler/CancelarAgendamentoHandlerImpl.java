package br.com.senior.mydomain.myservice.agendamento.handler;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.agendamento.AgendamentoMapper;
import br.com.senior.mydomain.myservice.agendamento.AgendamentoService;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.springframework.transaction.annotation.Transactional;
import javax.inject.Inject;

@HandlerImpl
public class CancelarAgendamentoHandlerImpl implements CancelarAgendamento {

    @Inject
    private AgendamentoService agendamentoService;

    @Inject
    private TranslationHubApi translationHubApi;

    @Override
    @Transactional
    public CancelarAgendamentoOutput cancelarAgendamento(CancelarAgendamentoInput request) {

        if (request == null || request.agendamentoId == null || request.agendamentoId.isBlank()) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.agendamento.obrigatorio"));
        }

        final AgendamentoEntity salvo = agendamentoService.cancelar(request.agendamentoId, request.motivo);
        final Retorno retorno = new Retorno();
        retorno.mensagem = translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.cancelar.sucesso");
        retorno.codigo = salvo.getId() != null ? salvo.getId().toString() : null;
        retorno.contemErro = false;
        final CancelarAgendamentoOutput out = new CancelarAgendamentoOutput();
        out.retorno = retorno;
        out.agendamento = AgendamentoMapper.toDto(salvo);
        return out;
    }
}