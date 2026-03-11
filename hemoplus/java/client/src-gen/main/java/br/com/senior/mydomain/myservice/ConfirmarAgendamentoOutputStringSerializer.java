package br.com.senior.mydomain.myservice;

import java.util.List;

public class ConfirmarAgendamentoOutputStringSerializer {
    
	public static final ConfirmarAgendamentoOutputStringSerializer INSTANCE = new ConfirmarAgendamentoOutputStringSerializer();
    
    public void serialize(ConfirmarAgendamentoOutput confirmarAgendamentoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(confirmarAgendamentoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(confirmarAgendamentoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(confirmarAgendamentoOutput);
		serializeRetorno(confirmarAgendamentoOutput, sb, appended);
		sb.append(", ");
		serializeAgendamento(confirmarAgendamentoOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeRetorno(ConfirmarAgendamentoOutput confirmarAgendamentoOutput, StringBuilder sb, List<Object> appended) {
		sb.append("retorno=<");
		if (confirmarAgendamentoOutput.retorno == null) {
			sb.append("null");
		} else {
			confirmarAgendamentoOutput.retorno.toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeAgendamento(ConfirmarAgendamentoOutput confirmarAgendamentoOutput, StringBuilder sb, List<Object> appended) {
		sb.append("agendamento=<");
		if (confirmarAgendamentoOutput.agendamento == null) {
			sb.append("null");
		} else {
			confirmarAgendamentoOutput.agendamento.toString(sb, appended);
		}
		sb.append('>');
	}
}
