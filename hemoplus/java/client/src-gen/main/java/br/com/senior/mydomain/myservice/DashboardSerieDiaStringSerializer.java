package br.com.senior.mydomain.myservice;

import java.util.List;

public class DashboardSerieDiaStringSerializer {
    
	public static final DashboardSerieDiaStringSerializer INSTANCE = new DashboardSerieDiaStringSerializer();
    
    public void serialize(DashboardSerieDia dashboardSerieDia, StringBuilder sb, List<Object> appended) {
		sb.append(dashboardSerieDia.getClass().getSimpleName()).append(" [");
		if (appended.contains(dashboardSerieDia)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(dashboardSerieDia);
		serializeDia(dashboardSerieDia, sb);
		sb.append(", ");
		serializeTotal(dashboardSerieDia, sb);
		sb.append(", ");
		serializeConfirmados(dashboardSerieDia, sb);
		sb.append(", ");
		serializeCancelados(dashboardSerieDia, sb);
		sb.append(", ");
		serializeCompareceu(dashboardSerieDia, sb);
		sb.append(", ");
		serializeNaoCompareceu(dashboardSerieDia, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeDia(DashboardSerieDia dashboardSerieDia, StringBuilder sb) {
		sb.append("dia=").append(dashboardSerieDia.dia == null ? "null" : dashboardSerieDia.dia);
	}
	
	protected void serializeTotal(DashboardSerieDia dashboardSerieDia, StringBuilder sb) {
		sb.append("total=").append(dashboardSerieDia.total == null ? "null" : dashboardSerieDia.total);
	}
	
	protected void serializeConfirmados(DashboardSerieDia dashboardSerieDia, StringBuilder sb) {
		sb.append("confirmados=").append(dashboardSerieDia.confirmados == null ? "null" : dashboardSerieDia.confirmados);
	}
	
	protected void serializeCancelados(DashboardSerieDia dashboardSerieDia, StringBuilder sb) {
		sb.append("cancelados=").append(dashboardSerieDia.cancelados == null ? "null" : dashboardSerieDia.cancelados);
	}
	
	protected void serializeCompareceu(DashboardSerieDia dashboardSerieDia, StringBuilder sb) {
		sb.append("compareceu=").append(dashboardSerieDia.compareceu == null ? "null" : dashboardSerieDia.compareceu);
	}
	
	protected void serializeNaoCompareceu(DashboardSerieDia dashboardSerieDia, StringBuilder sb) {
		sb.append("naoCompareceu=").append(dashboardSerieDia.naoCompareceu == null ? "null" : dashboardSerieDia.naoCompareceu);
	}
}
