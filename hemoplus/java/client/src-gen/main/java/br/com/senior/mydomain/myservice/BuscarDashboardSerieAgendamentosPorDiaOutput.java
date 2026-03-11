package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.Valid;


public class BuscarDashboardSerieAgendamentosPorDiaOutput {
    
    @NotNull(message = "retorno is required")
    @Valid
    public Retorno retorno;
    
    @NotEmpty(message = "itens is required, at least one value must be present")
    @Valid
    public java.util.List<DashboardSerieDia> itens;
    
    
    public BuscarDashboardSerieAgendamentosPorDiaOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public BuscarDashboardSerieAgendamentosPorDiaOutput(Retorno retorno, java.util.List<DashboardSerieDia> itens) {
        this.retorno = retorno;
        this.itens = itens;
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
        if (itens != null) {
            ret = 31 * ret + itens.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuscarDashboardSerieAgendamentosPorDiaOutput)) {
            return false;
        }
        BuscarDashboardSerieAgendamentosPorDiaOutput other = (BuscarDashboardSerieAgendamentosPorDiaOutput) obj;
        if ((retorno == null) != (other.retorno == null)) {
            return false;
        }
        if ((retorno != null) && !retorno.equals(other.retorno)) {
            return false;
        }
        if ((itens == null) != (other.itens == null)) {
            return false;
        }
        if ((itens != null) && !itens.equals(other.itens)) {
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
    	BuscarDashboardSerieAgendamentosPorDiaOutputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
