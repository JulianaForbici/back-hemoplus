package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



public class ListarPontosMapaInput {
    
    public String usuarioId;
    
    
    public ListarPontosMapaInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public ListarPontosMapaInput(String usuarioId) {
        this.usuarioId = usuarioId;
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
        if (usuarioId != null) {
            ret = 31 * ret + usuarioId.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListarPontosMapaInput)) {
            return false;
        }
        ListarPontosMapaInput other = (ListarPontosMapaInput) obj;
        if ((usuarioId == null) != (other.usuarioId == null)) {
            return false;
        }
        if ((usuarioId != null) && !usuarioId.equals(other.usuarioId)) {
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
    	ListarPontosMapaInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
