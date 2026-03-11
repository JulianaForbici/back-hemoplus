package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkEstoqueOutputStringSerializer {
    
	public static final CreateBulkEstoqueOutputStringSerializer INSTANCE = new CreateBulkEstoqueOutputStringSerializer();
    
    public void serialize(CreateBulkEstoqueOutput createBulkEstoqueOutput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkEstoqueOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkEstoqueOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkEstoqueOutput);
		sb.append(']');
	}
	
}
