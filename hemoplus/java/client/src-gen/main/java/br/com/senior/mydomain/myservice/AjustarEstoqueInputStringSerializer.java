package br.com.senior.mydomain.myservice;

import java.util.List;

public class AjustarEstoqueInputStringSerializer {
    
	public static final AjustarEstoqueInputStringSerializer INSTANCE = new AjustarEstoqueInputStringSerializer();
    
    public void serialize(AjustarEstoqueInput ajustarEstoqueInput, StringBuilder sb, List<Object> appended) {
		sb.append(ajustarEstoqueInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(ajustarEstoqueInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(ajustarEstoqueInput);
		serializeHemocentroId(ajustarEstoqueInput, sb);
		sb.append(", ");
		serializeTipoSangue(ajustarEstoqueInput, sb);
		sb.append(", ");
		serializeFatorRh(ajustarEstoqueInput, sb);
		sb.append(", ");
		serializeDeltaMl(ajustarEstoqueInput, sb);
		sb.append(", ");
		serializeMinimoMl(ajustarEstoqueInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeHemocentroId(AjustarEstoqueInput ajustarEstoqueInput, StringBuilder sb) {
		sb.append("hemocentroId=").append(ajustarEstoqueInput.hemocentroId == null ? "null" : ajustarEstoqueInput.hemocentroId);
	}
	
	protected void serializeTipoSangue(AjustarEstoqueInput ajustarEstoqueInput, StringBuilder sb) {
		sb.append("tipoSangue=").append(ajustarEstoqueInput.tipoSangue == null ? "null" : ajustarEstoqueInput.tipoSangue);
	}
	
	protected void serializeFatorRh(AjustarEstoqueInput ajustarEstoqueInput, StringBuilder sb) {
		sb.append("fatorRh=").append(ajustarEstoqueInput.fatorRh == null ? "null" : ajustarEstoqueInput.fatorRh);
	}
	
	protected void serializeDeltaMl(AjustarEstoqueInput ajustarEstoqueInput, StringBuilder sb) {
		sb.append("deltaMl=").append(ajustarEstoqueInput.deltaMl == null ? "null" : ajustarEstoqueInput.deltaMl);
	}
	
	protected void serializeMinimoMl(AjustarEstoqueInput ajustarEstoqueInput, StringBuilder sb) {
		sb.append("minimoMl=").append(ajustarEstoqueInput.minimoMl == null ? "null" : ajustarEstoqueInput.minimoMl);
	}
}
