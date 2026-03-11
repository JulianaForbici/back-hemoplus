package br.com.senior.mydomain.myservice.estoque;

import br.com.senior.mydomain.myservice.EstoqueEntity;
import br.com.senior.mydomain.myservice.HemocentroEntity;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.UUID;

@Repository
public class EstoqueRepositoryImpl implements EstoqueRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<EstoqueEntity> listarTipoSangueEmFalta(UUID hemocentroId) {

        final JPAQueryFactory queryFactory = new JPAQueryFactory(em);
        final PathBuilder<EstoqueEntity> e = new PathBuilder<>(EstoqueEntity.class, "estoque");
        final PathBuilder<HemocentroEntity> hemocentro = e.get("hemocentro", HemocentroEntity.class);
        final NumberPath<Long> quantidadeMl = e.getNumber("quantidadeMl", Long.class);
        final NumberPath<Long> minimoMl = e.getNumber("minimoMl", Long.class);
        final BooleanExpression filtro = hemocentro.get("id", UUID.class).eq(hemocentroId).and(quantidadeMl.lt(minimoMl));
        return queryFactory.selectFrom(e).where(filtro).fetch();
    }
}