package br.com.senior.mydomain.myservice;

import java.util.List;

public class AgendamentoCriadoPayloadStringSerializer {
    
	public static final AgendamentoCriadoPayloadStringSerializer INSTANCE = new AgendamentoCriadoPayloadStringSerializer();
    
    public void serialize(AgendamentoCriadoPayload agendamentoCriadoPayload, StringBuilder sb, List<Object> appended) {
		sb.append(agendamentoCriadoPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(agendamentoCriadoPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(agendamentoCriadoPayload);
		serializeAgendamentoId(agendamentoCriadoPayload, sb);
		sb.append(", ");
		serializeUsuarioId(agendamentoCriadoPayload, sb);
		sb.append(", ");
		serializeHemocentroId(agendamentoCriadoPayload, sb);
		sb.append(", ");
		serializeDataHora(agendamentoCriadoPayload, sb);
		sb.append(", ");
		serializeStatus(agendamentoCriadoPayload, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeAgendamentoId(AgendamentoCriadoPayload agendamentoCriadoPayload, StringBuilder sb) {
		sb.append("agendamentoId=").append(agendamentoCriadoPayload.agendamentoId == null ? "null" : agendamentoCriadoPayload.agendamentoId);
	}
	
	protected void serializeUsuarioId(AgendamentoCriadoPayload agendamentoCriadoPayload, StringBuilder sb) {
		sb.append("usuarioId=").append(agendamentoCriadoPayload.usuarioId == null ? "null" : agendamentoCriadoPayload.usuarioId);
	}
	
	protected void serializeHemocentroId(AgendamentoCriadoPayload agendamentoCriadoPayload, StringBuilder sb) {
		sb.append("hemocentroId=").append(agendamentoCriadoPayload.hemocentroId == null ? "null" : agendamentoCriadoPayload.hemocentroId);
	}
	
	protected void serializeDataHora(AgendamentoCriadoPayload agendamentoCriadoPayload, StringBuilder sb) {
		sb.append("dataHora=").append(agendamentoCriadoPayload.dataHora == null ? "null" : agendamentoCriadoPayload.dataHora);
	}
	
	protected void serializeStatus(AgendamentoCriadoPayload agendamentoCriadoPayload, StringBuilder sb) {
		sb.append("status=").append(agendamentoCriadoPayload.status == null ? "null" : agendamentoCriadoPayload.status);
	}
}
