package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotEmpty;
import javax.validation.Valid;


public class DadosMapa {
    
    @Valid
    public PontoMapa usuario;
    
    @NotEmpty(message = "hemocentros is required, at least one value must be present")
    @Valid
    public java.util.List<PontoMapa> hemocentros;
    
    
    public DadosMapa() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public DadosMapa(PontoMapa usuario, java.util.List<PontoMapa> hemocentros) {
        this.usuario = usuario;
        this.hemocentros = hemocentros;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public DadosMapa(java.util.List<PontoMapa> hemocentros) {
        this.hemocentros = hemocentros;
    }
    
    public void validate() {
        validate(true);
    }
    
    public void validate(boolean required) {
        validate(null, required);
    }
    
    public void validate(Map<String, Object> headers, boolean required) {
    	validate(headers, required, new ArrayList<>());
    }
    
    public void validate(Map<String, Object> headers, boolean required, List<Object> validated) {
    	MyServiceValidator.validate(this, headers, required, validated);
    }
    @Override
    public int hashCode() {
        int ret = 1;
        if (usuario != null) {
            ret = 31 * ret + usuario.hashCode();
        }
        if (hemocentros != null) {
            ret = 31 * ret + hemocentros.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DadosMapa)) {
            return false;
        }
        DadosMapa other = (DadosMapa) obj;
        if ((usuario == null) != (other.usuario == null)) {
            return false;
        }
        if ((usuario != null) && !usuario.equals(other.usuario)) {
            return false;
        }
        if ((hemocentros == null) != (other.hemocentros == null)) {
            return false;
        }
        if ((hemocentros != null) && !hemocentros.equals(other.hemocentros)) {
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
    	DadosMapaStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
