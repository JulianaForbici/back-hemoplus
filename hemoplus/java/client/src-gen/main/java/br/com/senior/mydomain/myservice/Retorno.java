package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


/**
 * records de apoio
 */
public class Retorno {
    
    @NotNull(message = "mensagem is required")
    public String mensagem;
    
    public String codigo;
    
    public Boolean contemErro = false;
    
    
    public Retorno() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public Retorno(String mensagem, String codigo, Boolean contemErro) {
        this.mensagem = mensagem;
        this.codigo = codigo;
        this.contemErro = contemErro != null ? contemErro : false;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public Retorno(String mensagem) {
        this.mensagem = mensagem;
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
        if (mensagem != null) {
            ret = 31 * ret + mensagem.hashCode();
        }
        if (codigo != null) {
            ret = 31 * ret + codigo.hashCode();
        }
        if (contemErro != null) {
            ret = 31 * ret + contemErro.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Retorno)) {
            return false;
        }
        Retorno other = (Retorno) obj;
        if ((mensagem == null) != (other.mensagem == null)) {
            return false;
        }
        if ((mensagem != null) && !mensagem.equals(other.mensagem)) {
            return false;
        }
        if ((codigo == null) != (other.codigo == null)) {
            return false;
        }
        if ((codigo != null) && !codigo.equals(other.codigo)) {
            return false;
        }
        if ((contemErro == null) != (other.contemErro == null)) {
            return false;
        }
        if ((contemErro != null) && !contemErro.equals(other.contemErro)) {
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
    	RetornoStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
