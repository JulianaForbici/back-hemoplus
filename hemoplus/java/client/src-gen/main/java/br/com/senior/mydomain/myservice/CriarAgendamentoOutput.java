package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.Valid;


public class CriarAgendamentoOutput {
    
    @NotNull(message = "retorno is required")
    @Valid
    public Retorno retorno;
    
    @Valid
    public Agendamento agendamento;
    
    
    public CriarAgendamentoOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public CriarAgendamentoOutput(Retorno retorno, Agendamento agendamento) {
        this.retorno = retorno;
        this.agendamento = agendamento;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public CriarAgendamentoOutput(Retorno retorno) {
        this.retorno = retorno;
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
        if (retorno != null) {
            ret = 31 * ret + retorno.hashCode();
        }
        if (agendamento != null) {
            ret = 31 * ret + agendamento.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CriarAgendamentoOutput)) {
            return false;
        }
        CriarAgendamentoOutput other = (CriarAgendamentoOutput) obj;
        if ((retorno == null) != (other.retorno == null)) {
            return false;
        }
        if ((retorno != null) && !retorno.equals(other.retorno)) {
            return false;
        }
        if ((agendamento == null) != (other.agendamento == null)) {
            return false;
        }
        if ((agendamento != null) && !agendamento.equals(other.agendamento)) {
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
    	CriarAgendamentoOutputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
