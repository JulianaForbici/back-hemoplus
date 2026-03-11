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
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import java.util.Optional;
import javax.persistence.Transient;
import org.springframework.data.domain.Persistable;

@Entity(name="my_domain.my_service.AgendamentoEntity")
@ODataEntity(id = "agendamento")
@Table(name="agendamento")
public class AgendamentoEntity extends CustomEntity implements Persistable<java.util.UUID> {
	
	public static final String SECURITY_RESOURCE = "res://senior.com.br/my_domain/my_service/entities/agendamento";

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", updatable = false)
	private java.util.UUID id;
	
	@Column(name = "data_hora")
	private java.time.Instant dataHora;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private StatusAgendamento status;
	
	@Column(name = "observacao", length = 150)
	private String observacao;
	
	@Column(name = "motivo_status", length = 150)
	private String motivoStatus;
	
	@Column(name = "data_criacao")
	private java.time.Instant dataCriacao;
	
	@Column(name = "data_atualizacao")
	private java.time.Instant dataAtualizacao;
	
	@Column(name = "token", length = 80)
	private String token;
	
	@Column(name = "token_expira_em")
	private java.time.Instant tokenExpiraEm;
	
	@Column(name = "token_usado_em")
	private java.time.Instant tokenUsadoEm;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usuario")
	private UsuarioEntity usuario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hemocentro")
	private HemocentroEntity hemocentro;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "agendamento", cascade = CascadeType.ALL, orphanRemoval = true)
	private java.util.List<DoacaoEntity> doacoes = new ArrayList<>();
	
	@Transient
	private boolean _newEntity;
	
	@Override
	public java.util.UUID getPk() {
		return this.id;
	}
	
	@Override
	public String getServiceEntityName() {
		return "agendamento";
	}
	
	public java.util.UUID getId() {
		return id;
	}
	
	public java.time.Instant getDataHora() {
		return dataHora;
	}
	
	public StatusAgendamento getStatus() {
		return status;
	}
	
	public String getObservacao() {
		return observacao;
	}
	
	public String getMotivoStatus() {
		return motivoStatus;
	}
	
	public java.time.Instant getDataCriacao() {
		return dataCriacao;
	}
	
	public java.time.Instant getDataAtualizacao() {
		return dataAtualizacao;
	}
	
	public String getToken() {
		return token;
	}
	
	public java.time.Instant getTokenExpiraEm() {
		return tokenExpiraEm;
	}
	
	public java.time.Instant getTokenUsadoEm() {
		return tokenUsadoEm;
	}
	
	public UsuarioEntity getUsuario() {
		return usuario;
	}
	
	public HemocentroEntity getHemocentro() {
		return hemocentro;
	}
	
	public java.util.List<DoacaoEntity> getDoacoes() {
		return doacoes;
	}
	
	public void setId(java.util.UUID id) {
		this.id = id;
	}
	
	public void setDataHora(java.time.Instant dataHora) {
		this.dataHora = dataHora;
	}
	
	public void setStatus(StatusAgendamento status) {
		this.status = status;
	}
	
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	public void setMotivoStatus(String motivoStatus) {
		this.motivoStatus = motivoStatus;
	}
	
	public void setDataCriacao(java.time.Instant dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	public void setDataAtualizacao(java.time.Instant dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	public void setTokenExpiraEm(java.time.Instant tokenExpiraEm) {
		this.tokenExpiraEm = tokenExpiraEm;
	}
	
	public void setTokenUsadoEm(java.time.Instant tokenUsadoEm) {
		this.tokenUsadoEm = tokenUsadoEm;
	}
	
	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
	}
	
	public void setHemocentro(HemocentroEntity hemocentro) {
		this.hemocentro = hemocentro;
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
			doacaoEntity.setAgendamento(this);
		} else {
			//required for merge operations
			doacoes.remove(doacoes.indexOf(doacaoEntity));
			doacoes.add(doacaoEntity);
			doacaoEntity.setAgendamento(this);
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
		doacaoEntity.setAgendamento(null);
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
	    if (!(obj instanceof AgendamentoEntity)) {
	        return false;
	    }
	    AgendamentoEntity other = (AgendamentoEntity) obj;
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
		AgendamentoEntityStringSerializer.INSTANCE.serialize(this, sb, appended);
	}
	
}
