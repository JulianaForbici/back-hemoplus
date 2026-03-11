package br.com.senior.mydomain.myservice;

import java.util.List;

public class BuscarDashboardResumoAgendamentosOutputStringSerializer {
    
	public static final BuscarDashboardResumoAgendamentosOutputStringSerializer INSTANCE = new BuscarDashboardResumoAgendamentosOutputStringSerializer();
    
    public void serialize(BuscarDashboardResumoAgendamentosOutput buscarDashboardResumoAgendamentosOutput, StringBuilder sb, List<Object> appended) {
		sb.append(buscarDashboardResumoAgendamentosOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(buscarDashboardResumoAgendamentosOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(buscarDashboardResumoAgendamentosOutput);
		serializeRetorno(buscarDashboardResumoAgendamentosOutput, sb, appended);
		sb.append(", ");
		serializeResumo(buscarDashboardResumoAgendamentosOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeRetorno(BuscarDashboardResumoAgendamentosOutput buscarDashboardResumoAgendamentosOutput, StringBuilder sb, List<Object> appended) {
		sb.append("retorno=<");
		if (buscarDashboardResumoAgendamentosOutput.retorno == null) {
			sb.append("null");
		} else {
			buscarDashboardResumoAgendamentosOutput.retorno.toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeResumo(BuscarDashboardResumoAgendamentosOutput buscarDashboardResumoAgendamentosOutput, StringBuilder sb, List<Object> appended) {
		sb.append("resumo=<");
		if (buscarDashboardResumoAgendamentosOutput.resumo == null) {
			sb.append("null");
		} else {
			buscarDashboardResumoAgendamentosOutput.resumo.toString(sb, appended);
		}
		sb.append('>');
	}
}
