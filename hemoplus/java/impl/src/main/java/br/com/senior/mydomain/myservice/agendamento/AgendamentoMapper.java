package br.com.senior.mydomain.myservice.agendamento;
import br.com.senior.mydomain.myservice.Agendamento;
import br.com.senior.mydomain.myservice.AgendamentoEntity;

public final class AgendamentoMapper {

    private AgendamentoMapper() {}

    public static Agendamento toDto(AgendamentoEntity e) {
        if (e == null) return null;

        final Agendamento dto = new Agendamento();
        dto.id = e.getId() != null ? e.getId().toString() : null;
        dto.dataHora = e.getDataHora();
        dto.status = e.getStatus();
        dto.observacao = e.getObservacao();
        dto.motivoStatus = e.getMotivoStatus();
        dto.dataCriacao = e.getDataCriacao();
        dto.dataAtualizacao = e.getDataAtualizacao();
        dto.token = e.getToken();
        dto.tokenExpiraEm = e.getTokenExpiraEm();
        dto.tokenUsadoEm = e.getTokenUsadoEm();
        dto.usuario = null;
        dto.hemocentro = null;
        dto.doacoes = null;
        return dto;
    }
}