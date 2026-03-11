package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportUsuarioOutputStringSerializer {
    
	public static final ExportUsuarioOutputStringSerializer INSTANCE = new ExportUsuarioOutputStringSerializer();
    
    public void serialize(ExportUsuarioOutput exportUsuarioOutput, StringBuilder sb, List<Object> appended) {
		sb.append(exportUsuarioOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportUsuarioOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportUsuarioOutput);
		serializeExportJobId(exportUsuarioOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeExportJobId(ExportUsuarioOutput exportUsuarioOutput, StringBuilder sb) {
		sb.append("exportJobId=").append(exportUsuarioOutput.exportJobId == null ? "null" : exportUsuarioOutput.exportJobId);
	}
}
