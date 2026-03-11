package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkAgendamentoOutputStringSerializer {
    
	public static final CreateBulkAgendamentoOutputStringSerializer INSTANCE = new CreateBulkAgendamentoOutputStringSerializer();
    
    public void serialize(CreateBulkAgendamentoOutput createBulkAgendamentoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkAgendamentoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkAgendamentoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkAgendamentoOutput);
		sb.append(']');
	}
	
}
