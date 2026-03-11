package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportUsuarioInputStringSerializer {
    
	public static final ExportUsuarioInputStringSerializer INSTANCE = new ExportUsuarioInputStringSerializer();
    
    public void serialize(ExportUsuarioInput exportUsuarioInput, StringBuilder sb, List<Object> appended) {
		sb.append(exportUsuarioInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportUsuarioInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportUsuarioInput);
		serializeConfig(exportUsuarioInput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeConfig(ExportUsuarioInput exportUsuarioInput, StringBuilder sb, List<Object> appended) {
		sb.append("config=<");
		if (exportUsuarioInput.config == null) {
			sb.append("null");
		} else {
			exportUsuarioInput.config.toString(sb, appended);
		}
		sb.append('>');
	}
}
