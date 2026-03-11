package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



public class BuscarDashboardResumoAgendamentosInput {
    
    public java.time.Instant dataInicio;
    
    public java.time.Instant dataFim;
    
    public String hemocentroId;
    
    
    public BuscarDashboardResumoAgendamentosInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public BuscarDashboardResumoAgendamentosInput(java.time.Instant dataInicio, java.time.Instant dataFim, String hemocentroId) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
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
        if (dataInicio != null) {
            ret = 31 * ret + dataInicio.hashCode();
        }
        if (dataFim != null) {
            ret = 31 * ret + dataFim.hashCode();
        }
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
        if (!(obj instanceof BuscarDashboardResumoAgendamentosInput)) {
            return false;
        }
        BuscarDashboardResumoAgendamentosInput other = (BuscarDashboardResumoAgendamentosInput) obj;
        if ((dataInicio == null) != (other.dataInicio == null)) {
            return false;
        }
        if ((dataInicio != null) && !dataInicio.equals(other.dataInicio)) {
            return false;
        }
        if ((dataFim == null) != (other.dataFim == null)) {
            return false;
        }
        if ((dataFim != null) && !dataFim.equals(other.dataFim)) {
            return false;
        }
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
    	BuscarDashboardResumoAgendamentosInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
