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
 * entidades principais
 */
@EntityDescription
public class Usuario extends CustomDTO {
    
    public static class Id {
    	
        public String id;
        
        public Id() {
        }
        
        public Id(String usuarioId) {
            this.id = usuarioId;
        }
        
        public String getUsuarioId() {
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
    	
        public List<Usuario> contents;
        
        public PagedResults() {
        }
        
        public PagedResults(List<Usuario> contents) {
            this.contents = contents;
        }
        
        public PagedResults(List<Usuario> contents, Long totalPages, Long totalElements) {
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
    
    @NotNull(message = "nomeCompleto is required")
    @Size(max = 80, message = "nomeCompleto max length is {max}")
    public String nomeCompleto;
    
    @NotNull(message = "email is required")
    @Size(max = 120, message = "email max length is {max}")
    public String email;
    
    @NotNull(message = "telefone is required")
    @Size(max = 20, message = "telefone max length is {max}")
    public String telefone;
    
    @NotNull(message = "cpf is required")
    @Size(max = 11, message = "cpf max length is {max}")
    public String cpf;
    
    public java.time.LocalDate dataNascimento;
    
    public Boolean ativo = true;
    
    public java.time.Instant dataCadastro;
    
    @Valid
    public java.util.List<Agendamento> agendamentos;
    
    @ValidEntity(message = "doacoes.id is required")
    public java.util.List<Doacao> doacoes;
    
    @NotNull(message = "tipoSangue is required")
    public TipoSangue tipoSangue;
    
    @NotNull(message = "fatorRh is required")
    public FatorRh fatorRh;
    
    public Double latitude;
    
    public Double longitude;
    
    @NotNull(message = "usuarioCloud is required")
    @Size(max = 120, message = "usuarioCloud max length is {max}")
    public String usuarioCloud;
    
    @NotNull(message = "tipoUsuario is required")
    public TipoUsuario tipoUsuario;
    
    @Size(max = 9, message = "cep max length is {max}")
    public String cep;
    
    @Size(max = 80, message = "rua max length is {max}")
    public String rua;
    
    @Size(max = 10, message = "numero max length is {max}")
    public String numero;
    
    @Size(max = 60, message = "complemento max length is {max}")
    public String complemento;
    
    @Size(max = 40, message = "bairro max length is {max}")
    public String bairro;
    
    @Size(max = 40, message = "cidade max length is {max}")
    public String cidade;
    
    @Size(max = 2, message = "uf max length is {max}")
    public String uf;
    
    
	private List<JsonPatch> jsonPatches;
	
    public Usuario() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public Usuario(String id, String nomeCompleto, String email, String telefone, String cpf, java.time.LocalDate dataNascimento, Boolean ativo, java.time.Instant dataCadastro, java.util.List<Agendamento> agendamentos, java.util.List<Doacao> doacoes, TipoSangue tipoSangue, FatorRh fatorRh, Double latitude, Double longitude, String usuarioCloud, TipoUsuario tipoUsuario, String cep, String rua, String numero, String complemento, String bairro, String cidade, String uf, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.ativo = ativo != null ? ativo : true;
        this.dataCadastro = dataCadastro;
        this.agendamentos = agendamentos;
        this.doacoes = doacoes;
        this.tipoSangue = tipoSangue;
        this.fatorRh = fatorRh;
        this.latitude = latitude;
        this.longitude = longitude;
        this.usuarioCloud = usuarioCloud;
        this.tipoUsuario = tipoUsuario;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.jsonPatches = jsonPatches;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public Usuario(String nomeCompleto, String email, String telefone, String cpf, TipoSangue tipoSangue, FatorRh fatorRh, String usuarioCloud, TipoUsuario tipoUsuario) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.tipoSangue = tipoSangue;
        this.fatorRh = fatorRh;
        this.usuarioCloud = usuarioCloud;
        this.tipoUsuario = tipoUsuario;
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
        if (!(obj instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) obj;
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
    	UsuarioStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
	
    public List<JsonPatch> getJsonPatches(){
    	return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}
