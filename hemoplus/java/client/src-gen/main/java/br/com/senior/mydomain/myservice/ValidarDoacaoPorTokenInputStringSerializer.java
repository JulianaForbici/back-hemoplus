package br.com.senior.mydomain.myservice;

import java.util.List;

public class ValidarDoacaoPorTokenInputStringSerializer {
    
	public static final ValidarDoacaoPorTokenInputStringSerializer INSTANCE = new ValidarDoacaoPorTokenInputStringSerializer();
    
    public void serialize(ValidarDoacaoPorTokenInput validarDoacaoPorTokenInput, StringBuilder sb, List<Object> appended) {
		sb.append(validarDoacaoPorTokenInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(validarDoacaoPorTokenInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(validarDoacaoPorTokenInput);
		serializeToken(validarDoacaoPorTokenInput, sb);
		sb.append(", ");
		serializeResponsavelValidacao(validarDoacaoPorTokenInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeToken(ValidarDoacaoPorTokenInput validarDoacaoPorTokenInput, StringBuilder sb) {
		sb.append("token=").append(validarDoacaoPorTokenInput.token == null ? "null" : validarDoacaoPorTokenInput.token);
	}
	
	protected void serializeResponsavelValidacao(ValidarDoacaoPorTokenInput validarDoacaoPorTokenInput, StringBuilder sb) {
		sb.append("responsavelValidacao=").append(validarDoacaoPorTokenInput.responsavelValidacao == null ? "null" : validarDoacaoPorTokenInput.responsavelValidacao);
	}
}
