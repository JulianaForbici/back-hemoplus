package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportEstoqueOutputStringSerializer {
    
	public static final ImportEstoqueOutputStringSerializer INSTANCE = new ImportEstoqueOutputStringSerializer();
    
    public void serialize(ImportEstoqueOutput importEstoqueOutput, StringBuilder sb, List<Object> appended) {
		sb.append(importEstoqueOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(importEstoqueOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importEstoqueOutput);
		serializeImportJobId(importEstoqueOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeImportJobId(ImportEstoqueOutput importEstoqueOutput, StringBuilder sb) {
		sb.append("importJobId=").append(importEstoqueOutput.importJobId == null ? "null" : importEstoqueOutput.importJobId);
	}
}
