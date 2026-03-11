package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.Valid;


public class ListarPontosMapaOutput {
    
    @NotNull(message = "dados is required")
    @Valid
    public DadosMapa dados;
    
    
    public ListarPontosMapaOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public ListarPontosMapaOutput(DadosMapa dados) {
        this.dados = dados;
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
        if (dados != null) {
            ret = 31 * ret + dados.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListarPontosMapaOutput)) {
            return false;
        }
        ListarPontosMapaOutput other = (ListarPontosMapaOutput) obj;
        if ((dados == null) != (other.dados == null)) {
            return false;
        }
        if ((dados != null) && !dados.equals(other.dados)) {
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
    	ListarPontosMapaOutputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
