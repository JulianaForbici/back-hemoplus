package br.com.senior.mydomain.myservice;

import java.util.List;

public class CriarAgendamentoInputStringSerializer {
    
	public static final CriarAgendamentoInputStringSerializer INSTANCE = new CriarAgendamentoInputStringSerializer();
    
    public void serialize(CriarAgendamentoInput criarAgendamentoInput, StringBuilder sb, List<Object> appended) {
		sb.append(criarAgendamentoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(criarAgendamentoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(criarAgendamentoInput);
		serializeUsuarioId(criarAgendamentoInput, sb);
		sb.append(", ");
		serializeHemocentroId(criarAgendamentoInput, sb);
		sb.append(", ");
		serializeDataHora(criarAgendamentoInput, sb);
		sb.append(", ");
		serializeObservacao(criarAgendamentoInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeUsuarioId(CriarAgendamentoInput criarAgendamentoInput, StringBuilder sb) {
		sb.append("usuarioId=").append(criarAgendamentoInput.usuarioId == null ? "null" : criarAgendamentoInput.usuarioId);
	}
	
	protected void serializeHemocentroId(CriarAgendamentoInput criarAgendamentoInput, StringBuilder sb) {
		sb.append("hemocentroId=").append(criarAgendamentoInput.hemocentroId == null ? "null" : criarAgendamentoInput.hemocentroId);
	}
	
	protected void serializeDataHora(CriarAgendamentoInput criarAgendamentoInput, StringBuilder sb) {
		sb.append("dataHora=").append(criarAgendamentoInput.dataHora == null ? "null" : criarAgendamentoInput.dataHora);
	}
	
	protected void serializeObservacao(CriarAgendamentoInput criarAgendamentoInput, StringBuilder sb) {
		sb.append("observacao=").append(criarAgendamentoInput.observacao == null ? "null" : criarAgendamentoInput.observacao);
	}
}
