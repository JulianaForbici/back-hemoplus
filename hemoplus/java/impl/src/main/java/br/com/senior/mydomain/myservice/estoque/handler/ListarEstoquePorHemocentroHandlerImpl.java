package br.com.senior.mydomain.myservice.estoque.handler;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.estoque.EstoqueMapper;
import br.com.senior.mydomain.myservice.estoque.EstoqueService;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@HandlerImpl
public class ListarEstoquePorHemocentroHandlerImpl implements ListarEstoquePorHemocentro {

    @Inject
    private EstoqueService estoqueService;

    @Inject
    private TranslationHubApi translationHubApi;

    @Override
    public ListarEstoquePorHemocentroOutput listarEstoquePorHemocentro(ListarEstoquePorHemocentroInput request) {

        if (request == null || request.hemocentroId == null || request.hemocentroId.isBlank()) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.hemocentro.obrigatorio"));
        }

        final List<EstoqueEntity> entities = estoqueService.listarPorHemocentro(request.hemocentroId);
        final List<Estoque> resultado = entities.stream().map(EstoqueMapper::toDto).collect(Collectors.toList());
        return new ListarEstoquePorHemocentroOutput(resultado);
    }
}