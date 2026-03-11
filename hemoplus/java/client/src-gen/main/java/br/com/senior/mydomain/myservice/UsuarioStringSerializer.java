package br.com.senior.mydomain.myservice;

import java.util.List;

public class UsuarioStringSerializer {
    
	public static final UsuarioStringSerializer INSTANCE = new UsuarioStringSerializer();
    
    public void serialize(Usuario usuario, StringBuilder sb, List<Object> appended) {
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
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(Usuario usuario, StringBuilder sb) {
		sb.append("id=").append(usuario.id == null ? "null" : usuario.id);
	}
	
	protected void serializeNomeCompleto(Usuario usuario, StringBuilder sb) {
		sb.append("nomeCompleto=").append(usuario.nomeCompleto == null ? "null" : usuario.nomeCompleto);
	}
	
	protected void serializeEmail(Usuario usuario, StringBuilder sb) {
		sb.append("email=").append(usuario.email == null ? "null" : usuario.email);
	}
	
	protected void serializeTelefone(Usuario usuario, StringBuilder sb) {
		sb.append("telefone=").append(usuario.telefone == null ? "null" : usuario.telefone);
	}
	
	protected void serializeCpf(Usuario usuario, StringBuilder sb) {
		sb.append("cpf=").append(usuario.cpf == null ? "null" : usuario.cpf);
	}
	
	protected void serializeDataNascimento(Usuario usuario, StringBuilder sb) {
		sb.append("dataNascimento=").append(usuario.dataNascimento == null ? "null" : usuario.dataNascimento);
	}
	
	protected void serializeAtivo(Usuario usuario, StringBuilder sb) {
		sb.append("ativo=").append(usuario.ativo == null ? "null" : usuario.ativo);
	}
	
	protected void serializeDataCadastro(Usuario usuario, StringBuilder sb) {
		sb.append("dataCadastro=").append(usuario.dataCadastro == null ? "null" : usuario.dataCadastro);
	}
	
	protected void serializeAgendamentos(Usuario usuario, StringBuilder sb, List<Object> appended) {
		sb.append("agendamentos=<");
		if (usuario.agendamentos == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = usuario.agendamentos.size() - 1;
			for (int i = 0; i <= last; i++) {
				usuario.agendamentos.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
	
	protected void serializeDoacoes(Usuario usuario, StringBuilder sb, List<Object> appended) {
		sb.append("doacoes=<");
		if (usuario.doacoes == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = usuario.doacoes.size() - 1;
			for (int i = 0; i <= last; i++) {
				usuario.doacoes.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
	
	protected void serializeTipoSangue(Usuario usuario, StringBuilder sb) {
		sb.append("tipoSangue=").append(usuario.tipoSangue == null ? "null" : usuario.tipoSangue);
	}
	
	protected void serializeFatorRh(Usuario usuario, StringBuilder sb) {
		sb.append("fatorRh=").append(usuario.fatorRh == null ? "null" : usuario.fatorRh);
	}
	
	protected void serializeLatitude(Usuario usuario, StringBuilder sb) {
		sb.append("latitude=").append(usuario.latitude == null ? "null" : usuario.latitude);
	}
	
	protected void serializeLongitude(Usuario usuario, StringBuilder sb) {
		sb.append("longitude=").append(usuario.longitude == null ? "null" : usuario.longitude);
	}
	
	protected void serializeUsuarioCloud(Usuario usuario, StringBuilder sb) {
		sb.append("usuarioCloud=").append(usuario.usuarioCloud == null ? "null" : usuario.usuarioCloud);
	}
	
	protected void serializeTipoUsuario(Usuario usuario, StringBuilder sb) {
		sb.append("tipoUsuario=").append(usuario.tipoUsuario == null ? "null" : usuario.tipoUsuario);
	}
	
	protected void serializeCep(Usuario usuario, StringBuilder sb) {
		sb.append("cep=").append(usuario.cep == null ? "null" : usuario.cep);
	}
	
	protected void serializeRua(Usuario usuario, StringBuilder sb) {
		sb.append("rua=").append(usuario.rua == null ? "null" : usuario.rua);
	}
	
	protected void serializeNumero(Usuario usuario, StringBuilder sb) {
		sb.append("numero=").append(usuario.numero == null ? "null" : usuario.numero);
	}
	
	protected void serializeComplemento(Usuario usuario, StringBuilder sb) {
		sb.append("complemento=").append(usuario.complemento == null ? "null" : usuario.complemento);
	}
	
	protected void serializeBairro(Usuario usuario, StringBuilder sb) {
		sb.append("bairro=").append(usuario.bairro == null ? "null" : usuario.bairro);
	}
	
	protected void serializeCidade(Usuario usuario, StringBuilder sb) {
		sb.append("cidade=").append(usuario.cidade == null ? "null" : usuario.cidade);
	}
	
	protected void serializeUf(Usuario usuario, StringBuilder sb) {
		sb.append("uf=").append(usuario.uf == null ? "null" : usuario.uf);
	}
}
