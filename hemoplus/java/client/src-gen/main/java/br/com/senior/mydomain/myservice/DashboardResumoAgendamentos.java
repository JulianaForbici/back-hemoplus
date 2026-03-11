package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class DashboardResumoAgendamentos {
    
    @NotNull(message = "total is required")
    public Long total;
    
    @NotNull(message = "pendentes is required")
    public Long pendentes;
    
    @NotNull(message = "confirmados is required")
    public Long confirmados;
    
    @NotNull(message = "cancelados is required")
    public Long cancelados;
    
    @NotNull(message = "compareceu is required")
    public Long compareceu;
    
    @NotNull(message = "naoCompareceu is required")
    public Long naoCompareceu;
    
    @NotNull(message = "taxaComparecimento is required")
    public Double taxaComparecimento;
    
    
    public DashboardResumoAgendamentos() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public DashboardResumoAgendamentos(Long total, Long pendentes, Long confirmados, Long cancelados, Long compareceu, Long naoCompareceu, Double taxaComparecimento) {
        this.total = total;
        this.pendentes = pendentes;
        this.confirmados = confirmados;
        this.cancelados = cancelados;
        this.compareceu = compareceu;
        this.naoCompareceu = naoCompareceu;
        this.taxaComparecimento = taxaComparecimento;
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
        if (total != null) {
            ret = 31 * ret + total.hashCode();
        }
        if (pendentes != null) {
            ret = 31 * ret + pendentes.hashCode();
        }
        if (confirmados != null) {
            ret = 31 * ret + confirmados.hashCode();
        }
        if (cancelados != null) {
            ret = 31 * ret + cancelados.hashCode();
        }
        if (compareceu != null) {
            ret = 31 * ret + compareceu.hashCode();
        }
        if (naoCompareceu != null) {
            ret = 31 * ret + naoCompareceu.hashCode();
        }
        if (taxaComparecimento != null) {
            ret = 31 * ret + taxaComparecimento.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DashboardResumoAgendamentos)) {
            return false;
        }
        DashboardResumoAgendamentos other = (DashboardResumoAgendamentos) obj;
        if ((total == null) != (other.total == null)) {
            return false;
        }
        if ((total != null) && !total.equals(other.total)) {
            return false;
        }
        if ((pendentes == null) != (other.pendentes == null)) {
            return false;
        }
        if ((pendentes != null) && !pendentes.equals(other.pendentes)) {
            return false;
        }
        if ((confirmados == null) != (other.confirmados == null)) {
            return false;
        }
        if ((confirmados != null) && !confirmados.equals(other.confirmados)) {
            return false;
        }
        if ((cancelados == null) != (other.cancelados == null)) {
            return false;
        }
        if ((cancelados != null) && !cancelados.equals(other.cancelados)) {
            return false;
        }
        if ((compareceu == null) != (other.compareceu == null)) {
            return false;
        }
        if ((compareceu != null) && !compareceu.equals(other.compareceu)) {
            return false;
        }
        if ((naoCompareceu == null) != (other.naoCompareceu == null)) {
            return false;
        }
        if ((naoCompareceu != null) && !naoCompareceu.equals(other.naoCompareceu)) {
            return false;
        }
        if ((taxaComparecimento == null) != (other.taxaComparecimento == null)) {
            return false;
        }
        if ((taxaComparecimento != null) && !taxaComparecimento.equals(other.taxaComparecimento)) {
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
    	DashboardResumoAgendamentosStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
