package br.com.senior.mydomain.myservice.agendamento;

import br.com.senior.mydomain.myservice.AgendamentoBaseRepository;
import br.com.senior.mydomain.myservice.AgendamentoEntity;
import br.com.senior.mydomain.myservice.StatusAgendamento;
import org.springframework.stereotype.Repository;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface AgendamentoRepository extends AgendamentoBaseRepository, AgendamentoRepositoryCustom {

    Optional<AgendamentoEntity> findByToken(String token);

    boolean existsByUsuario_IdAndStatusIn(UUID usuarioId, List<StatusAgendamento> status);

    boolean existsByUsuario_IdAndDataHora(UUID usuarioId, Instant dataHora);

}