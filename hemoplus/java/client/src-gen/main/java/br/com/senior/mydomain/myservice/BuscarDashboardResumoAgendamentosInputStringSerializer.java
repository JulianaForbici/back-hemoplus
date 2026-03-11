package br.com.senior.mydomain.myservice;

import java.util.List;

public class BuscarDashboardResumoAgendamentosInputStringSerializer {
    
	public static final BuscarDashboardResumoAgendamentosInputStringSerializer INSTANCE = new BuscarDashboardResumoAgendamentosInputStringSerializer();
    
    public void serialize(BuscarDashboardResumoAgendamentosInput buscarDashboardResumoAgendamentosInput, StringBuilder sb, List<Object> appended) {
		sb.append(buscarDashboardResumoAgendamentosInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(buscarDashboardResumoAgendamentosInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(buscarDashboardResumoAgendamentosInput);
		serializeDataInicio(buscarDashboardResumoAgendamentosInput, sb);
		sb.append(", ");
		serializeDataFim(buscarDashboardResumoAgendamentosInput, sb);
		sb.append(", ");
		serializeHemocentroId(buscarDashboardResumoAgendamentosInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeDataInicio(BuscarDashboardResumoAgendamentosInput buscarDashboardResumoAgendamentosInput, StringBuilder sb) {
		sb.append("dataInicio=").append(buscarDashboardResumoAgendamentosInput.dataInicio == null ? "null" : buscarDashboardResumoAgendamentosInput.dataInicio);
	}
	
	protected void serializeDataFim(BuscarDashboardResumoAgendamentosInput buscarDashboardResumoAgendamentosInput, StringBuilder sb) {
		sb.append("dataFim=").append(buscarDashboardResumoAgendamentosInput.dataFim == null ? "null" : buscarDashboardResumoAgendamentosInput.dataFim);
	}
	
	protected void serializeHemocentroId(BuscarDashboardResumoAgendamentosInput buscarDashboardResumoAgendamentosInput, StringBuilder sb) {
		sb.append("hemocentroId=").append(buscarDashboardResumoAgendamentosInput.hemocentroId == null ? "null" : buscarDashboardResumoAgendamentosInput.hemocentroId);
	}
}
