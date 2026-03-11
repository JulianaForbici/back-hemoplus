package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportEstoqueEventPayloadStringSerializer {
    
	public static final ImportEstoqueEventPayloadStringSerializer INSTANCE = new ImportEstoqueEventPayloadStringSerializer();
    
    public void serialize(ImportEstoqueEventPayload importEstoqueEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(importEstoqueEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(importEstoqueEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importEstoqueEventPayload);
		serializeEventpl(importEstoqueEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ImportEstoqueEventPayload importEstoqueEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (importEstoqueEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			importEstoqueEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
