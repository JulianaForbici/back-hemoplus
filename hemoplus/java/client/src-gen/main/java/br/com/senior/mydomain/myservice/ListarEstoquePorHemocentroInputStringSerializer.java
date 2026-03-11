package br.com.senior.mydomain.myservice;

import java.util.List;

public class ListarEstoquePorHemocentroInputStringSerializer {
    
	public static final ListarEstoquePorHemocentroInputStringSerializer INSTANCE = new ListarEstoquePorHemocentroInputStringSerializer();
    
    public void serialize(ListarEstoquePorHemocentroInput listarEstoquePorHemocentroInput, StringBuilder sb, List<Object> appended) {
		sb.append(listarEstoquePorHemocentroInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(listarEstoquePorHemocentroInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(listarEstoquePorHemocentroInput);
		serializeHemocentroId(listarEstoquePorHemocentroInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeHemocentroId(ListarEstoquePorHemocentroInput listarEstoquePorHemocentroInput, StringBuilder sb) {
		sb.append("hemocentroId=").append(listarEstoquePorHemocentroInput.hemocentroId == null ? "null" : listarEstoquePorHemocentroInput.hemocentroId);
	}
}
