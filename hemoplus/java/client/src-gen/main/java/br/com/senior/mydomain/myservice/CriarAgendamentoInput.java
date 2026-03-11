package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.Size;


public class CriarAgendamentoInput {
    
    public String usuarioId;
    
    public String hemocentroId;
    
    public java.time.Instant dataHora;
    
    @Size(max = 150, message = "observacao max length is {max}")
    public String observacao;
    
    
    public CriarAgendamentoInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public CriarAgendamentoInput(String usuarioId, String hemocentroId, java.time.Instant dataHora, String observacao) {
        this.usuarioId = usuarioId;
        this.hemocentroId = hemocentroId;
        this.dataHora = dataHora;
        this.observacao = observacao;
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
        if (usuarioId != null) {
            ret = 31 * ret + usuarioId.hashCode();
        }
        if (hemocentroId != null) {
            ret = 31 * ret + hemocentroId.hashCode();
        }
        if (dataHora != null) {
            ret = 31 * ret + dataHora.hashCode();
        }
        if (observacao != null) {
            ret = 31 * ret + observacao.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CriarAgendamentoInput)) {
            return false;
        }
        CriarAgendamentoInput other = (CriarAgendamentoInput) obj;
        if ((usuarioId == null) != (other.usuarioId == null)) {
            return false;
        }
        if ((usuarioId != null) && !usuarioId.equals(other.usuarioId)) {
            return false;
        }
        if ((hemocentroId == null) != (other.hemocentroId == null)) {
            return false;
        }
        if ((hemocentroId != null) && !hemocentroId.equals(other.hemocentroId)) {
            return false;
        }
        if ((dataHora == null) != (other.dataHora == null)) {
            return false;
        }
        if ((dataHora != null) && !dataHora.equals(other.dataHora)) {
            return false;
        }
        if ((observacao == null) != (other.observacao == null)) {
            return false;
        }
        if ((observacao != null) && !observacao.equals(other.observacao)) {
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
    	CriarAgendamentoInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
