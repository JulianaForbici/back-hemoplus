package br.com.senior.mydomain.myservice.estoque.handler;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.estoque.EstoqueMapper;
import br.com.senior.mydomain.myservice.estoque.EstoqueService;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.springframework.transaction.annotation.Transactional;
import javax.inject.Inject;

@HandlerImpl
public class AjustarEstoqueHandlerImpl implements AjustarEstoque {

    @Inject
    private EstoqueService estoqueService;

    @Inject
    private TranslationHubApi translationHubApi;

    @Override
    @Transactional
    public AjustarEstoqueOutput ajustarEstoque(AjustarEstoqueInput request) {

        if (request == null) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.requisicao.obrigatoria"));
        }

        final Long deltaMl = toLongMlOrNull(request.deltaMl);
        final Long minimoMl = toLongMlOrNull(request.minimoMl);

        final EstoqueEntity salvo = estoqueService.ajustar(request.hemocentroId, request.tipoSangue, request.fatorRh,
                deltaMl,
                minimoMl);

        final Retorno retorno = new Retorno();
        retorno.mensagem = translationHubApi.getMessage("br.com.senior.my_domain.my_service.estoque.ajustar.sucesso");
        retorno.codigo = salvo.getId() != null ? salvo.getId().toString() : null;
        retorno.contemErro = false;
        final AjustarEstoqueOutput out = new AjustarEstoqueOutput();
        out.retorno = retorno;
        out.estoque = EstoqueMapper.toDto(salvo);
        return out;
    }

    private Long toLongMlOrNull(Double value) {
        if (value == null) return null;
        final long arredondado = Math.round(value);
        if (Double.compare(value, (double) arredondado) != 0) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.estoque.ajustar.apenasInteiro"));
        }
        return arredondado;
    }
}