package br.com.senior.mydomain.myservice;

import java.util.List;

public class DashboardResumoAgendamentosStringSerializer {
    
	public static final DashboardResumoAgendamentosStringSerializer INSTANCE = new DashboardResumoAgendamentosStringSerializer();
    
    public void serialize(DashboardResumoAgendamentos dashboardResumoAgendamentos, StringBuilder sb, List<Object> appended) {
		sb.append(dashboardResumoAgendamentos.getClass().getSimpleName()).append(" [");
		if (appended.contains(dashboardResumoAgendamentos)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(dashboardResumoAgendamentos);
		serializeTotal(dashboardResumoAgendamentos, sb);
		sb.append(", ");
		serializePendentes(dashboardResumoAgendamentos, sb);
		sb.append(", ");
		serializeConfirmados(dashboardResumoAgendamentos, sb);
		sb.append(", ");
		serializeCancelados(dashboardResumoAgendamentos, sb);
		sb.append(", ");
		serializeCompareceu(dashboardResumoAgendamentos, sb);
		sb.append(", ");
		serializeNaoCompareceu(dashboardResumoAgendamentos, sb);
		sb.append(", ");
		serializeTaxaComparecimento(dashboardResumoAgendamentos, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeTotal(DashboardResumoAgendamentos dashboardResumoAgendamentos, StringBuilder sb) {
		sb.append("total=").append(dashboardResumoAgendamentos.total == null ? "null" : dashboardResumoAgendamentos.total);
	}
	
	protected void serializePendentes(DashboardResumoAgendamentos dashboardResumoAgendamentos, StringBuilder sb) {
		sb.append("pendentes=").append(dashboardResumoAgendamentos.pendentes == null ? "null" : dashboardResumoAgendamentos.pendentes);
	}
	
	protected void serializeConfirmados(DashboardResumoAgendamentos dashboardResumoAgendamentos, StringBuilder sb) {
		sb.append("confirmados=").append(dashboardResumoAgendamentos.confirmados == null ? "null" : dashboardResumoAgendamentos.confirmados);
	}
	
	protected void serializeCancelados(DashboardResumoAgendamentos dashboardResumoAgendamentos, StringBuilder sb) {
		sb.append("cancelados=").append(dashboardResumoAgendamentos.cancelados == null ? "null" : dashboardResumoAgendamentos.cancelados);
	}
	
	protected void serializeCompareceu(DashboardResumoAgendamentos dashboardResumoAgendamentos, StringBuilder sb) {
		sb.append("compareceu=").append(dashboardResumoAgendamentos.compareceu == null ? "null" : dashboardResumoAgendamentos.compareceu);
	}
	
	protected void serializeNaoCompareceu(DashboardResumoAgendamentos dashboardResumoAgendamentos, StringBuilder sb) {
		sb.append("naoCompareceu=").append(dashboardResumoAgendamentos.naoCompareceu == null ? "null" : dashboardResumoAgendamentos.naoCompareceu);
	}
	
	protected void serializeTaxaComparecimento(DashboardResumoAgendamentos dashboardResumoAgendamentos, StringBuilder sb) {
		sb.append("taxaComparecimento=").append(dashboardResumoAgendamentos.taxaComparecimento == null ? "null" : dashboardResumoAgendamentos.taxaComparecimento);
	}
}
