package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkHemocentroInputStringSerializer {
    
	public static final CreateBulkHemocentroInputStringSerializer INSTANCE = new CreateBulkHemocentroInputStringSerializer();
    
    public void serialize(CreateBulkHemocentroInput createBulkHemocentroInput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkHemocentroInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkHemocentroInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkHemocentroInput);
		serializeEntities(createBulkHemocentroInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEntities(CreateBulkHemocentroInput createBulkHemocentroInput, StringBuilder sb) {
		sb.append("entities=").append(createBulkHemocentroInput.entities == null ? "null" : createBulkHemocentroInput.entities);
	}
}
