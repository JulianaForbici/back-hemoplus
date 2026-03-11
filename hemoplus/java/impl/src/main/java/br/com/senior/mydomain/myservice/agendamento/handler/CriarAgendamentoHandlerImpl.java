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
public class CriarAgendamentoHandlerImpl implements CriarAgendamento {

    @Inject
    private AgendamentoService agendamentoService;

    @Inject
    private TranslationHubApi translationHubApi;

    @Override
    @Transactional
    public CriarAgendamentoOutput criarAgendamento(CriarAgendamentoInput request) {

        if (request == null) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.requisicao.obrigatoria"));
        }

        if (request.usuarioId == null || request.usuarioId.isBlank()) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.criar.usuarioIdObrigatorio"));
        }

        if (request.hemocentroId == null || request.hemocentroId.isBlank()) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.hemocentro.obrigatorio"));
        }

        if (request.dataHora == null) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.criar.dataHoraObrigatoria"));
        }

        final AgendamentoEntity salvo = agendamentoService.criar(request.usuarioId, request.hemocentroId, request.dataHora, request.observacao);
        final Retorno retorno = new Retorno();
        retorno.mensagem = translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.criar.sucesso");
        retorno.codigo = salvo.getId() != null ? salvo.getId().toString() : null;
        retorno.contemErro = false;
        final CriarAgendamentoOutput out = new CriarAgendamentoOutput();
        out.retorno = retorno;
        out.agendamento = AgendamentoMapper.toDto(salvo);
        return out;
    }
}