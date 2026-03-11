package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.NotNull;
import javax.validation.Valid;
import javax.validation.constraints.Size;

import br.com.senior.messaging.model.EntityDescription;
import br.com.senior.messaging.model.EntityId;
import br.com.senior.custom.CustomDTO;

/**
 * agendamento e status da doacao
 */
@EntityDescription
public class Agendamento extends CustomDTO {
    
    public static class Id {
    	
        public String id;
        
        public Id() {
        }
        
        public Id(String agendamentoId) {
            this.id = agendamentoId;
        }
        
        public String getAgendamentoId() {
            return id;
        }
        
        public String getId() {
            return id;
        }
        
    	public void normalize(Map<String, Object> headers) {
    		MyServiceNormalizer.normalize(this, headers);
    	}
    	
    }
    
    public static class PagedResults {
    	public Long totalPages;
    	public Long totalElements;
    	
        public List<Agendamento> contents;
        
        public PagedResults() {
        }
        
        public PagedResults(List<Agendamento> contents) {
            this.contents = contents;
        }
        
        public PagedResults(List<Agendamento> contents, Long totalPages, Long totalElements) {
            this.contents = contents;
            this.totalPages = totalPages;
            this.totalElements = totalElements;
        }
    }
    
    public static class PageRequest {
        public Long offset;
        public Long size;
        public boolean translations;
        public String orderBy;
        public String filter;
        public List<String> displayFields;
        
        public PageRequest() {
        }
        
        public PageRequest(Long offset, Long size) {
            this(offset, size, null, null);
        }
        
        public PageRequest(Long offset, Long size, String orderBy) {
            this(offset, size, orderBy, null);
        }
        
        public PageRequest(Long offset, Long size, String orderBy, String filter) {
            this(offset, size, orderBy, filter, null);
       	}
        
        public PageRequest(Long offset, Long size, String orderBy, String filter, List<String> displayFields) {
            this.offset = offset;
        	this.size = size;
        	this.orderBy = orderBy;
        	this.filter = filter;
        	this.displayFields = displayFields;
        }
    }
    			    
    public static class GetRequest {
        public String id;
        public List<String> displayFields;
        public boolean translations;
        
        public GetRequest() {
        }
        
        public GetRequest(String id) {
            this(id, null);
        }
        
        public GetRequest(String id, List<String> displayFields) {
            this.id = id;
            this.displayFields = displayFields;
        }
    }

    @EntityId
    public String id;
    
    @NotNull(message = "dataHora is required")
    public java.time.Instant dataHora;
    
    @NotNull(message = "status is required")
    public StatusAgendamento status;
    
    @Size(max = 150, message = "observacao max length is {max}")
    public String observacao;
    
    @Size(max = 150, message = "motivoStatus max length is {max}")
    public String motivoStatus;
    
    public java.time.Instant dataCriacao;
    
    public java.time.Instant dataAtualizacao;
    
    @Size(max = 80, message = "token max length is {max}")
    public String token;
    
    public java.time.Instant tokenExpiraEm;
    
    public java.time.Instant tokenUsadoEm;
    
    @ValidEntity(message = "usuario.id is required")
    public Usuario usuario;
    
    @ValidEntity(message = "hemocentro.id is required")
    public Hemocentro hemocentro;
    
    @Valid
    public java.util.List<Doacao> doacoes;
    
    
	private List<JsonPatch> jsonPatches;
	
    public Agendamento() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public Agendamento(String id, java.time.Instant dataHora, StatusAgendamento status, String observacao, String motivoStatus, java.time.Instant dataCriacao, java.time.Instant dataAtualizacao, String token, java.time.Instant tokenExpiraEm, java.time.Instant tokenUsadoEm, Usuario usuario, Hemocentro hemocentro, java.util.List<Doacao> doacoes, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.dataHora = dataHora;
        this.status = status;
        this.observacao = observacao;
        this.motivoStatus = motivoStatus;
        this.dataCriacao = dataCriacao;
        this.dataAtualizacao = dataAtualizacao;
        this.token = token;
        this.tokenExpiraEm = tokenExpiraEm;
        this.tokenUsadoEm = tokenUsadoEm;
        this.usuario = usuario;
        this.hemocentro = hemocentro;
        this.doacoes = doacoes;
        this.jsonPatches = jsonPatches;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public Agendamento(java.time.Instant dataHora, StatusAgendamento status) {
        this.dataHora = dataHora;
        this.status = status;
    }
    
    public void normalize(Map<String, Object> headers) {
    	MyServiceNormalizer.normalize(this, headers);
    }
    
    public void validate() {
    	validate(true);
    }
    
    public void validate(boolean required) {
    	validate(null, true);
    }
    
    public void validate(Map<String, Object> headers, boolean required) {
    	validate(headers, required, new ArrayList<>());
    }
    
    void validate(Map<String, Object> headers, boolean required, List<Object> validated) {
    	MyServiceValidator.validate(this, headers, required, validated);
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
        if (!(obj instanceof Agendamento)) {
            return false;
        }
        Agendamento other = (Agendamento) obj;
        if (id == null || !id.equals(other.id)) {
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
    
    public void toString(StringBuilder sb, List<Object> appended) {
    	AgendamentoStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
	
    public List<JsonPatch> getJsonPatches(){
    	return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}
