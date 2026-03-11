/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.List;

public class AgendamentoEntityStringSerializer {
	
	public static final AgendamentoEntityStringSerializer INSTANCE = new AgendamentoEntityStringSerializer();
    
    public void serialize(AgendamentoEntity agendamento, StringBuilder sb, List<Object> appended) {
		sb.append(agendamento.getClass().getSimpleName()).append(" [");
		if (appended.contains(agendamento)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(agendamento);
		serializeId(agendamento, sb);
		sb.append(", ");
		serializeDataHora(agendamento, sb);
		sb.append(", ");
		serializeStatus(agendamento, sb);
		sb.append(", ");
		serializeObservacao(agendamento, sb);
		sb.append(", ");
		serializeMotivoStatus(agendamento, sb);
		sb.append(", ");
		serializeDataCriacao(agendamento, sb);
		sb.append(", ");
		serializeDataAtualizacao(agendamento, sb);
		sb.append(", ");
		serializeToken(agendamento, sb);
		sb.append(", ");
		serializeTokenExpiraEm(agendamento, sb);
		sb.append(", ");
		serializeTokenUsadoEm(agendamento, sb);
		sb.append(", ");
		serializeUsuario(agendamento, sb, appended);
		sb.append(", ");
		serializeHemocentro(agendamento, sb, appended);
		sb.append(", ");
		serializeDoacoes(agendamento, sb, appended);
		sb.append(", ").append(", ");
		sb.append(']');
	}
	
	protected void serializeId(AgendamentoEntity agendamento, StringBuilder sb) {
		sb.append("id=").append(agendamento.getId() == null ? "null" : agendamento.getId());
	}
	
	protected void serializeDataHora(AgendamentoEntity agendamento, StringBuilder sb) {
		sb.append("dataHora=").append(agendamento.getDataHora() == null ? "null" : agendamento.getDataHora());
	}
	
	protected void serializeStatus(AgendamentoEntity agendamento, StringBuilder sb) {
		sb.append("status=").append(agendamento.getStatus() == null ? "null" : agendamento.getStatus());
	}
	
	protected void serializeObservacao(AgendamentoEntity agendamento, StringBuilder sb) {
		sb.append("observacao=").append(agendamento.getObservacao() == null ? "null" : agendamento.getObservacao());
	}
	
	protected void serializeMotivoStatus(AgendamentoEntity agendamento, StringBuilder sb) {
		sb.append("motivoStatus=").append(agendamento.getMotivoStatus() == null ? "null" : agendamento.getMotivoStatus());
	}
	
	protected void serializeDataCriacao(AgendamentoEntity agendamento, StringBuilder sb) {
		sb.append("dataCriacao=").append(agendamento.getDataCriacao() == null ? "null" : agendamento.getDataCriacao());
	}
	
	protected void serializeDataAtualizacao(AgendamentoEntity agendamento, StringBuilder sb) {
		sb.append("dataAtualizacao=").append(agendamento.getDataAtualizacao() == null ? "null" : agendamento.getDataAtualizacao());
	}
	
	protected void serializeToken(AgendamentoEntity agendamento, StringBuilder sb) {
		sb.append("token=").append(agendamento.getToken() == null ? "null" : agendamento.getToken());
	}
	
	protected void serializeTokenExpiraEm(AgendamentoEntity agendamento, StringBuilder sb) {
		sb.append("tokenExpiraEm=").append(agendamento.getTokenExpiraEm() == null ? "null" : agendamento.getTokenExpiraEm());
	}
	
	protected void serializeTokenUsadoEm(AgendamentoEntity agendamento, StringBuilder sb) {
		sb.append("tokenUsadoEm=").append(agendamento.getTokenUsadoEm() == null ? "null" : agendamento.getTokenUsadoEm());
	}
	
	protected void serializeUsuario(AgendamentoEntity agendamento, StringBuilder sb, List<Object> appended) {
		sb.append("usuario=<");
		if (agendamento.getUsuario() == null) {
			sb.append("null");
		} else {
			agendamento.getUsuario().toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeHemocentro(AgendamentoEntity agendamento, StringBuilder sb, List<Object> appended) {
		sb.append("hemocentro=<");
		if (agendamento.getHemocentro() == null) {
			sb.append("null");
		} else {
			agendamento.getHemocentro().toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeDoacoes(AgendamentoEntity agendamento, StringBuilder sb, List<Object> appended) {
		sb.append("doacoes=<");
		if (agendamento.getDoacoes() == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = agendamento.getDoacoes().size() - 1;
			int i = 0;
			for (DoacaoEntity item : agendamento.getDoacoes()) {
				item.toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
				i++;
			}
			sb.append(']');
		}
		sb.append('>');
	}
}
