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

@Entity(name="my_domain.my_service.DoacaoEntity")
@ODataEntity(id = "doacao")
@Table(name="doacao")
public class DoacaoEntity extends CustomEntity implements Persistable<java.util.UUID> {
	
	public static final String SECURITY_RESOURCE = "res://senior.com.br/my_domain/my_service/entities/doacao";

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", updatable = false)
	private java.util.UUID id;
	
	@Column(name = "data_hora_confirmacao")
	private java.time.Instant dataHoraConfirmacao;
	
	@Column(name = "responsavel_validacao", length = 55)
	private String responsavelValidacao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usuario")
	private UsuarioEntity usuario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hemocentro")
	private HemocentroEntity hemocentro;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "agendamento")
	private AgendamentoEntity agendamento;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_sangue")
	private TipoSangue tipoSangue;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "fator_rh")
	private FatorRh fatorRh;
	
	@Transient
	private boolean _newEntity;
	
	@Override
	public java.util.UUID getPk() {
		return this.id;
	}
	
	@Override
	public String getServiceEntityName() {
		return "doacao";
	}
	
	public java.util.UUID getId() {
		return id;
	}
	
	public java.time.Instant getDataHoraConfirmacao() {
		return dataHoraConfirmacao;
	}
	
	public String getResponsavelValidacao() {
		return responsavelValidacao;
	}
	
	public UsuarioEntity getUsuario() {
		return usuario;
	}
	
	public HemocentroEntity getHemocentro() {
		return hemocentro;
	}
	
	public AgendamentoEntity getAgendamento() {
		return agendamento;
	}
	
	public TipoSangue getTipoSangue() {
		return tipoSangue;
	}
	
	public FatorRh getFatorRh() {
		return fatorRh;
	}
	
	public void setId(java.util.UUID id) {
		this.id = id;
	}
	
	public void setDataHoraConfirmacao(java.time.Instant dataHoraConfirmacao) {
		this.dataHoraConfirmacao = dataHoraConfirmacao;
	}
	
	public void setResponsavelValidacao(String responsavelValidacao) {
		this.responsavelValidacao = responsavelValidacao;
	}
	
	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
	}
	
	public void setHemocentro(HemocentroEntity hemocentro) {
		this.hemocentro = hemocentro;
	}
	
	public void setAgendamento(AgendamentoEntity agendamento) {
		this.agendamento = agendamento;
	}
	
	public void setTipoSangue(TipoSangue tipoSangue) {
		this.tipoSangue = tipoSangue;
	}
	
	public void setFatorRh(FatorRh fatorRh) {
		this.fatorRh = fatorRh;
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
	    if (!(obj instanceof DoacaoEntity)) {
	        return false;
	    }
	    DoacaoEntity other = (DoacaoEntity) obj;
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
		DoacaoEntityStringSerializer.INSTANCE.serialize(this, sb, appended);
	}
	
}
