package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportEstoqueOutputStringSerializer {
    
	public static final ExportEstoqueOutputStringSerializer INSTANCE = new ExportEstoqueOutputStringSerializer();
    
    public void serialize(ExportEstoqueOutput exportEstoqueOutput, StringBuilder sb, List<Object> appended) {
		sb.append(exportEstoqueOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportEstoqueOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportEstoqueOutput);
		serializeExportJobId(exportEstoqueOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeExportJobId(ExportEstoqueOutput exportEstoqueOutput, StringBuilder sb) {
		sb.append("exportJobId=").append(exportEstoqueOutput.exportJobId == null ? "null" : exportEstoqueOutput.exportJobId);
	}
}
