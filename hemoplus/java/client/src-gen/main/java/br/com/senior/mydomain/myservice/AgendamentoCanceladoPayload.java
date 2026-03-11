package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class AgendamentoCanceladoPayload {
    
    @NotNull(message = "agendamentoId is required")
    public String agendamentoId;
    
    @NotNull(message = "usuarioId is required")
    public String usuarioId;
    
    @NotNull(message = "hemocentroId is required")
    public String hemocentroId;
    
    @NotNull(message = "dataHora is required")
    public java.time.Instant dataHora;
    
    @Size(max = 150, message = "motivo max length is {max}")
    public String motivo;
    
    
    public AgendamentoCanceladoPayload() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public AgendamentoCanceladoPayload(String agendamentoId, String usuarioId, String hemocentroId, java.time.Instant dataHora, String motivo) {
        this.agendamentoId = agendamentoId;
        this.usuarioId = usuarioId;
        this.hemocentroId = hemocentroId;
        this.dataHora = dataHora;
        this.motivo = motivo;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public AgendamentoCanceladoPayload(String agendamentoId, String usuarioId, String hemocentroId, java.time.Instant dataHora) {
        this.agendamentoId = agendamentoId;
        this.usuarioId = usuarioId;
        this.hemocentroId = hemocentroId;
        this.dataHora = dataHora;
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
        if (usuarioId != null) {
            ret = 31 * ret + usuarioId.hashCode();
        }
        if (hemocentroId != null) {
            ret = 31 * ret + hemocentroId.hashCode();
        }
        if (dataHora != null) {
            ret = 31 * ret + dataHora.hashCode();
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
        if (!(obj instanceof AgendamentoCanceladoPayload)) {
            return false;
        }
        AgendamentoCanceladoPayload other = (AgendamentoCanceladoPayload) obj;
        if ((agendamentoId == null) != (other.agendamentoId == null)) {
            return false;
        }
        if ((agendamentoId != null) && !agendamentoId.equals(other.agendamentoId)) {
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
        if ((dataHora == null) != (other.dataHora == null)) {
            return false;
        }
        if ((dataHora != null) && !dataHora.equals(other.dataHora)) {
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
    	AgendamentoCanceladoPayloadStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
