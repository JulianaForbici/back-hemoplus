package br.com.senior.mydomain.myservice;

import java.util.List;

public class DoacaoStringSerializer {
    
	public static final DoacaoStringSerializer INSTANCE = new DoacaoStringSerializer();
    
    public void serialize(Doacao doacao, StringBuilder sb, List<Object> appended) {
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
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(Doacao doacao, StringBuilder sb) {
		sb.append("id=").append(doacao.id == null ? "null" : doacao.id);
	}
	
	protected void serializeDataHoraConfirmacao(Doacao doacao, StringBuilder sb) {
		sb.append("dataHoraConfirmacao=").append(doacao.dataHoraConfirmacao == null ? "null" : doacao.dataHoraConfirmacao);
	}
	
	protected void serializeResponsavelValidacao(Doacao doacao, StringBuilder sb) {
		sb.append("responsavelValidacao=").append(doacao.responsavelValidacao == null ? "null" : doacao.responsavelValidacao);
	}
	
	protected void serializeUsuario(Doacao doacao, StringBuilder sb, List<Object> appended) {
		sb.append("usuario=<");
		if (doacao.usuario == null) {
			sb.append("null");
		} else {
			doacao.usuario.toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeHemocentro(Doacao doacao, StringBuilder sb, List<Object> appended) {
		sb.append("hemocentro=<");
		if (doacao.hemocentro == null) {
			sb.append("null");
		} else {
			doacao.hemocentro.toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeAgendamento(Doacao doacao, StringBuilder sb, List<Object> appended) {
		sb.append("agendamento=<");
		if (doacao.agendamento == null) {
			sb.append("null");
		} else {
			doacao.agendamento.toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeTipoSangue(Doacao doacao, StringBuilder sb) {
		sb.append("tipoSangue=").append(doacao.tipoSangue == null ? "null" : doacao.tipoSangue);
	}
	
	protected void serializeFatorRh(Doacao doacao, StringBuilder sb) {
		sb.append("fatorRh=").append(doacao.fatorRh == null ? "null" : doacao.fatorRh);
	}
}
