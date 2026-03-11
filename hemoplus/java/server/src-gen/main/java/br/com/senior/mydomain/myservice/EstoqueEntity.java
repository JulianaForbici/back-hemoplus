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
import javax.persistence.Transient;
import org.springframework.data.domain.Persistable;

@Entity(name="my_domain.my_service.EstoqueEntity")
@ODataEntity(id = "estoque")
@Table(name="estoque")
public class EstoqueEntity extends CustomEntity implements Persistable<java.util.UUID> {
	
	public static final String SECURITY_RESOURCE = "res://senior.com.br/my_domain/my_service/entities/estoque";

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", updatable = false)
	private java.util.UUID id;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_sangue")
	private TipoSangue tipoSangue;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "fator_rh")
	private FatorRh fatorRh;
	
	@Column(name = "quantidade_ml")
	private Long quantidadeMl;
	
	@Column(name = "minimo_ml")
	private Long minimoMl;
	
	@Column(name = "data_atualizacao")
	private java.time.Instant dataAtualizacao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hemocentro")
	private HemocentroEntity hemocentro;
	
	@Transient
	private boolean _newEntity;
	
	@Override
	public java.util.UUID getPk() {
		return this.id;
	}
	
	@Override
	public String getServiceEntityName() {
		return "estoque";
	}
	
	public java.util.UUID getId() {
		return id;
	}
	
	public TipoSangue getTipoSangue() {
		return tipoSangue;
	}
	
	public FatorRh getFatorRh() {
		return fatorRh;
	}
	
	public Long getQuantidadeMl() {
		return quantidadeMl;
	}
	
	public Long getMinimoMl() {
		return minimoMl;
	}
	
	public java.time.Instant getDataAtualizacao() {
		return dataAtualizacao;
	}
	
	public HemocentroEntity getHemocentro() {
		return hemocentro;
	}
	
	public void setId(java.util.UUID id) {
		this.id = id;
	}
	
	public void setTipoSangue(TipoSangue tipoSangue) {
		this.tipoSangue = tipoSangue;
	}
	
	public void setFatorRh(FatorRh fatorRh) {
		this.fatorRh = fatorRh;
	}
	
	public void setQuantidadeMl(Long quantidadeMl) {
		this.quantidadeMl = quantidadeMl;
	}
	
	public void setMinimoMl(Long minimoMl) {
		this.minimoMl = minimoMl;
	}
	
	public void setDataAtualizacao(java.time.Instant dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	
	public void setHemocentro(HemocentroEntity hemocentro) {
		this.hemocentro = hemocentro;
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
	    if (!(obj instanceof EstoqueEntity)) {
	        return false;
	    }
	    EstoqueEntity other = (EstoqueEntity) obj;
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
		EstoqueEntityStringSerializer.INSTANCE.serialize(this, sb, appended);
	}
	
}
