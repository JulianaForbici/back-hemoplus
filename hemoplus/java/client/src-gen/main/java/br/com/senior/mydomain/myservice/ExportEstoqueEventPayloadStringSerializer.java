package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportEstoqueEventPayloadStringSerializer {
    
	public static final ExportEstoqueEventPayloadStringSerializer INSTANCE = new ExportEstoqueEventPayloadStringSerializer();
    
    public void serialize(ExportEstoqueEventPayload exportEstoqueEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(exportEstoqueEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportEstoqueEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportEstoqueEventPayload);
		serializeEventpl(exportEstoqueEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ExportEstoqueEventPayload exportEstoqueEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (exportEstoqueEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			exportEstoqueEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
