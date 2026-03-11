/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.List;

public class EstoqueEntityStringSerializer {
	
	public static final EstoqueEntityStringSerializer INSTANCE = new EstoqueEntityStringSerializer();
    
    public void serialize(EstoqueEntity estoque, StringBuilder sb, List<Object> appended) {
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
		sb.append(", ").append(", ");
		sb.append(']');
	}
	
	protected void serializeId(EstoqueEntity estoque, StringBuilder sb) {
		sb.append("id=").append(estoque.getId() == null ? "null" : estoque.getId());
	}
	
	protected void serializeTipoSangue(EstoqueEntity estoque, StringBuilder sb) {
		sb.append("tipoSangue=").append(estoque.getTipoSangue() == null ? "null" : estoque.getTipoSangue());
	}
	
	protected void serializeFatorRh(EstoqueEntity estoque, StringBuilder sb) {
		sb.append("fatorRh=").append(estoque.getFatorRh() == null ? "null" : estoque.getFatorRh());
	}
	
	protected void serializeQuantidadeMl(EstoqueEntity estoque, StringBuilder sb) {
		sb.append("quantidadeMl=").append(estoque.getQuantidadeMl() == null ? "null" : estoque.getQuantidadeMl());
	}
	
	protected void serializeMinimoMl(EstoqueEntity estoque, StringBuilder sb) {
		sb.append("minimoMl=").append(estoque.getMinimoMl() == null ? "null" : estoque.getMinimoMl());
	}
	
	protected void serializeDataAtualizacao(EstoqueEntity estoque, StringBuilder sb) {
		sb.append("dataAtualizacao=").append(estoque.getDataAtualizacao() == null ? "null" : estoque.getDataAtualizacao());
	}
	
	protected void serializeHemocentro(EstoqueEntity estoque, StringBuilder sb, List<Object> appended) {
		sb.append("hemocentro=<");
		if (estoque.getHemocentro() == null) {
			sb.append("null");
		} else {
			estoque.getHemocentro().toString(sb, appended);
		}
		sb.append('>');
	}
}
