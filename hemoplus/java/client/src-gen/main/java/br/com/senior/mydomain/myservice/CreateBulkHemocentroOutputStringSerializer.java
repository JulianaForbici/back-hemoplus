package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkHemocentroOutputStringSerializer {
    
	public static final CreateBulkHemocentroOutputStringSerializer INSTANCE = new CreateBulkHemocentroOutputStringSerializer();
    
    public void serialize(CreateBulkHemocentroOutput createBulkHemocentroOutput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkHemocentroOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkHemocentroOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkHemocentroOutput);
		sb.append(']');
	}
	
}
