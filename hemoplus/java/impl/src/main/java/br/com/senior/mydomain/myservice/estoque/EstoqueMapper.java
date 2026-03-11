package br.com.senior.mydomain.myservice.estoque;

import br.com.senior.mydomain.myservice.Estoque;
import br.com.senior.mydomain.myservice.EstoqueEntity;

public final class EstoqueMapper {

    private EstoqueMapper() {
    }

    public static Estoque toDto(EstoqueEntity e) {
        if (e == null) return null;

        final Estoque dto = new Estoque();
        dto.id = e.getId() != null ? e.getId().toString() : null;
        dto.tipoSangue = e.getTipoSangue();
        dto.fatorRh = e.getFatorRh();
        dto.quantidadeMl = e.getQuantidadeMl();
        dto.minimoMl = e.getMinimoMl();
        dto.dataAtualizacao = e.getDataAtualizacao();
        dto.hemocentro = null;
        return dto;
    }
}