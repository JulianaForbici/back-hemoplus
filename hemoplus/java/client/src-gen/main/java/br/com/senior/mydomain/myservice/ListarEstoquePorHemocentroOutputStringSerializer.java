package br.com.senior.mydomain.myservice;

import java.util.List;

public class ListarEstoquePorHemocentroOutputStringSerializer {
    
	public static final ListarEstoquePorHemocentroOutputStringSerializer INSTANCE = new ListarEstoquePorHemocentroOutputStringSerializer();
    
    public void serialize(ListarEstoquePorHemocentroOutput listarEstoquePorHemocentroOutput, StringBuilder sb, List<Object> appended) {
		sb.append(listarEstoquePorHemocentroOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(listarEstoquePorHemocentroOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(listarEstoquePorHemocentroOutput);
		serializeResultado(listarEstoquePorHemocentroOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeResultado(ListarEstoquePorHemocentroOutput listarEstoquePorHemocentroOutput, StringBuilder sb, List<Object> appended) {
		sb.append("resultado=<");
		if (listarEstoquePorHemocentroOutput.resultado == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = listarEstoquePorHemocentroOutput.resultado.size() - 1;
			for (int i = 0; i <= last; i++) {
				listarEstoquePorHemocentroOutput.resultado.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}
