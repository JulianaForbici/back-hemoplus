package br.com.senior.mydomain.myservice;

import java.util.List;

public class PontoMapaStringSerializer {
    
	public static final PontoMapaStringSerializer INSTANCE = new PontoMapaStringSerializer();
    
    public void serialize(PontoMapa pontoMapa, StringBuilder sb, List<Object> appended) {
		sb.append(pontoMapa.getClass().getSimpleName()).append(" [");
		if (appended.contains(pontoMapa)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(pontoMapa);
		serializeId(pontoMapa, sb);
		sb.append(", ");
		serializeTipo(pontoMapa, sb);
		sb.append(", ");
		serializeNome(pontoMapa, sb);
		sb.append(", ");
		serializeLatitude(pontoMapa, sb);
		sb.append(", ");
		serializeLongitude(pontoMapa, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(PontoMapa pontoMapa, StringBuilder sb) {
		sb.append("id=").append(pontoMapa.id == null ? "null" : pontoMapa.id);
	}
	
	protected void serializeTipo(PontoMapa pontoMapa, StringBuilder sb) {
		sb.append("tipo=").append(pontoMapa.tipo == null ? "null" : pontoMapa.tipo);
	}
	
	protected void serializeNome(PontoMapa pontoMapa, StringBuilder sb) {
		sb.append("nome=").append(pontoMapa.nome == null ? "null" : pontoMapa.nome);
	}
	
	protected void serializeLatitude(PontoMapa pontoMapa, StringBuilder sb) {
		sb.append("latitude=").append(pontoMapa.latitude == null ? "null" : pontoMapa.latitude);
	}
	
	protected void serializeLongitude(PontoMapa pontoMapa, StringBuilder sb) {
		sb.append("longitude=").append(pontoMapa.longitude == null ? "null" : pontoMapa.longitude);
	}
}
