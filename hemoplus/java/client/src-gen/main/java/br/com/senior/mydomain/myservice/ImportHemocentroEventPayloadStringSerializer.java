package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportHemocentroEventPayloadStringSerializer {
    
	public static final ImportHemocentroEventPayloadStringSerializer INSTANCE = new ImportHemocentroEventPayloadStringSerializer();
    
    public void serialize(ImportHemocentroEventPayload importHemocentroEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(importHemocentroEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(importHemocentroEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importHemocentroEventPayload);
		serializeEventpl(importHemocentroEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ImportHemocentroEventPayload importHemocentroEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (importHemocentroEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			importHemocentroEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
