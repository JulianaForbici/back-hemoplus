package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkUsuarioInputStringSerializer {
    
	public static final CreateBulkUsuarioInputStringSerializer INSTANCE = new CreateBulkUsuarioInputStringSerializer();
    
    public void serialize(CreateBulkUsuarioInput createBulkUsuarioInput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkUsuarioInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkUsuarioInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkUsuarioInput);
		serializeEntities(createBulkUsuarioInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEntities(CreateBulkUsuarioInput createBulkUsuarioInput, StringBuilder sb) {
		sb.append("entities=").append(createBulkUsuarioInput.entities == null ? "null" : createBulkUsuarioInput.entities);
	}
}
