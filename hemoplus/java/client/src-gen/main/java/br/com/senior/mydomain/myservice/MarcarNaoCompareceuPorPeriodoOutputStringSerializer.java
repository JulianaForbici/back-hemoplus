package br.com.senior.mydomain.myservice;

import java.util.List;

public class MarcarNaoCompareceuPorPeriodoOutputStringSerializer {
    
	public static final MarcarNaoCompareceuPorPeriodoOutputStringSerializer INSTANCE = new MarcarNaoCompareceuPorPeriodoOutputStringSerializer();
    
    public void serialize(MarcarNaoCompareceuPorPeriodoOutput marcarNaoCompareceuPorPeriodoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(marcarNaoCompareceuPorPeriodoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(marcarNaoCompareceuPorPeriodoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(marcarNaoCompareceuPorPeriodoOutput);
		serializeRetorno(marcarNaoCompareceuPorPeriodoOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeRetorno(MarcarNaoCompareceuPorPeriodoOutput marcarNaoCompareceuPorPeriodoOutput, StringBuilder sb, List<Object> appended) {
		sb.append("retorno=<");
		if (marcarNaoCompareceuPorPeriodoOutput.retorno == null) {
			sb.append("null");
		} else {
			marcarNaoCompareceuPorPeriodoOutput.retorno.toString(sb, appended);
		}
		sb.append('>');
	}
}
