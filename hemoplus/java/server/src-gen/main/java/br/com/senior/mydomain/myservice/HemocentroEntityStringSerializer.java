/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.List;

public class HemocentroEntityStringSerializer {
	
	public static final HemocentroEntityStringSerializer INSTANCE = new HemocentroEntityStringSerializer();
    
    public void serialize(HemocentroEntity hemocentro, StringBuilder sb, List<Object> appended) {
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
		sb.append(", ").append(", ");
		sb.append(']');
	}
	
	protected void serializeId(HemocentroEntity hemocentro, StringBuilder sb) {
		sb.append("id=").append(hemocentro.getId() == null ? "null" : hemocentro.getId());
	}
	
	protected void serializeNome(HemocentroEntity hemocentro, StringBuilder sb) {
		sb.append("nome=").append(hemocentro.getNome() == null ? "null" : hemocentro.getNome());
	}
	
	protected void serializeRua(HemocentroEntity hemocentro, StringBuilder sb) {
		sb.append("rua=").append(hemocentro.getRua() == null ? "null" : hemocentro.getRua());
	}
	
	protected void serializeNumero(HemocentroEntity hemocentro, StringBuilder sb) {
		sb.append("numero=").append(hemocentro.getNumero() == null ? "null" : hemocentro.getNumero());
	}
	
	protected void serializeBairro(HemocentroEntity hemocentro, StringBuilder sb) {
		sb.append("bairro=").append(hemocentro.getBairro() == null ? "null" : hemocentro.getBairro());
	}
	
	protected void serializeCidade(HemocentroEntity hemocentro, StringBuilder sb) {
		sb.append("cidade=").append(hemocentro.getCidade() == null ? "null" : hemocentro.getCidade());
	}
	
	protected void serializeUf(HemocentroEntity hemocentro, StringBuilder sb) {
		sb.append("uf=").append(hemocentro.getUf() == null ? "null" : hemocentro.getUf());
	}
	
	protected void serializeCep(HemocentroEntity hemocentro, StringBuilder sb) {
		sb.append("cep=").append(hemocentro.getCep() == null ? "null" : hemocentro.getCep());
	}
	
	protected void serializeLatitude(HemocentroEntity hemocentro, StringBuilder sb) {
		sb.append("latitude=").append(hemocentro.getLatitude() == null ? "null" : hemocentro.getLatitude());
	}
	
	protected void serializeLongitude(HemocentroEntity hemocentro, StringBuilder sb) {
		sb.append("longitude=").append(hemocentro.getLongitude() == null ? "null" : hemocentro.getLongitude());
	}
	
	protected void serializeTelefone(HemocentroEntity hemocentro, StringBuilder sb) {
		sb.append("telefone=").append(hemocentro.getTelefone() == null ? "null" : hemocentro.getTelefone());
	}
	
	protected void serializeAtivo(HemocentroEntity hemocentro, StringBuilder sb) {
		sb.append("ativo=").append(hemocentro.getAtivo() == null ? "null" : hemocentro.getAtivo());
	}
	
	protected void serializeAgendamentos(HemocentroEntity hemocentro, StringBuilder sb, List<Object> appended) {
		sb.append("agendamentos=<");
		if (hemocentro.getAgendamentos() == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = hemocentro.getAgendamentos().size() - 1;
			int i = 0;
			for (AgendamentoEntity item : hemocentro.getAgendamentos()) {
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
	
	protected void serializeDoacoes(HemocentroEntity hemocentro, StringBuilder sb, List<Object> appended) {
		sb.append("doacoes=<");
		if (hemocentro.getDoacoes() == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = hemocentro.getDoacoes().size() - 1;
			int i = 0;
			for (DoacaoEntity item : hemocentro.getDoacoes()) {
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
	
	protected void serializeEstoques(HemocentroEntity hemocentro, StringBuilder sb, List<Object> appended) {
		sb.append("estoques=<");
		if (hemocentro.getEstoques() == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = hemocentro.getEstoques().size() - 1;
			int i = 0;
			for (EstoqueEntity item : hemocentro.getEstoques()) {
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
