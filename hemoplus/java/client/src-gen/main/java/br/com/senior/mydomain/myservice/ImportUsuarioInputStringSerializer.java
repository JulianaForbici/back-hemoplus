package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportUsuarioInputStringSerializer {
    
	public static final ImportUsuarioInputStringSerializer INSTANCE = new ImportUsuarioInputStringSerializer();
    
    public void serialize(ImportUsuarioInput importUsuarioInput, StringBuilder sb, List<Object> appended) {
		sb.append(importUsuarioInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(importUsuarioInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importUsuarioInput);
		serializeConfig(importUsuarioInput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeConfig(ImportUsuarioInput importUsuarioInput, StringBuilder sb, List<Object> appended) {
		sb.append("config=<");
		if (importUsuarioInput.config == null) {
			sb.append("null");
		} else {
			importUsuarioInput.config.toString(sb, appended);
		}
		sb.append('>');
	}
}
