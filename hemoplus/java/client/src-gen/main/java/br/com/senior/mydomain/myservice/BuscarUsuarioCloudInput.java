package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class BuscarUsuarioCloudInput {
    
    @NotNull(message = "usuarioCloud is required")
    public String usuarioCloud;
    
    
    public BuscarUsuarioCloudInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public BuscarUsuarioCloudInput(String usuarioCloud) {
        this.usuarioCloud = usuarioCloud;
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
        if (usuarioCloud != null) {
            ret = 31 * ret + usuarioCloud.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuscarUsuarioCloudInput)) {
            return false;
        }
        BuscarUsuarioCloudInput other = (BuscarUsuarioCloudInput) obj;
        if ((usuarioCloud == null) != (other.usuarioCloud == null)) {
            return false;
        }
        if ((usuarioCloud != null) && !usuarioCloud.equals(other.usuarioCloud)) {
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
    	BuscarUsuarioCloudInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
