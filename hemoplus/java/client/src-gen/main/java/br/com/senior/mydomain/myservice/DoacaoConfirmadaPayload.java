package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class DoacaoConfirmadaPayload {
    
    @NotNull(message = "doacaoId is required")
    public String doacaoId;
    
    @NotNull(message = "usuarioId is required")
    public String usuarioId;
    
    @NotNull(message = "hemocentroId is required")
    public String hemocentroId;
    
    @NotNull(message = "agendamentoId is required")
    public String agendamentoId;
    
    @NotNull(message = "dataHoraConfirmacao is required")
    public java.time.Instant dataHoraConfirmacao;
    
    
    public DoacaoConfirmadaPayload() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public DoacaoConfirmadaPayload(String doacaoId, String usuarioId, String hemocentroId, String agendamentoId, java.time.Instant dataHoraConfirmacao) {
        this.doacaoId = doacaoId;
        this.usuarioId = usuarioId;
        this.hemocentroId = hemocentroId;
        this.agendamentoId = agendamentoId;
        this.dataHoraConfirmacao = dataHoraConfirmacao;
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
        if (doacaoId != null) {
            ret = 31 * ret + doacaoId.hashCode();
        }
        if (usuarioId != null) {
            ret = 31 * ret + usuarioId.hashCode();
        }
        if (hemocentroId != null) {
            ret = 31 * ret + hemocentroId.hashCode();
        }
        if (agendamentoId != null) {
            ret = 31 * ret + agendamentoId.hashCode();
        }
        if (dataHoraConfirmacao != null) {
            ret = 31 * ret + dataHoraConfirmacao.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoacaoConfirmadaPayload)) {
            return false;
        }
        DoacaoConfirmadaPayload other = (DoacaoConfirmadaPayload) obj;
        if ((doacaoId == null) != (other.doacaoId == null)) {
            return false;
        }
        if ((doacaoId != null) && !doacaoId.equals(other.doacaoId)) {
            return false;
        }
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
        if ((agendamentoId == null) != (other.agendamentoId == null)) {
            return false;
        }
        if ((agendamentoId != null) && !agendamentoId.equals(other.agendamentoId)) {
            return false;
        }
        if ((dataHoraConfirmacao == null) != (other.dataHoraConfirmacao == null)) {
            return false;
        }
        if ((dataHoraConfirmacao != null) && !dataHoraConfirmacao.equals(other.dataHoraConfirmacao)) {
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
    	DoacaoConfirmadaPayloadStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
