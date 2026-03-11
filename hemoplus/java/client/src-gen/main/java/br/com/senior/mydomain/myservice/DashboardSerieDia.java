package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class DashboardSerieDia {
    
    @NotNull(message = "dia is required")
    public java.time.LocalDate dia;
    
    @NotNull(message = "total is required")
    public Long total;
    
    @NotNull(message = "confirmados is required")
    public Long confirmados;
    
    @NotNull(message = "cancelados is required")
    public Long cancelados;
    
    @NotNull(message = "compareceu is required")
    public Long compareceu;
    
    @NotNull(message = "naoCompareceu is required")
    public Long naoCompareceu;
    
    
    public DashboardSerieDia() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public DashboardSerieDia(java.time.LocalDate dia, Long total, Long confirmados, Long cancelados, Long compareceu, Long naoCompareceu) {
        this.dia = dia;
        this.total = total;
        this.confirmados = confirmados;
        this.cancelados = cancelados;
        this.compareceu = compareceu;
        this.naoCompareceu = naoCompareceu;
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
        if (dia != null) {
            ret = 31 * ret + dia.hashCode();
        }
        if (total != null) {
            ret = 31 * ret + total.hashCode();
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
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DashboardSerieDia)) {
            return false;
        }
        DashboardSerieDia other = (DashboardSerieDia) obj;
        if ((dia == null) != (other.dia == null)) {
            return false;
        }
        if ((dia != null) && !dia.equals(other.dia)) {
            return false;
        }
        if ((total == null) != (other.total == null)) {
            return false;
        }
        if ((total != null) && !total.equals(other.total)) {
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
        return true;
    }
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	toString(sb, new ArrayList<>());
    	return sb.toString();
    }
    
    public void toString(StringBuilder sb, List<Object> appended) {
    	DashboardSerieDiaStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
