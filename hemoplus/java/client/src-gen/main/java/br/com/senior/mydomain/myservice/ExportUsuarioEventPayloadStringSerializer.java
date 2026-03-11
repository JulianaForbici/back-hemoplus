package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportUsuarioEventPayloadStringSerializer {
    
	public static final ExportUsuarioEventPayloadStringSerializer INSTANCE = new ExportUsuarioEventPayloadStringSerializer();
    
    public void serialize(ExportUsuarioEventPayload exportUsuarioEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(exportUsuarioEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportUsuarioEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportUsuarioEventPayload);
		serializeEventpl(exportUsuarioEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ExportUsuarioEventPayload exportUsuarioEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (exportUsuarioEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			exportUsuarioEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
