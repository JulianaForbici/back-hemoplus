package br.com.senior.mydomain.myservice.agendamento;

import br.com.senior.mydomain.myservice.AgendamentoEntity;
import br.com.senior.mydomain.myservice.StatusAgendamento;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import br.com.senior.mydomain.myservice.DashboardResumoAgendamentos;
import br.com.senior.mydomain.myservice.DashboardSerieDia;
import br.com.senior.mydomain.myservice.QAgendamentoEntity;
import br.com.senior.mydomain.myservice.QHemocentroEntity;
import com.querydsl.core.Tuple;
import com.querydsl.core.types.dsl.CaseBuilder;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.jpa.impl.JPAQuery;
import java.sql.Date;

@Repository
public class AgendamentoRepositoryImpl implements AgendamentoRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<AgendamentoEntity> listarPorPeriodo(Instant inicio, Instant fim, UUID usuarioId, UUID hemocentroId, StatusAgendamento status
    ) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<AgendamentoEntity> cq = cb.createQuery(AgendamentoEntity.class);

        Root<AgendamentoEntity> a = cq.from(AgendamentoEntity.class);

        List<Predicate> predicates = new ArrayList<>();
        predicates.add(cb.between(a.get("dataHora"), inicio, fim));

        if (usuarioId != null) {
            predicates.add(cb.equal(a.get("usuario").get("id"), usuarioId));
        }
        if (hemocentroId != null) {
            predicates.add(cb.equal(a.get("hemocentro").get("id"), hemocentroId));
        }
        if (status != null) {
            predicates.add(cb.equal(a.get("status"), status));
        }

        cq.where(predicates.toArray(new Predicate[0]));
        cq.orderBy(cb.asc(a.get("dataHora")));
        TypedQuery<AgendamentoEntity> q = em.createQuery(cq);
        return q.getResultList();
    }

    // querydsl >> dashboard resumo por periodo com jpaquery + qentities
    @Override
    public DashboardResumoAgendamentos buscarDashboardResumoAgendamentos(
            Instant dataInicio,
            Instant dataFim,
            UUID hemocentroId
    ) {
        QAgendamentoEntity a = QAgendamentoEntity.agendamentoEntity;
        QHemocentroEntity h = QHemocentroEntity.hemocentroEntity;

        var pendentesCase = new CaseBuilder().when(a.status.eq(StatusAgendamento.PENDENTE)).then(1L).otherwise(0L);
        var confirmadosCase = new CaseBuilder().when(a.status.eq(StatusAgendamento.CONFIRMADO)).then(1L).otherwise(0L);
        var canceladosCase = new CaseBuilder().when(a.status.eq(StatusAgendamento.CANCELADO)).then(1L).otherwise(0L);
        var compareceuCase = new CaseBuilder().when(a.status.eq(StatusAgendamento.COMPARECEU)).then(1L).otherwise(0L);
        var naoCompareceuCase = new CaseBuilder().when(a.status.eq(StatusAgendamento.NAO_COMPARECEU)).then(1L).otherwise(0L);

        JPAQuery<Tuple> q = new JPAQuery<>(em);
        q.from(a).leftJoin(a.hemocentro, h);

        if (dataInicio != null) q.where(a.dataHora.goe(dataInicio));
        if (dataFim != null) q.where(a.dataHora.loe(dataFim));
        if (hemocentroId != null) q.where(h.id.eq(hemocentroId));

        Tuple t = q.select(a.id.count(), pendentesCase.sum(), confirmadosCase.sum(), canceladosCase.sum(),
                compareceuCase.sum(),
                naoCompareceuCase.sum()).fetchOne();

        Long total = (t == null || t.get(a.id.count()) == null) ? 0L : t.get(a.id.count());
        Long pendentes = (t == null || t.get(pendentesCase.sum()) == null) ? 0L : t.get(pendentesCase.sum());
        Long confirmados = (t == null || t.get(confirmadosCase.sum()) == null) ? 0L : t.get(confirmadosCase.sum());
        Long cancelados = (t == null || t.get(canceladosCase.sum()) == null) ? 0L : t.get(canceladosCase.sum());
        Long compareceu = (t == null || t.get(compareceuCase.sum()) == null) ? 0L : t.get(compareceuCase.sum());
        Long naoCompareceu = (t == null || t.get(naoCompareceuCase.sum()) == null) ? 0L : t.get(naoCompareceuCase.sum());

        double taxa = (compareceu + naoCompareceu) == 0 ? 0.0 : (double) compareceu / (compareceu + naoCompareceu);

        DashboardResumoAgendamentos r = new DashboardResumoAgendamentos();
        r.total = total;
        r.pendentes = pendentes;
        r.confirmados = confirmados;
        r.cancelados = cancelados;
        r.compareceu = compareceu;
        r.naoCompareceu = naoCompareceu;
        r.taxaComparecimento = taxa;

        return r;
    }

    @Override
    public List<DashboardSerieDia> buscarDashboardSerieAgendamentosPorDia(
            Instant dataInicio,
            Instant dataFim,
            UUID hemocentroId
    ) {
        QAgendamentoEntity a = QAgendamentoEntity.agendamentoEntity;
        QHemocentroEntity h = QHemocentroEntity.hemocentroEntity;

        var confirmadosCase = new CaseBuilder().when(a.status.eq(StatusAgendamento.CONFIRMADO)).then(1L).otherwise(0L);
        var canceladosCase = new CaseBuilder().when(a.status.eq(StatusAgendamento.CANCELADO)).then(1L).otherwise(0L);
        var compareceuCase = new CaseBuilder().when(a.status.eq(StatusAgendamento.COMPARECEU)).then(1L).otherwise(0L);
        var naoCompareceuCase = new CaseBuilder().when(a.status.eq(StatusAgendamento.NAO_COMPARECEU)).then(1L).otherwise(0L);

        var diaExpr = Expressions.dateTemplate(Date.class, "cast(date_trunc('day', {0}) as date)", a.dataHora);
        JPAQuery<Tuple> q = new JPAQuery<>(em);
        q.from(a).leftJoin(a.hemocentro, h);
        if (dataInicio != null) q.where(a.dataHora.goe(dataInicio));
        if (dataFim != null) q.where(a.dataHora.loe(dataFim));
        if (hemocentroId != null) q.where(h.id.eq(hemocentroId));

        List<Tuple> rows = q.select(diaExpr, a.id.count(), confirmadosCase.sum(), canceladosCase.sum(), compareceuCase.sum(),
                        naoCompareceuCase.sum()).groupBy(diaExpr).orderBy(diaExpr.asc()).fetch();

        List<DashboardSerieDia> out = new ArrayList<>();

        for (Tuple t : rows) {
            Date diaSql = t.get(diaExpr);
            DashboardSerieDia d = new DashboardSerieDia();
            d.dia = diaSql == null ? null : diaSql.toLocalDate();
            d.total = (t.get(a.id.count()) == null) ? 0L : t.get(a.id.count());
            d.confirmados = (t.get(confirmadosCase.sum()) == null) ? 0L : t.get(confirmadosCase.sum());
            d.cancelados = (t.get(canceladosCase.sum()) == null) ? 0L : t.get(canceladosCase.sum());
            d.compareceu = (t.get(compareceuCase.sum()) == null) ? 0L : t.get(compareceuCase.sum());
            d.naoCompareceu = (t.get(naoCompareceuCase.sum()) == null) ? 0L : t.get(naoCompareceuCase.sum());
            out.add(d);
        }
        return out;
    }
}