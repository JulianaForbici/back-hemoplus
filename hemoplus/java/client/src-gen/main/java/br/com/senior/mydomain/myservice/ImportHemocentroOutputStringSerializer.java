package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportHemocentroOutputStringSerializer {
    
	public static final ImportHemocentroOutputStringSerializer INSTANCE = new ImportHemocentroOutputStringSerializer();
    
    public void serialize(ImportHemocentroOutput importHemocentroOutput, StringBuilder sb, List<Object> appended) {
		sb.append(importHemocentroOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(importHemocentroOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importHemocentroOutput);
		serializeImportJobId(importHemocentroOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeImportJobId(ImportHemocentroOutput importHemocentroOutput, StringBuilder sb) {
		sb.append("importJobId=").append(importHemocentroOutput.importJobId == null ? "null" : importHemocentroOutput.importJobId);
	}
}
