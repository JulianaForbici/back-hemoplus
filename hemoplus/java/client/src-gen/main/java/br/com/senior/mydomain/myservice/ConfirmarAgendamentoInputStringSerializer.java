package br.com.senior.mydomain.myservice;

import java.util.List;

public class ConfirmarAgendamentoInputStringSerializer {
    
	public static final ConfirmarAgendamentoInputStringSerializer INSTANCE = new ConfirmarAgendamentoInputStringSerializer();
    
    public void serialize(ConfirmarAgendamentoInput confirmarAgendamentoInput, StringBuilder sb, List<Object> appended) {
		sb.append(confirmarAgendamentoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(confirmarAgendamentoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(confirmarAgendamentoInput);
		serializeAgendamentoId(confirmarAgendamentoInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeAgendamentoId(ConfirmarAgendamentoInput confirmarAgendamentoInput, StringBuilder sb) {
		sb.append("agendamentoId=").append(confirmarAgendamentoInput.agendamentoId == null ? "null" : confirmarAgendamentoInput.agendamentoId);
	}
}
