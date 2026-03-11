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
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;

import br.com.senior.custom.CustomEntity;
import br.com.senior.custom.odata.entity.ODataEntity;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.Optional;
import javax.persistence.Transient;
import org.springframework.data.domain.Persistable;

@Entity(name="my_domain.my_service.HemocentroEntity")
@ODataEntity(id = "hemocentro")
@Table(name="hemocentro")
public class HemocentroEntity extends CustomEntity implements Persistable<java.util.UUID> {
	
	public static final String SECURITY_RESOURCE = "res://senior.com.br/my_domain/my_service/entities/hemocentro";

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", updatable = false)
	private java.util.UUID id;
	
	@Column(name = "nome", length = 60)
	private String nome;
	
	@Column(name = "rua", length = 60)
	private String rua;
	
	@Column(name = "numero", length = 10)
	private String numero;
	
	@Column(name = "bairro", length = 40)
	private String bairro;
	
	@Column(name = "cidade", length = 40)
	private String cidade;
	
	@Column(name = "uf", length = 2)
	private String uf;
	
	@Column(name = "cep", length = 9)
	private String cep;
	
	@Column(name = "latitude")
	private Double latitude;
	
	@Column(name = "longitude")
	private Double longitude;
	
	@Column(name = "telefone", length = 20)
	private String telefone;
	
	@Column(name = "ativo")
	private Boolean ativo;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hemocentro")
	private java.util.List<AgendamentoEntity> agendamentos = new ArrayList<>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hemocentro")
	private java.util.List<DoacaoEntity> doacoes = new ArrayList<>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hemocentro")
	private java.util.List<EstoqueEntity> estoques = new ArrayList<>();
	
	@Transient
	private boolean _newEntity;
	
	@Override
	public java.util.UUID getPk() {
		return this.id;
	}
	
	@Override
	public String getServiceEntityName() {
		return "hemocentro";
	}
	
	public java.util.UUID getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getRua() {
		return rua;
	}
	
	public String getNumero() {
		return numero;
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
	
	public String getCep() {
		return cep;
	}
	
	public Double getLatitude() {
		return latitude;
	}
	
	public Double getLongitude() {
		return longitude;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public Boolean getAtivo() {
		return ativo;
	}
	
	public java.util.List<AgendamentoEntity> getAgendamentos() {
		return agendamentos;
	}
	
	public java.util.List<DoacaoEntity> getDoacoes() {
		return doacoes;
	}
	
	public java.util.List<EstoqueEntity> getEstoques() {
		return estoques;
	}
	
	public void setId(java.util.UUID id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
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
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
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
			agendamentoEntity.setHemocentro(this);
		} else {
			//required for merge operations
			agendamentos.remove(agendamentos.indexOf(agendamentoEntity));
			agendamentos.add(agendamentoEntity);
			agendamentoEntity.setHemocentro(this);
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
		agendamentoEntity.setHemocentro(null);
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
			doacaoEntity.setHemocentro(this);
		} else {
			//required for merge operations
			doacoes.remove(doacoes.indexOf(doacaoEntity));
			doacoes.add(doacaoEntity);
			doacaoEntity.setHemocentro(this);
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
		doacaoEntity.setHemocentro(null);
	}
	
	public void setEstoques(List<EstoqueEntity> estoques) {
		if (estoques != null) {
			estoques.forEach(this::addToEstoques);
		} else {
			final List<EstoqueEntity> current = new ArrayList<EstoqueEntity>();
			current.addAll(this.estoques);
			current.forEach(this::removeFromEstoques);
		}
	}
	
	public void addToEstoques(EstoqueEntity estoqueEntity) {
		if (estoqueEntity.getId() == null || !estoques.contains(estoqueEntity)) {
			estoques.add(estoqueEntity);
			estoqueEntity.setHemocentro(this);
		} else {
			//required for merge operations
			estoques.remove(estoques.indexOf(estoqueEntity));
			estoques.add(estoqueEntity);
			estoqueEntity.setHemocentro(this);
		}
	}
	
	public EstoqueEntity getFromEstoques(java.util.UUID estoqueEntityId) {
		Optional<EstoqueEntity> entity = estoques.stream().filter(e -> e.getId().equals(estoqueEntityId)).findFirst();
		if (entity.isPresent()) {
			return entity.get();
		}
		return null;
	}
	
	public void removeFromEstoques(EstoqueEntity estoqueEntity) {
		estoques.remove(estoqueEntity);
		estoqueEntity.setHemocentro(null);
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
	    if (!(obj instanceof HemocentroEntity)) {
	        return false;
	    }
	    HemocentroEntity other = (HemocentroEntity) obj;
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
		HemocentroEntityStringSerializer.INSTANCE.serialize(this, sb, appended);
	}
	
}
