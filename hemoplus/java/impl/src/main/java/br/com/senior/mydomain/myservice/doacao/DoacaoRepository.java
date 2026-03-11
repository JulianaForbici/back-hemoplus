package br.com.senior.mydomain.myservice.doacao;

import br.com.senior.mydomain.myservice.DoacaoBaseRepository;
import br.com.senior.mydomain.myservice.DoacaoEntity;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface DoacaoRepository extends DoacaoBaseRepository {
    DoacaoEntity findTopByUsuario_IdOrderByDataHoraConfirmacaoDesc(UUID usuarioId);
}
