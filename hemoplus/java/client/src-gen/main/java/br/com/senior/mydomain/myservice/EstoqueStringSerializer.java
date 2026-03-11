package br.com.senior.mydomain.myservice;

import java.util.List;

public class EstoqueStringSerializer {
    
	public static final EstoqueStringSerializer INSTANCE = new EstoqueStringSerializer();
    
    public void serialize(Estoque estoque, StringBuilder sb, List<Object> appended) {
		sb.append(estoque.getClass().getSimpleName()).append(" [");
		if (appended.contains(estoque)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(estoque);
		serializeId(estoque, sb);
		sb.append(", ");
		serializeTipoSangue(estoque, sb);
		sb.append(", ");
		serializeFatorRh(estoque, sb);
		sb.append(", ");
		serializeQuantidadeMl(estoque, sb);
		sb.append(", ");
		serializeMinimoMl(estoque, sb);
		sb.append(", ");
		serializeDataAtualizacao(estoque, sb);
		sb.append(", ");
		serializeHemocentro(estoque, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(Estoque estoque, StringBuilder sb) {
		sb.append("id=").append(estoque.id == null ? "null" : estoque.id);
	}
	
	protected void serializeTipoSangue(Estoque estoque, StringBuilder sb) {
		sb.append("tipoSangue=").append(estoque.tipoSangue == null ? "null" : estoque.tipoSangue);
	}
	
	protected void serializeFatorRh(Estoque estoque, StringBuilder sb) {
		sb.append("fatorRh=").append(estoque.fatorRh == null ? "null" : estoque.fatorRh);
	}
	
	protected void serializeQuantidadeMl(Estoque estoque, StringBuilder sb) {
		sb.append("quantidadeMl=").append(estoque.quantidadeMl == null ? "null" : estoque.quantidadeMl);
	}
	
	protected void serializeMinimoMl(Estoque estoque, StringBuilder sb) {
		sb.append("minimoMl=").append(estoque.minimoMl == null ? "null" : estoque.minimoMl);
	}
	
	protected void serializeDataAtualizacao(Estoque estoque, StringBuilder sb) {
		sb.append("dataAtualizacao=").append(estoque.dataAtualizacao == null ? "null" : estoque.dataAtualizacao);
	}
	
	protected void serializeHemocentro(Estoque estoque, StringBuilder sb, List<Object> appended) {
		sb.append("hemocentro=<");
		if (estoque.hemocentro == null) {
			sb.append("null");
		} else {
			estoque.hemocentro.toString(sb, appended);
		}
		sb.append('>');
	}
}
