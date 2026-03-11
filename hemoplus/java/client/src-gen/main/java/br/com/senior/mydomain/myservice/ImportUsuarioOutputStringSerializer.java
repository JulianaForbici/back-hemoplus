package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportUsuarioOutputStringSerializer {
    
	public static final ImportUsuarioOutputStringSerializer INSTANCE = new ImportUsuarioOutputStringSerializer();
    
    public void serialize(ImportUsuarioOutput importUsuarioOutput, StringBuilder sb, List<Object> appended) {
		sb.append(importUsuarioOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(importUsuarioOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importUsuarioOutput);
		serializeImportJobId(importUsuarioOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeImportJobId(ImportUsuarioOutput importUsuarioOutput, StringBuilder sb) {
		sb.append("importJobId=").append(importUsuarioOutput.importJobId == null ? "null" : importUsuarioOutput.importJobId);
	}
}
