package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportUsuarioEventPayloadStringSerializer {
    
	public static final ImportUsuarioEventPayloadStringSerializer INSTANCE = new ImportUsuarioEventPayloadStringSerializer();
    
    public void serialize(ImportUsuarioEventPayload importUsuarioEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(importUsuarioEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(importUsuarioEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importUsuarioEventPayload);
		serializeEventpl(importUsuarioEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ImportUsuarioEventPayload importUsuarioEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (importUsuarioEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			importUsuarioEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
