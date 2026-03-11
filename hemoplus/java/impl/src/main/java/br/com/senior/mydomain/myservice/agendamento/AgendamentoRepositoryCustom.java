package br.com.senior.mydomain.myservice.agendamento;

import br.com.senior.mydomain.myservice.AgendamentoEntity;
import br.com.senior.mydomain.myservice.DashboardResumoAgendamentos;
import br.com.senior.mydomain.myservice.DashboardSerieDia;
import br.com.senior.mydomain.myservice.StatusAgendamento;
import org.springframework.stereotype.Repository;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Repository
public interface AgendamentoRepositoryCustom {

    List<AgendamentoEntity> listarPorPeriodo(
            Instant inicio,
            Instant fim,
            UUID usuarioId,
            UUID hemocentroId,
            StatusAgendamento status);

    DashboardResumoAgendamentos buscarDashboardResumoAgendamentos(
            Instant dataInicio,
            Instant dataFim,
            UUID hemocentroId);

    List<DashboardSerieDia> buscarDashboardSerieAgendamentosPorDia(
            Instant dataInicio,
            Instant dataFim,
            UUID hemocentroId);
}