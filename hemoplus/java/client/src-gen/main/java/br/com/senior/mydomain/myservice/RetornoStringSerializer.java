package br.com.senior.mydomain.myservice;

import java.util.List;

public class RetornoStringSerializer {
    
	public static final RetornoStringSerializer INSTANCE = new RetornoStringSerializer();
    
    public void serialize(Retorno retorno, StringBuilder sb, List<Object> appended) {
		sb.append(retorno.getClass().getSimpleName()).append(" [");
		if (appended.contains(retorno)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(retorno);
		serializeMensagem(retorno, sb);
		sb.append(", ");
		serializeCodigo(retorno, sb);
		sb.append(", ");
		serializeContemErro(retorno, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeMensagem(Retorno retorno, StringBuilder sb) {
		sb.append("mensagem=").append(retorno.mensagem == null ? "null" : retorno.mensagem);
	}
	
	protected void serializeCodigo(Retorno retorno, StringBuilder sb) {
		sb.append("codigo=").append(retorno.codigo == null ? "null" : retorno.codigo);
	}
	
	protected void serializeContemErro(Retorno retorno, StringBuilder sb) {
		sb.append("contemErro=").append(retorno.contemErro == null ? "null" : retorno.contemErro);
	}
}
