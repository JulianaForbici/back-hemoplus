package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkAgendamentoInputStringSerializer {
    
	public static final CreateBulkAgendamentoInputStringSerializer INSTANCE = new CreateBulkAgendamentoInputStringSerializer();
    
    public void serialize(CreateBulkAgendamentoInput createBulkAgendamentoInput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkAgendamentoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkAgendamentoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkAgendamentoInput);
		serializeEntities(createBulkAgendamentoInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEntities(CreateBulkAgendamentoInput createBulkAgendamentoInput, StringBuilder sb) {
		sb.append("entities=").append(createBulkAgendamentoInput.entities == null ? "null" : createBulkAgendamentoInput.entities);
	}
}
