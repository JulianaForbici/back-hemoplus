package br.com.senior.mydomain.myservice;

import java.util.List;

public class BuscarDashboardSerieAgendamentosPorDiaInputStringSerializer {
    
	public static final BuscarDashboardSerieAgendamentosPorDiaInputStringSerializer INSTANCE = new BuscarDashboardSerieAgendamentosPorDiaInputStringSerializer();
    
    public void serialize(BuscarDashboardSerieAgendamentosPorDiaInput buscarDashboardSerieAgendamentosPorDiaInput, StringBuilder sb, List<Object> appended) {
		sb.append(buscarDashboardSerieAgendamentosPorDiaInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(buscarDashboardSerieAgendamentosPorDiaInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(buscarDashboardSerieAgendamentosPorDiaInput);
		serializeDataInicio(buscarDashboardSerieAgendamentosPorDiaInput, sb);
		sb.append(", ");
		serializeDataFim(buscarDashboardSerieAgendamentosPorDiaInput, sb);
		sb.append(", ");
		serializeHemocentroId(buscarDashboardSerieAgendamentosPorDiaInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeDataInicio(BuscarDashboardSerieAgendamentosPorDiaInput buscarDashboardSerieAgendamentosPorDiaInput, StringBuilder sb) {
		sb.append("dataInicio=").append(buscarDashboardSerieAgendamentosPorDiaInput.dataInicio == null ? "null" : buscarDashboardSerieAgendamentosPorDiaInput.dataInicio);
	}
	
	protected void serializeDataFim(BuscarDashboardSerieAgendamentosPorDiaInput buscarDashboardSerieAgendamentosPorDiaInput, StringBuilder sb) {
		sb.append("dataFim=").append(buscarDashboardSerieAgendamentosPorDiaInput.dataFim == null ? "null" : buscarDashboardSerieAgendamentosPorDiaInput.dataFim);
	}
	
	protected void serializeHemocentroId(BuscarDashboardSerieAgendamentosPorDiaInput buscarDashboardSerieAgendamentosPorDiaInput, StringBuilder sb) {
		sb.append("hemocentroId=").append(buscarDashboardSerieAgendamentosPorDiaInput.hemocentroId == null ? "null" : buscarDashboardSerieAgendamentosPorDiaInput.hemocentroId);
	}
}
