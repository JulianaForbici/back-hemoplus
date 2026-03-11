package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportDoacaoEventPayloadStringSerializer {
    
	public static final ExportDoacaoEventPayloadStringSerializer INSTANCE = new ExportDoacaoEventPayloadStringSerializer();
    
    public void serialize(ExportDoacaoEventPayload exportDoacaoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(exportDoacaoEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportDoacaoEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportDoacaoEventPayload);
		serializeEventpl(exportDoacaoEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ExportDoacaoEventPayload exportDoacaoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (exportDoacaoEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			exportDoacaoEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
