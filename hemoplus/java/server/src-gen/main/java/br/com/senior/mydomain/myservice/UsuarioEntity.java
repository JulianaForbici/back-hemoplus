/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;

import br.com.senior.custom.CustomEntity;
import br.com.senior.custom.odata.entity.ODataEntity;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import java.util.Optional;
import javax.persistence.Transient;
import org.springframework.data.domain.Persistable;

@Entity(name="my_domain.my_service.UsuarioEntity")
@ODataEntity(id = "usuario")
@Table(name="usuario")
public class UsuarioEntity extends CustomEntity implements Persistable<java.util.UUID> {
	
	public static final String SECURITY_RESOURCE = "res://senior.com.br/my_domain/my_service/entities/usuario";

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", updatable = false)
	private java.util.UUID id;
	
	@Column(name = "nome_completo", length = 80)
	private String nomeCompleto;
	
	@Column(name = "email", length = 120)
	private String email;
	
	@Column(name = "telefone", length = 20)
	private String telefone;
	
	@Column(name = "cpf", length = 11)
	private String cpf;
	
	@Column(name = "data_nascimento")
	private java.time.LocalDate dataNascimento;
	
	@Column(name = "ativo")
	private Boolean ativo;
	
	@Column(name = "data_cadastro")
	private java.time.Instant dataCadastro;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
	private java.util.List<AgendamentoEntity> agendamentos = new ArrayList<>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	private java.util.List<DoacaoEntity> doacoes = new ArrayList<>();
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_sangue")
	private TipoSangue tipoSangue;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "fator_rh")
	private FatorRh fatorRh;
	
	@Column(name = "latitude")
	private Double latitude;
	
	@Column(name = "longitude")
	private Double longitude;
	
	@Column(name = "usuario_cloud", length = 120)
	private String usuarioCloud;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_usuario")
	private TipoUsuario tipoUsuario;
	
	@Column(name = "cep", length = 9)
	private String cep;
	
	@Column(name = "rua", length = 80)
	private String rua;
	
	@Column(name = "numero", length = 10)
	private String numero;
	
	@Column(name = "complemento", length = 60)
	private String complemento;
	
	@Column(name = "bairro", length = 40)
	private String bairro;
	
	@Column(name = "cidade", length = 40)
	private String cidade;
	
	@Column(name = "uf", length = 2)
	private String uf;
	
	@Transient
	private boolean _newEntity;
	
	@Override
	public java.util.UUID getPk() {
		return this.id;
	}
	
	@Override
	public String getServiceEntityName() {
		return "usuario";
	}
	
	public java.util.UUID getId() {
		return id;
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public java.time.LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public Boolean getAtivo() {
		return ativo;
	}
	
	public java.time.Instant getDataCadastro() {
		return dataCadastro;
	}
	
	public java.util.List<AgendamentoEntity> getAgendamentos() {
		return agendamentos;
	}
	
	public java.util.List<DoacaoEntity> getDoacoes() {
		return doacoes;
	}
	
	public TipoSangue getTipoSangue() {
		return tipoSangue;
	}
	
	public FatorRh getFatorRh() {
		return fatorRh;
	}
	
	public Double getLatitude() {
		return latitude;
	}
	
	public Double getLongitude() {
		return longitude;
	}
	
	public String getUsuarioCloud() {
		return usuarioCloud;
	}
	
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}
	
	public String getCep() {
		return cep;
	}
	
	public String getRua() {
		return rua;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public String getUf() {
		return uf;
	}
	
	public void setId(java.util.UUID id) {
		this.id = id;
	}
	
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setDataNascimento(java.time.LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	public void setDataCadastro(java.time.Instant dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public void setAgendamentos(List<AgendamentoEntity> agendamentos) {
		if (agendamentos != null) {
			agendamentos.forEach(this::addToAgendamentos);
		} else {
			final List<AgendamentoEntity> current = new ArrayList<AgendamentoEntity>();
			current.addAll(this.agendamentos);
			current.forEach(this::removeFromAgendamentos);
		}
	}
	
	public void addToAgendamentos(AgendamentoEntity agendamentoEntity) {
		if (agendamentoEntity.getId() == null || !agendamentos.contains(agendamentoEntity)) {
			agendamentos.add(agendamentoEntity);
			agendamentoEntity.setUsuario(this);
		} else {
			//required for merge operations
			agendamentos.remove(agendamentos.indexOf(agendamentoEntity));
			agendamentos.add(agendamentoEntity);
			agendamentoEntity.setUsuario(this);
		}
	}
	
	public AgendamentoEntity getFromAgendamentos(java.util.UUID agendamentoEntityId) {
		Optional<AgendamentoEntity> entity = agendamentos.stream().filter(e -> e.getId().equals(agendamentoEntityId)).findFirst();
		if (entity.isPresent()) {
			return entity.get();
		}
		return null;
	}
	
	public void removeFromAgendamentos(AgendamentoEntity agendamentoEntity) {
		agendamentos.remove(agendamentoEntity);
		agendamentoEntity.setUsuario(null);
	}
	
	public void setDoacoes(List<DoacaoEntity> doacoes) {
		if (doacoes != null) {
			doacoes.forEach(this::addToDoacoes);
		} else {
			final List<DoacaoEntity> current = new ArrayList<DoacaoEntity>();
			current.addAll(this.doacoes);
			current.forEach(this::removeFromDoacoes);
		}
	}
	
	public void addToDoacoes(DoacaoEntity doacaoEntity) {
		if (doacaoEntity.getId() == null || !doacoes.contains(doacaoEntity)) {
			doacoes.add(doacaoEntity);
			doacaoEntity.setUsuario(this);
		} else {
			//required for merge operations
			doacoes.remove(doacoes.indexOf(doacaoEntity));
			doacoes.add(doacaoEntity);
			doacaoEntity.setUsuario(this);
		}
	}
	
	public DoacaoEntity getFromDoacoes(java.util.UUID doacaoEntityId) {
		Optional<DoacaoEntity> entity = doacoes.stream().filter(e -> e.getId().equals(doacaoEntityId)).findFirst();
		if (entity.isPresent()) {
			return entity.get();
		}
		return null;
	}
	
	public void removeFromDoacoes(DoacaoEntity doacaoEntity) {
		doacoes.remove(doacaoEntity);
		doacaoEntity.setUsuario(null);
	}
	
	public void setTipoSangue(TipoSangue tipoSangue) {
		this.tipoSangue = tipoSangue;
	}
	
	public void setFatorRh(FatorRh fatorRh) {
		this.fatorRh = fatorRh;
	}
	
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	public void setUsuarioCloud(String usuarioCloud) {
		this.usuarioCloud = usuarioCloud;
	}
	
	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	@Override
	public boolean isNew() {
		return _newEntity;
	}
	
	public void defineAsNewEntity() {
		this._newEntity = true;
	}
	
	@Override
	public int hashCode() {
	    int ret = 1;
	    if (id != null) {
	        ret = 31 * ret + id.hashCode();
	    }
	    return ret;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (!(obj instanceof UsuarioEntity)) {
	        return false;
	    }
	    UsuarioEntity other = (UsuarioEntity) obj;
	    if (id == null) {
	        return false;
	    }
	    if ((id != null) && !id.equals(other.id)) {
	        return false;
	    }
	    return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		toString(sb, new ArrayList<>());
		return sb.toString();
	}
	
	void toString(StringBuilder sb, List<Object> appended) {
		UsuarioEntityStringSerializer.INSTANCE.serialize(this, sb, appended);
	}
	
}
