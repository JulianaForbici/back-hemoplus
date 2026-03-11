package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportHemocentroOutputStringSerializer {
    
	public static final ExportHemocentroOutputStringSerializer INSTANCE = new ExportHemocentroOutputStringSerializer();
    
    public void serialize(ExportHemocentroOutput exportHemocentroOutput, StringBuilder sb, List<Object> appended) {
		sb.append(exportHemocentroOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportHemocentroOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportHemocentroOutput);
		serializeExportJobId(exportHemocentroOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeExportJobId(ExportHemocentroOutput exportHemocentroOutput, StringBuilder sb) {
		sb.append("exportJobId=").append(exportHemocentroOutput.exportJobId == null ? "null" : exportHemocentroOutput.exportJobId);
	}
}
