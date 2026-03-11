package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



public class AjustarEstoqueInput {
    
    public String hemocentroId;
    
    public TipoSangue tipoSangue;
    
    public FatorRh fatorRh;
    
    public Double deltaMl;
    
    public Double minimoMl;
    
    
    public AjustarEstoqueInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public AjustarEstoqueInput(String hemocentroId, TipoSangue tipoSangue, FatorRh fatorRh, Double deltaMl, Double minimoMl) {
        this.hemocentroId = hemocentroId;
        this.tipoSangue = tipoSangue;
        this.fatorRh = fatorRh;
        this.deltaMl = deltaMl;
        this.minimoMl = minimoMl;
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
        if (tipoSangue != null) {
            ret = 31 * ret + tipoSangue.hashCode();
        }
        if (fatorRh != null) {
            ret = 31 * ret + fatorRh.hashCode();
        }
        if (deltaMl != null) {
            ret = 31 * ret + deltaMl.hashCode();
        }
        if (minimoMl != null) {
            ret = 31 * ret + minimoMl.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AjustarEstoqueInput)) {
            return false;
        }
        AjustarEstoqueInput other = (AjustarEstoqueInput) obj;
        if ((hemocentroId == null) != (other.hemocentroId == null)) {
            return false;
        }
        if ((hemocentroId != null) && !hemocentroId.equals(other.hemocentroId)) {
            return false;
        }
        if ((tipoSangue == null) != (other.tipoSangue == null)) {
            return false;
        }
        if ((tipoSangue != null) && !tipoSangue.equals(other.tipoSangue)) {
            return false;
        }
        if ((fatorRh == null) != (other.fatorRh == null)) {
            return false;
        }
        if ((fatorRh != null) && !fatorRh.equals(other.fatorRh)) {
            return false;
        }
        if ((deltaMl == null) != (other.deltaMl == null)) {
            return false;
        }
        if ((deltaMl != null) && !deltaMl.equals(other.deltaMl)) {
            return false;
        }
        if ((minimoMl == null) != (other.minimoMl == null)) {
            return false;
        }
        if ((minimoMl != null) && !minimoMl.equals(other.minimoMl)) {
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
    	AjustarEstoqueInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
