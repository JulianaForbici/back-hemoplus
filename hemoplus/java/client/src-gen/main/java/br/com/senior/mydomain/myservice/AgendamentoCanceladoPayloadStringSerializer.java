package br.com.senior.mydomain.myservice;

import java.util.List;

public class AgendamentoCanceladoPayloadStringSerializer {
    
	public static final AgendamentoCanceladoPayloadStringSerializer INSTANCE = new AgendamentoCanceladoPayloadStringSerializer();
    
    public void serialize(AgendamentoCanceladoPayload agendamentoCanceladoPayload, StringBuilder sb, List<Object> appended) {
		sb.append(agendamentoCanceladoPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(agendamentoCanceladoPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(agendamentoCanceladoPayload);
		serializeAgendamentoId(agendamentoCanceladoPayload, sb);
		sb.append(", ");
		serializeUsuarioId(agendamentoCanceladoPayload, sb);
		sb.append(", ");
		serializeHemocentroId(agendamentoCanceladoPayload, sb);
		sb.append(", ");
		serializeDataHora(agendamentoCanceladoPayload, sb);
		sb.append(", ");
		serializeMotivo(agendamentoCanceladoPayload, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeAgendamentoId(AgendamentoCanceladoPayload agendamentoCanceladoPayload, StringBuilder sb) {
		sb.append("agendamentoId=").append(agendamentoCanceladoPayload.agendamentoId == null ? "null" : agendamentoCanceladoPayload.agendamentoId);
	}
	
	protected void serializeUsuarioId(AgendamentoCanceladoPayload agendamentoCanceladoPayload, StringBuilder sb) {
		sb.append("usuarioId=").append(agendamentoCanceladoPayload.usuarioId == null ? "null" : agendamentoCanceladoPayload.usuarioId);
	}
	
	protected void serializeHemocentroId(AgendamentoCanceladoPayload agendamentoCanceladoPayload, StringBuilder sb) {
		sb.append("hemocentroId=").append(agendamentoCanceladoPayload.hemocentroId == null ? "null" : agendamentoCanceladoPayload.hemocentroId);
	}
	
	protected void serializeDataHora(AgendamentoCanceladoPayload agendamentoCanceladoPayload, StringBuilder sb) {
		sb.append("dataHora=").append(agendamentoCanceladoPayload.dataHora == null ? "null" : agendamentoCanceladoPayload.dataHora);
	}
	
	protected void serializeMotivo(AgendamentoCanceladoPayload agendamentoCanceladoPayload, StringBuilder sb) {
		sb.append("motivo=").append(agendamentoCanceladoPayload.motivo == null ? "null" : agendamentoCanceladoPayload.motivo);
	}
}
