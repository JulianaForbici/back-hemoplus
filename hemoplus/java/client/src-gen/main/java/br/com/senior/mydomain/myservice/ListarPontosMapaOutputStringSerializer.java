package br.com.senior.mydomain.myservice;

import java.util.List;

public class ListarPontosMapaOutputStringSerializer {
    
	public static final ListarPontosMapaOutputStringSerializer INSTANCE = new ListarPontosMapaOutputStringSerializer();
    
    public void serialize(ListarPontosMapaOutput listarPontosMapaOutput, StringBuilder sb, List<Object> appended) {
		sb.append(listarPontosMapaOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(listarPontosMapaOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(listarPontosMapaOutput);
		serializeDados(listarPontosMapaOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeDados(ListarPontosMapaOutput listarPontosMapaOutput, StringBuilder sb, List<Object> appended) {
		sb.append("dados=<");
		if (listarPontosMapaOutput.dados == null) {
			sb.append("null");
		} else {
			listarPontosMapaOutput.dados.toString(sb, appended);
		}
		sb.append('>');
	}
}
