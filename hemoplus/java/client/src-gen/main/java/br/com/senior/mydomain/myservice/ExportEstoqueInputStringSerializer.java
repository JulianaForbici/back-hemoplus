package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportEstoqueInputStringSerializer {
    
	public static final ExportEstoqueInputStringSerializer INSTANCE = new ExportEstoqueInputStringSerializer();
    
    public void serialize(ExportEstoqueInput exportEstoqueInput, StringBuilder sb, List<Object> appended) {
		sb.append(exportEstoqueInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportEstoqueInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportEstoqueInput);
		serializeConfig(exportEstoqueInput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeConfig(ExportEstoqueInput exportEstoqueInput, StringBuilder sb, List<Object> appended) {
		sb.append("config=<");
		if (exportEstoqueInput.config == null) {
			sb.append("null");
		} else {
			exportEstoqueInput.config.toString(sb, appended);
		}
		sb.append('>');
	}
}
