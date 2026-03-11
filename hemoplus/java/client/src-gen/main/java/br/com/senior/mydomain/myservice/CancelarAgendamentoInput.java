package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.Size;


public class CancelarAgendamentoInput {
    
    public String agendamentoId;
    
    @Size(max = 150, message = "motivo max length is {max}")
    public String motivo;
    
    
    public CancelarAgendamentoInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public CancelarAgendamentoInput(String agendamentoId, String motivo) {
        this.agendamentoId = agendamentoId;
        this.motivo = motivo;
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
        if (agendamentoId != null) {
            ret = 31 * ret + agendamentoId.hashCode();
        }
        if (motivo != null) {
            ret = 31 * ret + motivo.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelarAgendamentoInput)) {
            return false;
        }
        CancelarAgendamentoInput other = (CancelarAgendamentoInput) obj;
        if ((agendamentoId == null) != (other.agendamentoId == null)) {
            return false;
        }
        if ((agendamentoId != null) && !agendamentoId.equals(other.agendamentoId)) {
            return false;
        }
        if ((motivo == null) != (other.motivo == null)) {
            return false;
        }
        if ((motivo != null) && !motivo.equals(other.motivo)) {
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
    	CancelarAgendamentoInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
