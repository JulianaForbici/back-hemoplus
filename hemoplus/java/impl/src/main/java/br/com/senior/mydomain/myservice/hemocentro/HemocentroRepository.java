package br.com.senior.mydomain.myservice.hemocentro;

import br.com.senior.mydomain.myservice.HemocentroBaseRepository;
import br.com.senior.mydomain.myservice.HemocentroEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface HemocentroRepository extends HemocentroBaseRepository {

    List<HemocentroEntity> findByAtivoTrue();

    @Query("select h from my_domain.my_service.HemocentroEntity h " +
            "where (h.ativo = true or h.ativo is null) " +
            "and h.latitude is not null and h.longitude is not null " +
            "order by h.nome")
    List<HemocentroEntity> findAtivosComCoordenadas();
}
