package br.com.senior.mydomain.myservice;

import java.util.List;

public class AgendamentoStringSerializer {
    
	public static final AgendamentoStringSerializer INSTANCE = new AgendamentoStringSerializer();
    
    public void serialize(Agendamento agendamento, StringBuilder sb, List<Object> appended) {
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
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(Agendamento agendamento, StringBuilder sb) {
		sb.append("id=").append(agendamento.id == null ? "null" : agendamento.id);
	}
	
	protected void serializeDataHora(Agendamento agendamento, StringBuilder sb) {
		sb.append("dataHora=").append(agendamento.dataHora == null ? "null" : agendamento.dataHora);
	}
	
	protected void serializeStatus(Agendamento agendamento, StringBuilder sb) {
		sb.append("status=").append(agendamento.status == null ? "null" : agendamento.status);
	}
	
	protected void serializeObservacao(Agendamento agendamento, StringBuilder sb) {
		sb.append("observacao=").append(agendamento.observacao == null ? "null" : agendamento.observacao);
	}
	
	protected void serializeMotivoStatus(Agendamento agendamento, StringBuilder sb) {
		sb.append("motivoStatus=").append(agendamento.motivoStatus == null ? "null" : agendamento.motivoStatus);
	}
	
	protected void serializeDataCriacao(Agendamento agendamento, StringBuilder sb) {
		sb.append("dataCriacao=").append(agendamento.dataCriacao == null ? "null" : agendamento.dataCriacao);
	}
	
	protected void serializeDataAtualizacao(Agendamento agendamento, StringBuilder sb) {
		sb.append("dataAtualizacao=").append(agendamento.dataAtualizacao == null ? "null" : agendamento.dataAtualizacao);
	}
	
	protected void serializeToken(Agendamento agendamento, StringBuilder sb) {
		sb.append("token=").append(agendamento.token == null ? "null" : agendamento.token);
	}
	
	protected void serializeTokenExpiraEm(Agendamento agendamento, StringBuilder sb) {
		sb.append("tokenExpiraEm=").append(agendamento.tokenExpiraEm == null ? "null" : agendamento.tokenExpiraEm);
	}
	
	protected void serializeTokenUsadoEm(Agendamento agendamento, StringBuilder sb) {
		sb.append("tokenUsadoEm=").append(agendamento.tokenUsadoEm == null ? "null" : agendamento.tokenUsadoEm);
	}
	
	protected void serializeUsuario(Agendamento agendamento, StringBuilder sb, List<Object> appended) {
		sb.append("usuario=<");
		if (agendamento.usuario == null) {
			sb.append("null");
		} else {
			agendamento.usuario.toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeHemocentro(Agendamento agendamento, StringBuilder sb, List<Object> appended) {
		sb.append("hemocentro=<");
		if (agendamento.hemocentro == null) {
			sb.append("null");
		} else {
			agendamento.hemocentro.toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeDoacoes(Agendamento agendamento, StringBuilder sb, List<Object> appended) {
		sb.append("doacoes=<");
		if (agendamento.doacoes == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = agendamento.doacoes.size() - 1;
			for (int i = 0; i <= last; i++) {
				agendamento.doacoes.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}
