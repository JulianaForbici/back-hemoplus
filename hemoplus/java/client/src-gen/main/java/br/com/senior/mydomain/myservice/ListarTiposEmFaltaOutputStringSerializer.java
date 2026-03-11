package br.com.senior.mydomain.myservice;

import java.util.List;

public class ListarTiposEmFaltaOutputStringSerializer {
    
	public static final ListarTiposEmFaltaOutputStringSerializer INSTANCE = new ListarTiposEmFaltaOutputStringSerializer();
    
    public void serialize(ListarTiposEmFaltaOutput listarTiposEmFaltaOutput, StringBuilder sb, List<Object> appended) {
		sb.append(listarTiposEmFaltaOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(listarTiposEmFaltaOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(listarTiposEmFaltaOutput);
		serializeResultado(listarTiposEmFaltaOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeResultado(ListarTiposEmFaltaOutput listarTiposEmFaltaOutput, StringBuilder sb, List<Object> appended) {
		sb.append("resultado=<");
		if (listarTiposEmFaltaOutput.resultado == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = listarTiposEmFaltaOutput.resultado.size() - 1;
			for (int i = 0; i <= last; i++) {
				listarTiposEmFaltaOutput.resultado.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}
