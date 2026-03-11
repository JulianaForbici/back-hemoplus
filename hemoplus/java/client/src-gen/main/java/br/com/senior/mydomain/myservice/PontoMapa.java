package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class PontoMapa {
    
    @NotNull(message = "id is required")
    public String id;
    
    @NotNull(message = "tipo is required")
    public String tipo;
    
    public String nome;
    
    @NotNull(message = "latitude is required")
    public Double latitude;
    
    @NotNull(message = "longitude is required")
    public Double longitude;
    
    
    public PontoMapa() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public PontoMapa(String id, String tipo, String nome, Double latitude, Double longitude) {
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public PontoMapa(String id, String tipo, Double latitude, Double longitude) {
        this.id = id;
        this.tipo = tipo;
        this.latitude = latitude;
        this.longitude = longitude;
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
        if (id != null) {
            ret = 31 * ret + id.hashCode();
        }
        if (tipo != null) {
            ret = 31 * ret + tipo.hashCode();
        }
        if (nome != null) {
            ret = 31 * ret + nome.hashCode();
        }
        if (latitude != null) {
            ret = 31 * ret + latitude.hashCode();
        }
        if (longitude != null) {
            ret = 31 * ret + longitude.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PontoMapa)) {
            return false;
        }
        PontoMapa other = (PontoMapa) obj;
        if ((id == null) != (other.id == null)) {
            return false;
        }
        if ((id != null) && !id.equals(other.id)) {
            return false;
        }
        if ((tipo == null) != (other.tipo == null)) {
            return false;
        }
        if ((tipo != null) && !tipo.equals(other.tipo)) {
            return false;
        }
        if ((nome == null) != (other.nome == null)) {
            return false;
        }
        if ((nome != null) && !nome.equals(other.nome)) {
            return false;
        }
        if ((latitude == null) != (other.latitude == null)) {
            return false;
        }
        if ((latitude != null) && !latitude.equals(other.latitude)) {
            return false;
        }
        if ((longitude == null) != (other.longitude == null)) {
            return false;
        }
        if ((longitude != null) && !longitude.equals(other.longitude)) {
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
    	PontoMapaStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
