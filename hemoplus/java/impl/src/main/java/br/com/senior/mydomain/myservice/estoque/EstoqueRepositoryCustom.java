package br.com.senior.mydomain.myservice.estoque;

import br.com.senior.mydomain.myservice.EstoqueEntity;
import java.util.List;
import java.util.UUID;

public interface EstoqueRepositoryCustom {

    List<EstoqueEntity> listarTipoSangueEmFalta(UUID hemocentroId);
}
