package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportHemocentroInputStringSerializer {
    
	public static final ExportHemocentroInputStringSerializer INSTANCE = new ExportHemocentroInputStringSerializer();
    
    public void serialize(ExportHemocentroInput exportHemocentroInput, StringBuilder sb, List<Object> appended) {
		sb.append(exportHemocentroInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportHemocentroInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportHemocentroInput);
		serializeConfig(exportHemocentroInput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeConfig(ExportHemocentroInput exportHemocentroInput, StringBuilder sb, List<Object> appended) {
		sb.append("config=<");
		if (exportHemocentroInput.config == null) {
			sb.append("null");
		} else {
			exportHemocentroInput.config.toString(sb, appended);
		}
		sb.append('>');
	}
}
