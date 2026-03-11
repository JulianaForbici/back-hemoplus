package br.com.senior.mydomain.myservice;

import java.util.List;

public class DadosMapaStringSerializer {
    
	public static final DadosMapaStringSerializer INSTANCE = new DadosMapaStringSerializer();
    
    public void serialize(DadosMapa dadosMapa, StringBuilder sb, List<Object> appended) {
		sb.append(dadosMapa.getClass().getSimpleName()).append(" [");
		if (appended.contains(dadosMapa)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(dadosMapa);
		serializeUsuario(dadosMapa, sb, appended);
		sb.append(", ");
		serializeHemocentros(dadosMapa, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeUsuario(DadosMapa dadosMapa, StringBuilder sb, List<Object> appended) {
		sb.append("usuario=<");
		if (dadosMapa.usuario == null) {
			sb.append("null");
		} else {
			dadosMapa.usuario.toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeHemocentros(DadosMapa dadosMapa, StringBuilder sb, List<Object> appended) {
		sb.append("hemocentros=<");
		if (dadosMapa.hemocentros == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = dadosMapa.hemocentros.size() - 1;
			for (int i = 0; i <= last; i++) {
				dadosMapa.hemocentros.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}
