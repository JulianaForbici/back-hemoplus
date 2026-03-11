package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportHemocentroInputStringSerializer {
    
	public static final ImportHemocentroInputStringSerializer INSTANCE = new ImportHemocentroInputStringSerializer();
    
    public void serialize(ImportHemocentroInput importHemocentroInput, StringBuilder sb, List<Object> appended) {
		sb.append(importHemocentroInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(importHemocentroInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importHemocentroInput);
		serializeConfig(importHemocentroInput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeConfig(ImportHemocentroInput importHemocentroInput, StringBuilder sb, List<Object> appended) {
		sb.append("config=<");
		if (importHemocentroInput.config == null) {
			sb.append("null");
		} else {
			importHemocentroInput.config.toString(sb, appended);
		}
		sb.append('>');
	}
}
