/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.List;

public class DoacaoEntityStringSerializer {
	
	public static final DoacaoEntityStringSerializer INSTANCE = new DoacaoEntityStringSerializer();
    
    public void serialize(DoacaoEntity doacao, StringBuilder sb, List<Object> appended) {
		sb.append(doacao.getClass().getSimpleName()).append(" [");
		if (appended.contains(doacao)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(doacao);
		serializeId(doacao, sb);
		sb.append(", ");
		serializeDataHoraConfirmacao(doacao, sb);
		sb.append(", ");
		serializeResponsavelValidacao(doacao, sb);
		sb.append(", ");
		serializeUsuario(doacao, sb, appended);
		sb.append(", ");
		serializeHemocentro(doacao, sb, appended);
		sb.append(", ");
		serializeAgendamento(doacao, sb, appended);
		sb.append(", ");
		serializeTipoSangue(doacao, sb);
		sb.append(", ");
		serializeFatorRh(doacao, sb);
		sb.append(", ").append(", ");
		sb.append(']');
	}
	
	protected void serializeId(DoacaoEntity doacao, StringBuilder sb) {
		sb.append("id=").append(doacao.getId() == null ? "null" : doacao.getId());
	}
	
	protected void serializeDataHoraConfirmacao(DoacaoEntity doacao, StringBuilder sb) {
		sb.append("dataHoraConfirmacao=").append(doacao.getDataHoraConfirmacao() == null ? "null" : doacao.getDataHoraConfirmacao());
	}
	
	protected void serializeResponsavelValidacao(DoacaoEntity doacao, StringBuilder sb) {
		sb.append("responsavelValidacao=").append(doacao.getResponsavelValidacao() == null ? "null" : doacao.getResponsavelValidacao());
	}
	
	protected void serializeUsuario(DoacaoEntity doacao, StringBuilder sb, List<Object> appended) {
		sb.append("usuario=<");
		if (doacao.getUsuario() == null) {
			sb.append("null");
		} else {
			doacao.getUsuario().toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeHemocentro(DoacaoEntity doacao, StringBuilder sb, List<Object> appended) {
		sb.append("hemocentro=<");
		if (doacao.getHemocentro() == null) {
			sb.append("null");
		} else {
			doacao.getHemocentro().toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeAgendamento(DoacaoEntity doacao, StringBuilder sb, List<Object> appended) {
		sb.append("agendamento=<");
		if (doacao.getAgendamento() == null) {
			sb.append("null");
		} else {
			doacao.getAgendamento().toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeTipoSangue(DoacaoEntity doacao, StringBuilder sb) {
		sb.append("tipoSangue=").append(doacao.getTipoSangue() == null ? "null" : doacao.getTipoSangue());
	}
	
	protected void serializeFatorRh(DoacaoEntity doacao, StringBuilder sb) {
		sb.append("fatorRh=").append(doacao.getFatorRh() == null ? "null" : doacao.getFatorRh());
	}
}
