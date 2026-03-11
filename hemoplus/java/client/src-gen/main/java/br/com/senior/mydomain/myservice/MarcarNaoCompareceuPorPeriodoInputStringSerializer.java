package br.com.senior.mydomain.myservice;

import java.util.List;

public class MarcarNaoCompareceuPorPeriodoInputStringSerializer {
    
	public static final MarcarNaoCompareceuPorPeriodoInputStringSerializer INSTANCE = new MarcarNaoCompareceuPorPeriodoInputStringSerializer();
    
    public void serialize(MarcarNaoCompareceuPorPeriodoInput marcarNaoCompareceuPorPeriodoInput, StringBuilder sb, List<Object> appended) {
		sb.append(marcarNaoCompareceuPorPeriodoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(marcarNaoCompareceuPorPeriodoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(marcarNaoCompareceuPorPeriodoInput);
		serializeAgendamentoId(marcarNaoCompareceuPorPeriodoInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeAgendamentoId(MarcarNaoCompareceuPorPeriodoInput marcarNaoCompareceuPorPeriodoInput, StringBuilder sb) {
		sb.append("agendamentoId=").append(marcarNaoCompareceuPorPeriodoInput.agendamentoId == null ? "null" : marcarNaoCompareceuPorPeriodoInput.agendamentoId);
	}
}
