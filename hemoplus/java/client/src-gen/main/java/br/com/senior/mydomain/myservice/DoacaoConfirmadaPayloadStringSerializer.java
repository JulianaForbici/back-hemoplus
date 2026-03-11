package br.com.senior.mydomain.myservice;

import java.util.List;

public class DoacaoConfirmadaPayloadStringSerializer {
    
	public static final DoacaoConfirmadaPayloadStringSerializer INSTANCE = new DoacaoConfirmadaPayloadStringSerializer();
    
    public void serialize(DoacaoConfirmadaPayload doacaoConfirmadaPayload, StringBuilder sb, List<Object> appended) {
		sb.append(doacaoConfirmadaPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(doacaoConfirmadaPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(doacaoConfirmadaPayload);
		serializeDoacaoId(doacaoConfirmadaPayload, sb);
		sb.append(", ");
		serializeUsuarioId(doacaoConfirmadaPayload, sb);
		sb.append(", ");
		serializeHemocentroId(doacaoConfirmadaPayload, sb);
		sb.append(", ");
		serializeAgendamentoId(doacaoConfirmadaPayload, sb);
		sb.append(", ");
		serializeDataHoraConfirmacao(doacaoConfirmadaPayload, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeDoacaoId(DoacaoConfirmadaPayload doacaoConfirmadaPayload, StringBuilder sb) {
		sb.append("doacaoId=").append(doacaoConfirmadaPayload.doacaoId == null ? "null" : doacaoConfirmadaPayload.doacaoId);
	}
	
	protected void serializeUsuarioId(DoacaoConfirmadaPayload doacaoConfirmadaPayload, StringBuilder sb) {
		sb.append("usuarioId=").append(doacaoConfirmadaPayload.usuarioId == null ? "null" : doacaoConfirmadaPayload.usuarioId);
	}
	
	protected void serializeHemocentroId(DoacaoConfirmadaPayload doacaoConfirmadaPayload, StringBuilder sb) {
		sb.append("hemocentroId=").append(doacaoConfirmadaPayload.hemocentroId == null ? "null" : doacaoConfirmadaPayload.hemocentroId);
	}
	
	protected void serializeAgendamentoId(DoacaoConfirmadaPayload doacaoConfirmadaPayload, StringBuilder sb) {
		sb.append("agendamentoId=").append(doacaoConfirmadaPayload.agendamentoId == null ? "null" : doacaoConfirmadaPayload.agendamentoId);
	}
	
	protected void serializeDataHoraConfirmacao(DoacaoConfirmadaPayload doacaoConfirmadaPayload, StringBuilder sb) {
		sb.append("dataHoraConfirmacao=").append(doacaoConfirmadaPayload.dataHoraConfirmacao == null ? "null" : doacaoConfirmadaPayload.dataHoraConfirmacao);
	}
}
