package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkUsuarioOutputStringSerializer {
    
	public static final CreateBulkUsuarioOutputStringSerializer INSTANCE = new CreateBulkUsuarioOutputStringSerializer();
    
    public void serialize(CreateBulkUsuarioOutput createBulkUsuarioOutput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkUsuarioOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkUsuarioOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkUsuarioOutput);
		sb.append(']');
	}
	
}
