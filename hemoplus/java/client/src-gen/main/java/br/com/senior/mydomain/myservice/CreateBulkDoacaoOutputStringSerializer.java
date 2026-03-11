package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkDoacaoOutputStringSerializer {
    
	public static final CreateBulkDoacaoOutputStringSerializer INSTANCE = new CreateBulkDoacaoOutputStringSerializer();
    
    public void serialize(CreateBulkDoacaoOutput createBulkDoacaoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkDoacaoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkDoacaoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkDoacaoOutput);
		sb.append(']');
	}
	
}
