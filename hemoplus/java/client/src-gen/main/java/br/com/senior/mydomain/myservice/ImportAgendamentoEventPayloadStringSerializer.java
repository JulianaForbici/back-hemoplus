package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportAgendamentoEventPayloadStringSerializer {
    
	public static final ImportAgendamentoEventPayloadStringSerializer INSTANCE = new ImportAgendamentoEventPayloadStringSerializer();
    
    public void serialize(ImportAgendamentoEventPayload importAgendamentoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(importAgendamentoEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(importAgendamentoEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importAgendamentoEventPayload);
		serializeEventpl(importAgendamentoEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ImportAgendamentoEventPayload importAgendamentoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (importAgendamentoEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			importAgendamentoEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
