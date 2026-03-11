package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkDoacaoInputStringSerializer {
    
	public static final CreateBulkDoacaoInputStringSerializer INSTANCE = new CreateBulkDoacaoInputStringSerializer();
    
    public void serialize(CreateBulkDoacaoInput createBulkDoacaoInput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkDoacaoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkDoacaoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkDoacaoInput);
		serializeEntities(createBulkDoacaoInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEntities(CreateBulkDoacaoInput createBulkDoacaoInput, StringBuilder sb) {
		sb.append("entities=").append(createBulkDoacaoInput.entities == null ? "null" : createBulkDoacaoInput.entities);
	}
}
