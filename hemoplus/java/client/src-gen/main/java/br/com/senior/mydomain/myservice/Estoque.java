package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import br.com.senior.messaging.model.EntityDescription;
import br.com.senior.messaging.model.EntityId;
import br.com.senior.custom.CustomDTO;

/**
 * controle de estoque por hemocentro
 */
@EntityDescription
public class Estoque extends CustomDTO {
    
    public static class Id {
    	
        public String id;
        
        public Id() {
        }
        
        public Id(String estoqueId) {
            this.id = estoqueId;
        }
        
        public String getEstoqueId() {
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
    	
        public List<Estoque> contents;
        
        public PagedResults() {
        }
        
        public PagedResults(List<Estoque> contents) {
            this.contents = contents;
        }
        
        public PagedResults(List<Estoque> contents, Long totalPages, Long totalElements) {
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
    
    @NotNull(message = "tipoSangue is required")
    public TipoSangue tipoSangue;
    
    @NotNull(message = "fatorRh is required")
    public FatorRh fatorRh;
    
    @NotNull(message = "quantidadeMl is required")
    @Min(value = 0L, message = "quantidadeMl min value is {value}")
    public Long quantidadeMl;
    
    @NotNull(message = "minimoMl is required")
    @Min(value = 0L, message = "minimoMl min value is {value}")
    public Long minimoMl;
    
    @NotNull(message = "dataAtualizacao is required")
    public java.time.Instant dataAtualizacao;
    
    @ValidEntity(message = "hemocentro.id is required")
    public Hemocentro hemocentro;
    
    
	private List<JsonPatch> jsonPatches;
	
    public Estoque() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public Estoque(String id, TipoSangue tipoSangue, FatorRh fatorRh, Long quantidadeMl, Long minimoMl, java.time.Instant dataAtualizacao, Hemocentro hemocentro, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.tipoSangue = tipoSangue;
        this.fatorRh = fatorRh;
        this.quantidadeMl = quantidadeMl;
        this.minimoMl = minimoMl;
        this.dataAtualizacao = dataAtualizacao;
        this.hemocentro = hemocentro;
        this.jsonPatches = jsonPatches;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public Estoque(TipoSangue tipoSangue, FatorRh fatorRh, Long quantidadeMl, Long minimoMl, java.time.Instant dataAtualizacao) {
        this.tipoSangue = tipoSangue;
        this.fatorRh = fatorRh;
        this.quantidadeMl = quantidadeMl;
        this.minimoMl = minimoMl;
        this.dataAtualizacao = dataAtualizacao;
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
        if (!(obj instanceof Estoque)) {
            return false;
        }
        Estoque other = (Estoque) obj;
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
    	EstoqueStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
	
    public List<JsonPatch> getJsonPatches(){
    	return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}
