package br.com.senior.mydomain.myservice.estoque;

import br.com.senior.mydomain.myservice.EstoqueBaseRepository;
import br.com.senior.mydomain.myservice.EstoqueEntity;
import br.com.senior.mydomain.myservice.FatorRh;
import br.com.senior.mydomain.myservice.TipoSangue;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface EstoqueRepository extends EstoqueBaseRepository, EstoqueRepositoryCustom {

    List<EstoqueEntity> findByHemocentroId(UUID hemocentroId);

    @Query("select e from my_domain.my_service.EstoqueEntity e " +
            "where e.hemocentro.id = :hemocentroId " +
            "and e.quantidadeMl < e.minimoMl")
    List<EstoqueEntity> findAbaixoDoMinimo(@Param("hemocentroId") UUID hemocentroId);

    @Query("select e from my_domain.my_service.EstoqueEntity e " +
            "where e.hemocentro.id = :hemocentroId " +
            "and e.tipoSangue = :tipoSangue " +
            "and e.fatorRh = :fatorRh")
    List<EstoqueEntity> findByKey(@Param("hemocentroId") UUID hemocentroId, @Param("tipoSangue") TipoSangue tipoSangue,
                                  @Param("fatorRh") FatorRh fatorRh);

    Optional<EstoqueEntity> findByHemocentroIdAndTipoSangueAndFatorRh(UUID hemocentroId, TipoSangue tipoSangue, FatorRh fatorRh);
}