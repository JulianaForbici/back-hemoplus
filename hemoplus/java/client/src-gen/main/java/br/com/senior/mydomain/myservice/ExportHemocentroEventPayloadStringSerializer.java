package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportHemocentroEventPayloadStringSerializer {
    
	public static final ExportHemocentroEventPayloadStringSerializer INSTANCE = new ExportHemocentroEventPayloadStringSerializer();
    
    public void serialize(ExportHemocentroEventPayload exportHemocentroEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(exportHemocentroEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportHemocentroEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportHemocentroEventPayload);
		serializeEventpl(exportHemocentroEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ExportHemocentroEventPayload exportHemocentroEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (exportHemocentroEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			exportHemocentroEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
