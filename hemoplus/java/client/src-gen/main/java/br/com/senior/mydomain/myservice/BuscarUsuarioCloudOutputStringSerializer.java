package br.com.senior.mydomain.myservice;

import java.util.List;

public class BuscarUsuarioCloudOutputStringSerializer {
    
	public static final BuscarUsuarioCloudOutputStringSerializer INSTANCE = new BuscarUsuarioCloudOutputStringSerializer();
    
    public void serialize(BuscarUsuarioCloudOutput buscarUsuarioCloudOutput, StringBuilder sb, List<Object> appended) {
		sb.append(buscarUsuarioCloudOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(buscarUsuarioCloudOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(buscarUsuarioCloudOutput);
		serializeUsuario(buscarUsuarioCloudOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeUsuario(BuscarUsuarioCloudOutput buscarUsuarioCloudOutput, StringBuilder sb, List<Object> appended) {
		sb.append("usuario=<");
		if (buscarUsuarioCloudOutput.usuario == null) {
			sb.append("null");
		} else {
			buscarUsuarioCloudOutput.usuario.toString(sb, appended);
		}
		sb.append('>');
	}
}
