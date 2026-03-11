package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportAgendamentoEventPayloadStringSerializer {
    
	public static final ExportAgendamentoEventPayloadStringSerializer INSTANCE = new ExportAgendamentoEventPayloadStringSerializer();
    
    public void serialize(ExportAgendamentoEventPayload exportAgendamentoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(exportAgendamentoEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportAgendamentoEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportAgendamentoEventPayload);
		serializeEventpl(exportAgendamentoEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ExportAgendamentoEventPayload exportAgendamentoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (exportAgendamentoEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			exportAgendamentoEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
