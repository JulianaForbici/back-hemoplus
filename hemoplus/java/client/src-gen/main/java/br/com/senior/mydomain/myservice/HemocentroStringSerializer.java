package br.com.senior.mydomain.myservice;

import java.util.List;

public class HemocentroStringSerializer {
    
	public static final HemocentroStringSerializer INSTANCE = new HemocentroStringSerializer();
    
    public void serialize(Hemocentro hemocentro, StringBuilder sb, List<Object> appended) {
		sb.append(hemocentro.getClass().getSimpleName()).append(" [");
		if (appended.contains(hemocentro)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(hemocentro);
		serializeId(hemocentro, sb);
		sb.append(", ");
		serializeNome(hemocentro, sb);
		sb.append(", ");
		serializeRua(hemocentro, sb);
		sb.append(", ");
		serializeNumero(hemocentro, sb);
		sb.append(", ");
		serializeBairro(hemocentro, sb);
		sb.append(", ");
		serializeCidade(hemocentro, sb);
		sb.append(", ");
		serializeUf(hemocentro, sb);
		sb.append(", ");
		serializeCep(hemocentro, sb);
		sb.append(", ");
		serializeLatitude(hemocentro, sb);
		sb.append(", ");
		serializeLongitude(hemocentro, sb);
		sb.append(", ");
		serializeTelefone(hemocentro, sb);
		sb.append(", ");
		serializeAtivo(hemocentro, sb);
		sb.append(", ");
		serializeAgendamentos(hemocentro, sb, appended);
		sb.append(", ");
		serializeDoacoes(hemocentro, sb, appended);
		sb.append(", ");
		serializeEstoques(hemocentro, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(Hemocentro hemocentro, StringBuilder sb) {
		sb.append("id=").append(hemocentro.id == null ? "null" : hemocentro.id);
	}
	
	protected void serializeNome(Hemocentro hemocentro, StringBuilder sb) {
		sb.append("nome=").append(hemocentro.nome == null ? "null" : hemocentro.nome);
	}
	
	protected void serializeRua(Hemocentro hemocentro, StringBuilder sb) {
		sb.append("rua=").append(hemocentro.rua == null ? "null" : hemocentro.rua);
	}
	
	protected void serializeNumero(Hemocentro hemocentro, StringBuilder sb) {
		sb.append("numero=").append(hemocentro.numero == null ? "null" : hemocentro.numero);
	}
	
	protected void serializeBairro(Hemocentro hemocentro, StringBuilder sb) {
		sb.append("bairro=").append(hemocentro.bairro == null ? "null" : hemocentro.bairro);
	}
	
	protected void serializeCidade(Hemocentro hemocentro, StringBuilder sb) {
		sb.append("cidade=").append(hemocentro.cidade == null ? "null" : hemocentro.cidade);
	}
	
	protected void serializeUf(Hemocentro hemocentro, StringBuilder sb) {
		sb.append("uf=").append(hemocentro.uf == null ? "null" : hemocentro.uf);
	}
	
	protected void serializeCep(Hemocentro hemocentro, StringBuilder sb) {
		sb.append("cep=").append(hemocentro.cep == null ? "null" : hemocentro.cep);
	}
	
	protected void serializeLatitude(Hemocentro hemocentro, StringBuilder sb) {
		sb.append("latitude=").append(hemocentro.latitude == null ? "null" : hemocentro.latitude);
	}
	
	protected void serializeLongitude(Hemocentro hemocentro, StringBuilder sb) {
		sb.append("longitude=").append(hemocentro.longitude == null ? "null" : hemocentro.longitude);
	}
	
	protected void serializeTelefone(Hemocentro hemocentro, StringBuilder sb) {
		sb.append("telefone=").append(hemocentro.telefone == null ? "null" : hemocentro.telefone);
	}
	
	protected void serializeAtivo(Hemocentro hemocentro, StringBuilder sb) {
		sb.append("ativo=").append(hemocentro.ativo == null ? "null" : hemocentro.ativo);
	}
	
	protected void serializeAgendamentos(Hemocentro hemocentro, StringBuilder sb, List<Object> appended) {
		sb.append("agendamentos=<");
		if (hemocentro.agendamentos == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = hemocentro.agendamentos.size() - 1;
			for (int i = 0; i <= last; i++) {
				hemocentro.agendamentos.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
	
	protected void serializeDoacoes(Hemocentro hemocentro, StringBuilder sb, List<Object> appended) {
		sb.append("doacoes=<");
		if (hemocentro.doacoes == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = hemocentro.doacoes.size() - 1;
			for (int i = 0; i <= last; i++) {
				hemocentro.doacoes.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
	
	protected void serializeEstoques(Hemocentro hemocentro, StringBuilder sb, List<Object> appended) {
		sb.append("estoques=<");
		if (hemocentro.estoques == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = hemocentro.estoques.size() - 1;
			for (int i = 0; i <= last; i++) {
				hemocentro.estoques.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}
