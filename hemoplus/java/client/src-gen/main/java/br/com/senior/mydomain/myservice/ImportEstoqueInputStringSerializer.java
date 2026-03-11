package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportEstoqueInputStringSerializer {
    
	public static final ImportEstoqueInputStringSerializer INSTANCE = new ImportEstoqueInputStringSerializer();
    
    public void serialize(ImportEstoqueInput importEstoqueInput, StringBuilder sb, List<Object> appended) {
		sb.append(importEstoqueInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(importEstoqueInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importEstoqueInput);
		serializeConfig(importEstoqueInput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeConfig(ImportEstoqueInput importEstoqueInput, StringBuilder sb, List<Object> appended) {
		sb.append("config=<");
		if (importEstoqueInput.config == null) {
			sb.append("null");
		} else {
			importEstoqueInput.config.toString(sb, appended);
		}
		sb.append('>');
	}
}
