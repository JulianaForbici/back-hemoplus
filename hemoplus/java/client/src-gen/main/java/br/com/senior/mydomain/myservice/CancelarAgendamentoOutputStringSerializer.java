package br.com.senior.mydomain.myservice;

import java.util.List;

public class CancelarAgendamentoOutputStringSerializer {
    
	public static final CancelarAgendamentoOutputStringSerializer INSTANCE = new CancelarAgendamentoOutputStringSerializer();
    
    public void serialize(CancelarAgendamentoOutput cancelarAgendamentoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(cancelarAgendamentoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(cancelarAgendamentoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(cancelarAgendamentoOutput);
		serializeRetorno(cancelarAgendamentoOutput, sb, appended);
		sb.append(", ");
		serializeAgendamento(cancelarAgendamentoOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeRetorno(CancelarAgendamentoOutput cancelarAgendamentoOutput, StringBuilder sb, List<Object> appended) {
		sb.append("retorno=<");
		if (cancelarAgendamentoOutput.retorno == null) {
			sb.append("null");
		} else {
			cancelarAgendamentoOutput.retorno.toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeAgendamento(CancelarAgendamentoOutput cancelarAgendamentoOutput, StringBuilder sb, List<Object> appended) {
		sb.append("agendamento=<");
		if (cancelarAgendamentoOutput.agendamento == null) {
			sb.append("null");
		} else {
			cancelarAgendamentoOutput.agendamento.toString(sb, appended);
		}
		sb.append('>');
	}
}
