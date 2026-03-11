package br.com.senior.mydomain.myservice;

import java.util.List;

public class ListarPontosMapaInputStringSerializer {
    
	public static final ListarPontosMapaInputStringSerializer INSTANCE = new ListarPontosMapaInputStringSerializer();
    
    public void serialize(ListarPontosMapaInput listarPontosMapaInput, StringBuilder sb, List<Object> appended) {
		sb.append(listarPontosMapaInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(listarPontosMapaInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(listarPontosMapaInput);
		serializeUsuarioId(listarPontosMapaInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeUsuarioId(ListarPontosMapaInput listarPontosMapaInput, StringBuilder sb) {
		sb.append("usuarioId=").append(listarPontosMapaInput.usuarioId == null ? "null" : listarPontosMapaInput.usuarioId);
	}
}
