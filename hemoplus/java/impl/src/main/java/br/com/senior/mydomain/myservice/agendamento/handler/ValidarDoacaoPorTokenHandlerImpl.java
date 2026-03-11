package br.com.senior.mydomain.myservice.agendamento.handler;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.doacao.DoacaoService;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.springframework.transaction.annotation.Transactional;
import javax.inject.Inject;

@HandlerImpl
public class ValidarDoacaoPorTokenHandlerImpl implements ValidarDoacaoPorToken {

    @Inject
    private DoacaoService doacaoService;

    @Inject
    private TranslationHubApi translationHubApi;

    @Override
    @Transactional
    public ValidarDoacaoPorTokenOutput validarDoacaoPorToken(ValidarDoacaoPorTokenInput request) {

        final DoacaoEntity doacaoSalva = doacaoService.validarPorToken(
                request != null ? request.token : null, request != null ? request.responsavelValidacao : null);

        String mensagem =
                translationHubApi.getMessage("br.com.senior.my_domain.my_service.doacao.validarPorToken.sucesso");

        if (doacaoService.estoqueAbaixoDoMinimoAposDoacao(doacaoSalva)) {
            mensagem = mensagem + " " +
                    translationHubApi.getMessage("br.com.senior.my_domain.my_service.estoque.doacao.abaixoDoMinimo");
        }

        final Retorno retorno = new Retorno();
        retorno.mensagem = mensagem;
        retorno.codigo = doacaoSalva.getId() != null ? doacaoSalva.getId().toString() : null;
        retorno.contemErro = false;

        final ValidarDoacaoPorTokenOutput out = new ValidarDoacaoPorTokenOutput();
        out.retorno = retorno;
        out.doacao = toDto(doacaoSalva);
        return out;
    }

    private Doacao toDto(DoacaoEntity e) {
        final Doacao dto = new Doacao();
        dto.id = e.getId() != null ? e.getId().toString() : null;
        dto.dataHoraConfirmacao = e.getDataHoraConfirmacao();
        dto.responsavelValidacao = e.getResponsavelValidacao();
        dto.usuario = null;
        dto.hemocentro = null;
        dto.agendamento = null;
        return dto;
    }
}