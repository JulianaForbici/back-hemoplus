package br.com.senior.mydomain.myservice;

import java.util.List;

public class CancelarAgendamentoInputStringSerializer {
    
	public static final CancelarAgendamentoInputStringSerializer INSTANCE = new CancelarAgendamentoInputStringSerializer();
    
    public void serialize(CancelarAgendamentoInput cancelarAgendamentoInput, StringBuilder sb, List<Object> appended) {
		sb.append(cancelarAgendamentoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(cancelarAgendamentoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(cancelarAgendamentoInput);
		serializeAgendamentoId(cancelarAgendamentoInput, sb);
		sb.append(", ");
		serializeMotivo(cancelarAgendamentoInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeAgendamentoId(CancelarAgendamentoInput cancelarAgendamentoInput, StringBuilder sb) {
		sb.append("agendamentoId=").append(cancelarAgendamentoInput.agendamentoId == null ? "null" : cancelarAgendamentoInput.agendamentoId);
	}
	
	protected void serializeMotivo(CancelarAgendamentoInput cancelarAgendamentoInput, StringBuilder sb) {
		sb.append("motivo=").append(cancelarAgendamentoInput.motivo == null ? "null" : cancelarAgendamentoInput.motivo);
	}
}
