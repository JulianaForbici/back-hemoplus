package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



public class ListarEstoquePorHemocentroInput {
    
    public String hemocentroId;
    
    
    public ListarEstoquePorHemocentroInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public ListarEstoquePorHemocentroInput(String hemocentroId) {
        this.hemocentroId = hemocentroId;
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
        if (hemocentroId != null) {
            ret = 31 * ret + hemocentroId.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListarEstoquePorHemocentroInput)) {
            return false;
        }
        ListarEstoquePorHemocentroInput other = (ListarEstoquePorHemocentroInput) obj;
        if ((hemocentroId == null) != (other.hemocentroId == null)) {
            return false;
        }
        if ((hemocentroId != null) && !hemocentroId.equals(other.hemocentroId)) {
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
    	ListarEstoquePorHemocentroInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
