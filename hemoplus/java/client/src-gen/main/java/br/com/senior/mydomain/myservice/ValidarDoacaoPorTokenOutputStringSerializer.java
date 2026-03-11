package br.com.senior.mydomain.myservice;

import java.util.List;

public class ValidarDoacaoPorTokenOutputStringSerializer {
    
	public static final ValidarDoacaoPorTokenOutputStringSerializer INSTANCE = new ValidarDoacaoPorTokenOutputStringSerializer();
    
    public void serialize(ValidarDoacaoPorTokenOutput validarDoacaoPorTokenOutput, StringBuilder sb, List<Object> appended) {
		sb.append(validarDoacaoPorTokenOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(validarDoacaoPorTokenOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(validarDoacaoPorTokenOutput);
		serializeRetorno(validarDoacaoPorTokenOutput, sb, appended);
		sb.append(", ");
		serializeDoacao(validarDoacaoPorTokenOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeRetorno(ValidarDoacaoPorTokenOutput validarDoacaoPorTokenOutput, StringBuilder sb, List<Object> appended) {
		sb.append("retorno=<");
		if (validarDoacaoPorTokenOutput.retorno == null) {
			sb.append("null");
		} else {
			validarDoacaoPorTokenOutput.retorno.toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeDoacao(ValidarDoacaoPorTokenOutput validarDoacaoPorTokenOutput, StringBuilder sb, List<Object> appended) {
		sb.append("doacao=<");
		if (validarDoacaoPorTokenOutput.doacao == null) {
			sb.append("null");
		} else {
			validarDoacaoPorTokenOutput.doacao.toString(sb, appended);
		}
		sb.append('>');
	}
}
