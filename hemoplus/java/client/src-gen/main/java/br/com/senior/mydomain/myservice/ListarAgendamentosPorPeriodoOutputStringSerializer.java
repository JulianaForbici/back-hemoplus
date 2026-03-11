package br.com.senior.mydomain.myservice;

import java.util.List;

public class ListarAgendamentosPorPeriodoOutputStringSerializer {
    
	public static final ListarAgendamentosPorPeriodoOutputStringSerializer INSTANCE = new ListarAgendamentosPorPeriodoOutputStringSerializer();
    
    public void serialize(ListarAgendamentosPorPeriodoOutput listarAgendamentosPorPeriodoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(listarAgendamentosPorPeriodoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(listarAgendamentosPorPeriodoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(listarAgendamentosPorPeriodoOutput);
		serializeResultado(listarAgendamentosPorPeriodoOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeResultado(ListarAgendamentosPorPeriodoOutput listarAgendamentosPorPeriodoOutput, StringBuilder sb, List<Object> appended) {
		sb.append("resultado=<");
		if (listarAgendamentosPorPeriodoOutput.resultado == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = listarAgendamentosPorPeriodoOutput.resultado.size() - 1;
			for (int i = 0; i <= last; i++) {
				listarAgendamentosPorPeriodoOutput.resultado.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}
