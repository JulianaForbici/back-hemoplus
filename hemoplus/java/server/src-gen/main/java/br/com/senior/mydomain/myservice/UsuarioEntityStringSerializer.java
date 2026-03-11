/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.List;

public class UsuarioEntityStringSerializer {
	
	public static final UsuarioEntityStringSerializer INSTANCE = new UsuarioEntityStringSerializer();
    
    public void serialize(UsuarioEntity usuario, StringBuilder sb, List<Object> appended) {
		sb.append(usuario.getClass().getSimpleName()).append(" [");
		if (appended.contains(usuario)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(usuario);
		serializeId(usuario, sb);
		sb.append(", ");
		serializeNomeCompleto(usuario, sb);
		sb.append(", ");
		serializeEmail(usuario, sb);
		sb.append(", ");
		serializeTelefone(usuario, sb);
		sb.append(", ");
		serializeCpf(usuario, sb);
		sb.append(", ");
		serializeDataNascimento(usuario, sb);
		sb.append(", ");
		serializeAtivo(usuario, sb);
		sb.append(", ");
		serializeDataCadastro(usuario, sb);
		sb.append(", ");
		serializeAgendamentos(usuario, sb, appended);
		sb.append(", ");
		serializeDoacoes(usuario, sb, appended);
		sb.append(", ");
		serializeTipoSangue(usuario, sb);
		sb.append(", ");
		serializeFatorRh(usuario, sb);
		sb.append(", ");
		serializeLatitude(usuario, sb);
		sb.append(", ");
		serializeLongitude(usuario, sb);
		sb.append(", ");
		serializeUsuarioCloud(usuario, sb);
		sb.append(", ");
		serializeTipoUsuario(usuario, sb);
		sb.append(", ");
		serializeCep(usuario, sb);
		sb.append(", ");
		serializeRua(usuario, sb);
		sb.append(", ");
		serializeNumero(usuario, sb);
		sb.append(", ");
		serializeComplemento(usuario, sb);
		sb.append(", ");
		serializeBairro(usuario, sb);
		sb.append(", ");
		serializeCidade(usuario, sb);
		sb.append(", ");
		serializeUf(usuario, sb);
		sb.append(", ").append(", ");
		sb.append(']');
	}
	
	protected void serializeId(UsuarioEntity usuario, StringBuilder sb) {
		sb.append("id=").append(usuario.getId() == null ? "null" : usuario.getId());
	}
	
	protected void serializeNomeCompleto(UsuarioEntity usuario, StringBuilder sb) {
		sb.append("nomeCompleto=").append(usuario.getNomeCompleto() == null ? "null" : usuario.getNomeCompleto());
	}
	
	protected void serializeEmail(UsuarioEntity usuario, StringBuilder sb) {
		sb.append("email=").append(usuario.getEmail() == null ? "null" : usuario.getEmail());
	}
	
	protected void serializeTelefone(UsuarioEntity usuario, StringBuilder sb) {
		sb.append("telefone=").append(usuario.getTelefone() == null ? "null" : usuario.getTelefone());
	}
	
	protected void serializeCpf(UsuarioEntity usuario, StringBuilder sb) {
		sb.append("cpf=").append(usuario.getCpf() == null ? "null" : usuario.getCpf());
	}
	
	protected void serializeDataNascimento(UsuarioEntity usuario, StringBuilder sb) {
		sb.append("dataNascimento=").append(usuario.getDataNascimento() == null ? "null" : usuario.getDataNascimento());
	}
	
	protected void serializeAtivo(UsuarioEntity usuario, StringBuilder sb) {
		sb.append("ativo=").append(usuario.getAtivo() == null ? "null" : usuario.getAtivo());
	}
	
	protected void serializeDataCadastro(UsuarioEntity usuario, StringBuilder sb) {
		sb.append("dataCadastro=").append(usuario.getDataCadastro() == null ? "null" : usuario.getDataCadastro());
	}
	
	protected void serializeAgendamentos(UsuarioEntity usuario, StringBuilder sb, List<Object> appended) {
		sb.append("agendamentos=<");
		if (usuario.getAgendamentos() == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = usuario.getAgendamentos().size() - 1;
			int i = 0;
			for (AgendamentoEntity item : usuario.getAgendamentos()) {
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
	
	protected void serializeDoacoes(UsuarioEntity usuario, StringBuilder sb, List<Object> appended) {
		sb.append("doacoes=<");
		if (usuario.getDoacoes() == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = usuario.getDoacoes().size() - 1;
			int i = 0;
			for (DoacaoEntity item : usuario.getDoacoes()) {
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
	
	protected void serializeTipoSangue(UsuarioEntity usuario, StringBuilder sb) {
		sb.append("tipoSangue=").append(usuario.getTipoSangue() == null ? "null" : usuario.getTipoSangue());
	}
	
	protected void serializeFatorRh(UsuarioEntity usuario, StringBuilder sb) {
		sb.append("fatorRh=").append(usuario.getFatorRh() == null ? "null" : usuario.getFatorRh());
	}
	
	protected void serializeLatitude(UsuarioEntity usuario, StringBuilder sb) {
		sb.append("latitude=").append(usuario.getLatitude() == null ? "null" : usuario.getLatitude());
	}
	
	protected void serializeLongitude(UsuarioEntity usuario, StringBuilder sb) {
		sb.append("longitude=").append(usuario.getLongitude() == null ? "null" : usuario.getLongitude());
	}
	
	protected void serializeUsuarioCloud(UsuarioEntity usuario, StringBuilder sb) {
		sb.append("usuarioCloud=").append(usuario.getUsuarioCloud() == null ? "null" : usuario.getUsuarioCloud());
	}
	
	protected void serializeTipoUsuario(UsuarioEntity usuario, StringBuilder sb) {
		sb.append("tipoUsuario=").append(usuario.getTipoUsuario() == null ? "null" : usuario.getTipoUsuario());
	}
	
	protected void serializeCep(UsuarioEntity usuario, StringBuilder sb) {
		sb.append("cep=").append(usuario.getCep() == null ? "null" : usuario.getCep());
	}
	
	protected void serializeRua(UsuarioEntity usuario, StringBuilder sb) {
		sb.append("rua=").append(usuario.getRua() == null ? "null" : usuario.getRua());
	}
	
	protected void serializeNumero(UsuarioEntity usuario, StringBuilder sb) {
		sb.append("numero=").append(usuario.getNumero() == null ? "null" : usuario.getNumero());
	}
	
	protected void serializeComplemento(UsuarioEntity usuario, StringBuilder sb) {
		sb.append("complemento=").append(usuario.getComplemento() == null ? "null" : usuario.getComplemento());
	}
	
	protected void serializeBairro(UsuarioEntity usuario, StringBuilder sb) {
		sb.append("bairro=").append(usuario.getBairro() == null ? "null" : usuario.getBairro());
	}
	
	protected void serializeCidade(UsuarioEntity usuario, StringBuilder sb) {
		sb.append("cidade=").append(usuario.getCidade() == null ? "null" : usuario.getCidade());
	}
	
	protected void serializeUf(UsuarioEntity usuario, StringBuilder sb) {
		sb.append("uf=").append(usuario.getUf() == null ? "null" : usuario.getUf());
	}
}
