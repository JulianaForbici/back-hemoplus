package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportDoacaoEventPayloadStringSerializer {
    
	public static final ImportDoacaoEventPayloadStringSerializer INSTANCE = new ImportDoacaoEventPayloadStringSerializer();
    
    public void serialize(ImportDoacaoEventPayload importDoacaoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(importDoacaoEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(importDoacaoEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importDoacaoEventPayload);
		serializeEventpl(importDoacaoEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ImportDoacaoEventPayload importDoacaoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (importDoacaoEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			importDoacaoEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
