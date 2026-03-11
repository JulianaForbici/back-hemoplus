package br.com.senior.mydomain.myservice;

import java.util.List;

public class ListarTiposEmFaltaInputStringSerializer {
    
	public static final ListarTiposEmFaltaInputStringSerializer INSTANCE = new ListarTiposEmFaltaInputStringSerializer();
    
    public void serialize(ListarTiposEmFaltaInput listarTiposEmFaltaInput, StringBuilder sb, List<Object> appended) {
		sb.append(listarTiposEmFaltaInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(listarTiposEmFaltaInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(listarTiposEmFaltaInput);
		serializeHemocentroId(listarTiposEmFaltaInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeHemocentroId(ListarTiposEmFaltaInput listarTiposEmFaltaInput, StringBuilder sb) {
		sb.append("hemocentroId=").append(listarTiposEmFaltaInput.hemocentroId == null ? "null" : listarTiposEmFaltaInput.hemocentroId);
	}
}
