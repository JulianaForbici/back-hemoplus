package br.com.senior.mydomain.myservice;

import java.util.List;

public class AjustarEstoqueOutputStringSerializer {
    
	public static final AjustarEstoqueOutputStringSerializer INSTANCE = new AjustarEstoqueOutputStringSerializer();
    
    public void serialize(AjustarEstoqueOutput ajustarEstoqueOutput, StringBuilder sb, List<Object> appended) {
		sb.append(ajustarEstoqueOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(ajustarEstoqueOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(ajustarEstoqueOutput);
		serializeRetorno(ajustarEstoqueOutput, sb, appended);
		sb.append(", ");
		serializeEstoque(ajustarEstoqueOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeRetorno(AjustarEstoqueOutput ajustarEstoqueOutput, StringBuilder sb, List<Object> appended) {
		sb.append("retorno=<");
		if (ajustarEstoqueOutput.retorno == null) {
			sb.append("null");
		} else {
			ajustarEstoqueOutput.retorno.toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeEstoque(AjustarEstoqueOutput ajustarEstoqueOutput, StringBuilder sb, List<Object> appended) {
		sb.append("estoque=<");
		if (ajustarEstoqueOutput.estoque == null) {
			sb.append("null");
		} else {
			ajustarEstoqueOutput.estoque.toString(sb, appended);
		}
		sb.append('>');
	}
}
