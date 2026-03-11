package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkEstoqueInputStringSerializer {
    
	public static final CreateBulkEstoqueInputStringSerializer INSTANCE = new CreateBulkEstoqueInputStringSerializer();
    
    public void serialize(CreateBulkEstoqueInput createBulkEstoqueInput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkEstoqueInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkEstoqueInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkEstoqueInput);
		serializeEntities(createBulkEstoqueInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEntities(CreateBulkEstoqueInput createBulkEstoqueInput, StringBuilder sb) {
		sb.append("entities=").append(createBulkEstoqueInput.entities == null ? "null" : createBulkEstoqueInput.entities);
	}
}
