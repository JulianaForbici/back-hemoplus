package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.Valid;


public class BuscarDashboardResumoAgendamentosOutput {
    
    @NotNull(message = "retorno is required")
    @Valid
    public Retorno retorno;
    
    @Valid
    public DashboardResumoAgendamentos resumo;
    
    
    public BuscarDashboardResumoAgendamentosOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public BuscarDashboardResumoAgendamentosOutput(Retorno retorno, DashboardResumoAgendamentos resumo) {
        this.retorno = retorno;
        this.resumo = resumo;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public BuscarDashboardResumoAgendamentosOutput(Retorno retorno) {
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
        if (resumo != null) {
            ret = 31 * ret + resumo.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuscarDashboardResumoAgendamentosOutput)) {
            return false;
        }
        BuscarDashboardResumoAgendamentosOutput other = (BuscarDashboardResumoAgendamentosOutput) obj;
        if ((retorno == null) != (other.retorno == null)) {
            return false;
        }
        if ((retorno != null) && !retorno.equals(other.retorno)) {
            return false;
        }
        if ((resumo == null) != (other.resumo == null)) {
            return false;
        }
        if ((resumo != null) && !resumo.equals(other.resumo)) {
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
    	BuscarDashboardResumoAgendamentosOutputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
