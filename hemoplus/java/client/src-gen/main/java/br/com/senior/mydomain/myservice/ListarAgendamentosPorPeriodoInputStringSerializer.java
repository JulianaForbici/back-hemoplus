package br.com.senior.mydomain.myservice;

import java.util.List;

public class ListarAgendamentosPorPeriodoInputStringSerializer {
    
	public static final ListarAgendamentosPorPeriodoInputStringSerializer INSTANCE = new ListarAgendamentosPorPeriodoInputStringSerializer();
    
    public void serialize(ListarAgendamentosPorPeriodoInput listarAgendamentosPorPeriodoInput, StringBuilder sb, List<Object> appended) {
		sb.append(listarAgendamentosPorPeriodoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(listarAgendamentosPorPeriodoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(listarAgendamentosPorPeriodoInput);
		serializeUsuarioId(listarAgendamentosPorPeriodoInput, sb);
		sb.append(", ");
		serializeHemocentroId(listarAgendamentosPorPeriodoInput, sb);
		sb.append(", ");
		serializeStatus(listarAgendamentosPorPeriodoInput, sb);
		sb.append(", ");
		serializeDataInicio(listarAgendamentosPorPeriodoInput, sb);
		sb.append(", ");
		serializeDataFim(listarAgendamentosPorPeriodoInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeUsuarioId(ListarAgendamentosPorPeriodoInput listarAgendamentosPorPeriodoInput, StringBuilder sb) {
		sb.append("usuarioId=").append(listarAgendamentosPorPeriodoInput.usuarioId == null ? "null" : listarAgendamentosPorPeriodoInput.usuarioId);
	}
	
	protected void serializeHemocentroId(ListarAgendamentosPorPeriodoInput listarAgendamentosPorPeriodoInput, StringBuilder sb) {
		sb.append("hemocentroId=").append(listarAgendamentosPorPeriodoInput.hemocentroId == null ? "null" : listarAgendamentosPorPeriodoInput.hemocentroId);
	}
	
	protected void serializeStatus(ListarAgendamentosPorPeriodoInput listarAgendamentosPorPeriodoInput, StringBuilder sb) {
		sb.append("status=").append(listarAgendamentosPorPeriodoInput.status == null ? "null" : listarAgendamentosPorPeriodoInput.status);
	}
	
	protected void serializeDataInicio(ListarAgendamentosPorPeriodoInput listarAgendamentosPorPeriodoInput, StringBuilder sb) {
		sb.append("dataInicio=").append(listarAgendamentosPorPeriodoInput.dataInicio == null ? "null" : listarAgendamentosPorPeriodoInput.dataInicio);
	}
	
	protected void serializeDataFim(ListarAgendamentosPorPeriodoInput listarAgendamentosPorPeriodoInput, StringBuilder sb) {
		sb.append("dataFim=").append(listarAgendamentosPorPeriodoInput.dataFim == null ? "null" : listarAgendamentosPorPeriodoInput.dataFim);
	}
}
