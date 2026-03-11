package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;


public class BuscarUsuarioCloudOutput {
    
    @Valid
    public Usuario usuario;
    
    
    public BuscarUsuarioCloudOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public BuscarUsuarioCloudOutput(Usuario usuario) {
        this.usuario = usuario;
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
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuscarUsuarioCloudOutput)) {
            return false;
        }
        BuscarUsuarioCloudOutput other = (BuscarUsuarioCloudOutput) obj;
        if ((usuario == null) != (other.usuario == null)) {
            return false;
        }
        if ((usuario != null) && !usuario.equals(other.usuario)) {
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
    	BuscarUsuarioCloudOutputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
