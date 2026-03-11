package br.com.senior.mydomain.myservice;

import java.util.List;

public class CriarAgendamentoOutputStringSerializer {
    
	public static final CriarAgendamentoOutputStringSerializer INSTANCE = new CriarAgendamentoOutputStringSerializer();
    
    public void serialize(CriarAgendamentoOutput criarAgendamentoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(criarAgendamentoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(criarAgendamentoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(criarAgendamentoOutput);
		serializeRetorno(criarAgendamentoOutput, sb, appended);
		sb.append(", ");
		serializeAgendamento(criarAgendamentoOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeRetorno(CriarAgendamentoOutput criarAgendamentoOutput, StringBuilder sb, List<Object> appended) {
		sb.append("retorno=<");
		if (criarAgendamentoOutput.retorno == null) {
			sb.append("null");
		} else {
			criarAgendamentoOutput.retorno.toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeAgendamento(CriarAgendamentoOutput criarAgendamentoOutput, StringBuilder sb, List<Object> appended) {
		sb.append("agendamento=<");
		if (criarAgendamentoOutput.agendamento == null) {
			sb.append("null");
		} else {
			criarAgendamentoOutput.agendamento.toString(sb, appended);
		}
		sb.append('>');
	}
}
