package br.com.senior.mydomain.myservice;

import java.util.List;

public class BuscarDashboardSerieAgendamentosPorDiaOutputStringSerializer {
    
	public static final BuscarDashboardSerieAgendamentosPorDiaOutputStringSerializer INSTANCE = new BuscarDashboardSerieAgendamentosPorDiaOutputStringSerializer();
    
    public void serialize(BuscarDashboardSerieAgendamentosPorDiaOutput buscarDashboardSerieAgendamentosPorDiaOutput, StringBuilder sb, List<Object> appended) {
		sb.append(buscarDashboardSerieAgendamentosPorDiaOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(buscarDashboardSerieAgendamentosPorDiaOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(buscarDashboardSerieAgendamentosPorDiaOutput);
		serializeRetorno(buscarDashboardSerieAgendamentosPorDiaOutput, sb, appended);
		sb.append(", ");
		serializeItens(buscarDashboardSerieAgendamentosPorDiaOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeRetorno(BuscarDashboardSerieAgendamentosPorDiaOutput buscarDashboardSerieAgendamentosPorDiaOutput, StringBuilder sb, List<Object> appended) {
		sb.append("retorno=<");
		if (buscarDashboardSerieAgendamentosPorDiaOutput.retorno == null) {
			sb.append("null");
		} else {
			buscarDashboardSerieAgendamentosPorDiaOutput.retorno.toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeItens(BuscarDashboardSerieAgendamentosPorDiaOutput buscarDashboardSerieAgendamentosPorDiaOutput, StringBuilder sb, List<Object> appended) {
		sb.append("itens=<");
		if (buscarDashboardSerieAgendamentosPorDiaOutput.itens == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = buscarDashboardSerieAgendamentosPorDiaOutput.itens.size() - 1;
			for (int i = 0; i <= last; i++) {
				buscarDashboardSerieAgendamentosPorDiaOutput.itens.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}
