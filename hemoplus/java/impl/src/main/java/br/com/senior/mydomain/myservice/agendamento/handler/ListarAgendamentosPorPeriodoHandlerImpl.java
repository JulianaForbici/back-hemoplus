package br.com.senior.mydomain.myservice.agendamento.handler;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.Agendamento;
import br.com.senior.mydomain.myservice.AgendamentoEntity;
import br.com.senior.mydomain.myservice.ListarAgendamentosPorPeriodo;
import br.com.senior.mydomain.myservice.ListarAgendamentosPorPeriodoInput;
import br.com.senior.mydomain.myservice.ListarAgendamentosPorPeriodoOutput;
import br.com.senior.mydomain.myservice.agendamento.AgendamentoMapper;
import br.com.senior.mydomain.myservice.agendamento.AgendamentoService;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import javax.inject.Inject;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@HandlerImpl
public class ListarAgendamentosPorPeriodoHandlerImpl implements ListarAgendamentosPorPeriodo {

    @Inject
    private AgendamentoService agendamentoService;

    @Inject
    private TranslationHubApi translationHubApi;

    @Override
    public ListarAgendamentosPorPeriodoOutput listarAgendamentosPorPeriodo(ListarAgendamentosPorPeriodoInput request) {

        if (request == null || request.dataInicio == null) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.listarPorPeriodo.param.dataInicio.obrigatoria"));
        }

        if (request.dataFim == null) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.listarPorPeriodo.param.dataFim.obrigatoria"));
        }

        final Instant inicio = request.dataInicio;
        final Instant fim = request.dataFim;

        if (inicio.isAfter(fim)) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.agendamento.listarPorPeriodo.param.periodo.invalido"));
        }

        final UUID usuarioId = parseUuidOrNull(request.usuarioId, "br.com.senior.my_domain.my_service.agendamento.listarPorPeriodo.param.usuarioId.invalido");
        final UUID hemocentroId = parseUuidOrNull(request.hemocentroId, "br.com.senior.my_domain.my_service.agendamento.listarPorPeriodo.param.hemocentroId.invalido");
        final List<AgendamentoEntity> entities = agendamentoService.listarPorPeriodo(inicio, fim, usuarioId, hemocentroId, request.status);
        final List<Agendamento> resultado = entities.stream().map(AgendamentoMapper::toDto).collect(Collectors.toList());
        return new ListarAgendamentosPorPeriodoOutput(resultado);
    }

    private UUID parseUuidOrNull(String value, String keyErroTraducao) {
        if (value == null || value.isBlank()) return null;
        try { return UUID.fromString(value.trim()); }
        catch (Exception e) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage(keyErroTraducao));
        }
    }
}