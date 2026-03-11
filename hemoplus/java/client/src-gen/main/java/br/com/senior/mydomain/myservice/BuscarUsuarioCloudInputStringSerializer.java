package br.com.senior.mydomain.myservice;

import java.util.List;

public class BuscarUsuarioCloudInputStringSerializer {
    
	public static final BuscarUsuarioCloudInputStringSerializer INSTANCE = new BuscarUsuarioCloudInputStringSerializer();
    
    public void serialize(BuscarUsuarioCloudInput buscarUsuarioCloudInput, StringBuilder sb, List<Object> appended) {
		sb.append(buscarUsuarioCloudInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(buscarUsuarioCloudInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(buscarUsuarioCloudInput);
		serializeUsuarioCloud(buscarUsuarioCloudInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeUsuarioCloud(BuscarUsuarioCloudInput buscarUsuarioCloudInput, StringBuilder sb) {
		sb.append("usuarioCloud=").append(buscarUsuarioCloudInput.usuarioCloud == null ? "null" : buscarUsuarioCloudInput.usuarioCloud);
	}
}
