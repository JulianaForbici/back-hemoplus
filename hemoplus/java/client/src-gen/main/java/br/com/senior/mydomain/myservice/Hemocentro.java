package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.senior.messaging.model.EntityDescription;
import br.com.senior.messaging.model.EntityId;
import br.com.senior.custom.CustomDTO;

@EntityDescription
public class Hemocentro extends CustomDTO {
    
    public static class Id {
    	
        public String id;
        
        public Id() {
        }
        
        public Id(String hemocentroId) {
            this.id = hemocentroId;
        }
        
        public String getHemocentroId() {
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
    	
        public List<Hemocentro> contents;
        
        public PagedResults() {
        }
        
        public PagedResults(List<Hemocentro> contents) {
            this.contents = contents;
        }
        
        public PagedResults(List<Hemocentro> contents, Long totalPages, Long totalElements) {
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
    
    @NotNull(message = "nome is required")
    @Size(max = 60, message = "nome max length is {max}")
    public String nome;
    
    @NotNull(message = "rua is required")
    @Size(max = 60, message = "rua max length is {max}")
    public String rua;
    
    @Size(max = 10, message = "numero max length is {max}")
    public String numero;
    
    @Size(max = 40, message = "bairro max length is {max}")
    public String bairro;
    
    @NotNull(message = "cidade is required")
    @Size(max = 40, message = "cidade max length is {max}")
    public String cidade;
    
    @NotNull(message = "uf is required")
    @Size(max = 2, message = "uf max length is {max}")
    public String uf;
    
    @Size(max = 9, message = "cep max length is {max}")
    public String cep;
    
    public Double latitude;
    
    public Double longitude;
    
    @Size(max = 20, message = "telefone max length is {max}")
    public String telefone;
    
    public Boolean ativo = true;
    
    @ValidEntity(message = "agendamentos.id is required")
    public java.util.List<Agendamento> agendamentos;
    
    @ValidEntity(message = "doacoes.id is required")
    public java.util.List<Doacao> doacoes;
    
    @ValidEntity(message = "estoques.id is required")
    public java.util.List<Estoque> estoques;
    
    
	private List<JsonPatch> jsonPatches;
	
    public Hemocentro() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public Hemocentro(String id, String nome, String rua, String numero, String bairro, String cidade, String uf, String cep, Double latitude, Double longitude, String telefone, Boolean ativo, java.util.List<Agendamento> agendamentos, java.util.List<Doacao> doacoes, java.util.List<Estoque> estoques, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.latitude = latitude;
        this.longitude = longitude;
        this.telefone = telefone;
        this.ativo = ativo != null ? ativo : true;
        this.agendamentos = agendamentos;
        this.doacoes = doacoes;
        this.estoques = estoques;
        this.jsonPatches = jsonPatches;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public Hemocentro(String nome, String rua, String cidade, String uf) {
        this.nome = nome;
        this.rua = rua;
        this.cidade = cidade;
        this.uf = uf;
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
        if (!(obj instanceof Hemocentro)) {
            return false;
        }
        Hemocentro other = (Hemocentro) obj;
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
    	HemocentroStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
	
    public List<JsonPatch> getJsonPatches(){
    	return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}
