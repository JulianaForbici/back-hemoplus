/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.persistence.Id;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;

@Component("my_domain.my_service.UsuarioDTOConverter")
@Lazy
public class UsuarioDTOConverter {
	
	static final Logger logger = LoggerFactory.getLogger(UsuarioDTOConverter.class);
	
	private AgendamentoDTOConverter agendamentoDTOConverter;
	private DoacaoDTOConverter doacaoDTOConverter;
	
	@Inject
	public void setAgendamentoDTOConverter(AgendamentoDTOConverter agendamentoDTOConverter) {
		this.agendamentoDTOConverter = agendamentoDTOConverter;
	}
	
	@Inject
	public void setDoacaoDTOConverter(DoacaoDTOConverter doacaoDTOConverter) {
		this.doacaoDTOConverter = doacaoDTOConverter;
	}
	
	public UsuarioEntity toEntity(Usuario dto, boolean createMethod) {
		UsuarioEntity ret = toEntity(dto, new HashMap<>());
		if(createMethod){
			ret.defineAsNewEntity();
		}
		return ret;
	}

	public UsuarioEntity toEntity(Usuario dto) {
		return toEntity(dto, new HashMap<>());
	}
	
	UsuarioEntity toEntity(Usuario dto, java.util.Map<Object, Object> converted) {
		if (dto == null) {
			return null;
		}
		UsuarioEntity entity = (UsuarioEntity) converted.get(dto);
		if (entity != null) {
			return entity;
		}
		entity = new UsuarioEntity();
		converted.put(dto, entity);
		return mergeEntity(entity, dto, converted);
	}
	
	public UsuarioEntity mergeEntity(UsuarioEntity entity, Usuario dto) {
		return mergeEntity(entity, dto, new HashMap<>());
	}
	
	UsuarioEntity mergeEntity(UsuarioEntity entity, Usuario dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		if (dto.nomeCompleto != null) {
			entity.setNomeCompleto(dto.nomeCompleto);
		}
		if (dto.email != null) {
			entity.setEmail(dto.email);
		}
		if (dto.telefone != null) {
			entity.setTelefone(dto.telefone);
		}
		if (dto.cpf != null) {
			entity.setCpf(dto.cpf);
		}
		if (dto.dataNascimento != null) {
			entity.setDataNascimento(dto.dataNascimento);
		}
		if (dto.ativo != null) {
			entity.setAtivo(dto.ativo);
		}
		if (dto.dataCadastro != null) {
			entity.setDataCadastro(dto.dataCadastro);
		}
		// For composition attributes only not null attributes will be set to parent. You should use PUT/PATCH parent/{id}/child/{id} instead.
		if (dto.agendamentos != null) {
			if (dto.agendamentos.isEmpty()) {
				final java.util.List<AgendamentoEntity> listAgendamentos = new java.util.ArrayList<>();
				listAgendamentos.addAll(entity.getAgendamentos());
				for (AgendamentoEntity detail : listAgendamentos) {
					entity.removeFromAgendamentos(detail);
				}
			} else {
				for (AgendamentoEntity detail : agendamentoDTOConverter.toEntityList(dto.agendamentos, converted)) {
					entity.addToAgendamentos(detail);
				}
			}
		}
		
		if (dto.doacoes != null) {
			entity.getDoacoes().clear();
			for (DoacaoEntity detail : doacaoDTOConverter.toEntityList(dto.doacoes, converted)) {
				entity.addToDoacoes(detail);
			}
		}
		
		if (dto.tipoSangue != null) {
			entity.setTipoSangue(dto.tipoSangue);
		}
		if (dto.fatorRh != null) {
			entity.setFatorRh(dto.fatorRh);
		}
		if (dto.latitude != null) {
			entity.setLatitude(dto.latitude);
		}
		if (dto.longitude != null) {
			entity.setLongitude(dto.longitude);
		}
		if (dto.usuarioCloud != null) {
			entity.setUsuarioCloud(dto.usuarioCloud);
		}
		if (dto.tipoUsuario != null) {
			entity.setTipoUsuario(dto.tipoUsuario);
		}
		if (dto.cep != null) {
			entity.setCep(dto.cep);
		}
		if (dto.rua != null) {
			entity.setRua(dto.rua);
		}
		if (dto.numero != null) {
			entity.setNumero(dto.numero);
		}
		if (dto.complemento != null) {
			entity.setComplemento(dto.complemento);
		}
		if (dto.bairro != null) {
			entity.setBairro(dto.bairro);
		}
		if (dto.cidade != null) {
			entity.setCidade(dto.cidade);
		}
		if (dto.uf != null) {
			entity.setUf(dto.uf);
		}
		for (Map.Entry<String, Object> entry : dto.getCustom().entrySet()) {
			entity.setCustom(entry.getKey(), entry.getValue());
		}
		
        for (JsonPatch jsonPatch : dto.getJsonPatches()) {
            treatJsonPath(entity, jsonPatch);
        }
		
		return entity;
	}
	
	public UsuarioEntity updateEntity(UsuarioEntity entity, Usuario dto) {
		return updateEntity(entity, dto, new HashMap<>());
	}

	UsuarioEntity updateEntity(UsuarioEntity entity, Usuario dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		entity.setNomeCompleto(dto.nomeCompleto);
		entity.setEmail(dto.email);
		entity.setTelefone(dto.telefone);
		entity.setCpf(dto.cpf);
		entity.setDataNascimento(dto.dataNascimento);
		entity.setAtivo(dto.ativo);
		entity.setDataCadastro(dto.dataCadastro);
		// For composition attributes only not null attributes will be set to parent. You should use PUT/PATCH parent/{id}/child/{id} instead.
		if (dto.agendamentos != null) {
			if (dto.agendamentos.isEmpty()) {
				final java.util.List<AgendamentoEntity> listAgendamentos = new java.util.ArrayList<>();
				listAgendamentos.addAll(entity.getAgendamentos());
				for (AgendamentoEntity detail : listAgendamentos) {
					entity.removeFromAgendamentos(detail);
				}
			} else {
				for (AgendamentoEntity detail : agendamentoDTOConverter.toEntityList(dto.agendamentos, converted)) {
					entity.addToAgendamentos(detail);
				}
			}
		}
		
		if (dto.doacoes != null) {
			entity.getDoacoes().clear();
			for (DoacaoEntity detail : doacaoDTOConverter.toEntityList(dto.doacoes, converted)) {
				entity.addToDoacoes(detail);
			}
		}
		
		entity.setTipoSangue(dto.tipoSangue);
		entity.setFatorRh(dto.fatorRh);
		entity.setLatitude(dto.latitude);
		entity.setLongitude(dto.longitude);
		entity.setUsuarioCloud(dto.usuarioCloud);
		entity.setTipoUsuario(dto.tipoUsuario);
		entity.setCep(dto.cep);
		entity.setRua(dto.rua);
		entity.setNumero(dto.numero);
		entity.setComplemento(dto.complemento);
		entity.setBairro(dto.bairro);
		entity.setCidade(dto.cidade);
		entity.setUf(dto.uf);
		for (Map.Entry<String, Object> entry : dto.getCustom().entrySet()) {
			entity.setCustom(entry.getKey(), entry.getValue());
		}
		return entity;
	}
	
	public java.util.List<UsuarioEntity> toEntityList(java.util.List<Usuario> dtos) {
		return toEntityList(dtos, new HashMap<>());
	}
	
	java.util.List<UsuarioEntity> toEntityList(java.util.List<Usuario> dtos, java.util.Map<Object, Object> converted) {
		java.util.List<UsuarioEntity> entities = null;
		if (dtos != null) {
			entities = dtos.stream().map(dto -> toEntity(dto, converted)).collect(Collectors.toList());
		}	
		return entities;
	}
	
	public Usuario toDTO(UsuarioEntity entity) {
		return toDTO(entity, new HashMap<>());
	}
	
	Usuario toDTO(UsuarioEntity entity, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		Usuario dto = (Usuario) converted.get(entity);
		if (dto != null) {
			return dto;
		}
        dto = new Usuario();
        converted.put(entity, dto);

		dto.id = entity.getId() != null ? entity.getId().toString() : null;
		dto.nomeCompleto = entity.getNomeCompleto();
		dto.email = entity.getEmail();
		dto.telefone = entity.getTelefone();
		dto.cpf = entity.getCpf();
		dto.dataNascimento = entity.getDataNascimento();
		dto.ativo = entity.getAtivo();
		dto.dataCadastro = entity.getDataCadastro();
		dto.agendamentos = agendamentoDTOConverter.toDTOList(entity.getAgendamentos(), converted);
		dto.doacoes = doacaoDTOConverter.toDTOList(entity.getDoacoes(), converted);
		dto.tipoSangue = entity.getTipoSangue();
		dto.fatorRh = entity.getFatorRh();
		dto.latitude = entity.getLatitude();
		dto.longitude = entity.getLongitude();
		dto.usuarioCloud = entity.getUsuarioCloud();
		dto.tipoUsuario = entity.getTipoUsuario();
		dto.cep = entity.getCep();
		dto.rua = entity.getRua();
		dto.numero = entity.getNumero();
		dto.complemento = entity.getComplemento();
		dto.bairro = entity.getBairro();
		dto.cidade = entity.getCidade();
		dto.uf = entity.getUf();
		for(String customField : entity.getCustomFields()) {
			dto.setCustom(customField, entity.getCustom(customField));
		}
        return dto;
    }
	
	public Usuario toDTO(UsuarioEntity entity, List<String> displayFields) {
		return toDTO(entity, displayFields, new HashMap<>());
	}
	
	Usuario toDTO(UsuarioEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}
		
		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));
		
        Usuario dto = new Usuario();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		if (displayFields.stream().anyMatch(displayField -> "nomeCompleto".equals(displayField) || "*".equals(displayField))) {
			dto.nomeCompleto = entity.getNomeCompleto();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "email".equals(displayField) || "*".equals(displayField))) {
			dto.email = entity.getEmail();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "telefone".equals(displayField) || "*".equals(displayField))) {
			dto.telefone = entity.getTelefone();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "cpf".equals(displayField) || "*".equals(displayField))) {
			dto.cpf = entity.getCpf();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "dataNascimento".equals(displayField) || "*".equals(displayField))) {
			dto.dataNascimento = entity.getDataNascimento();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "ativo".equals(displayField) || "*".equals(displayField))) {
			dto.ativo = entity.getAtivo();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "dataCadastro".equals(displayField) || "*".equals(displayField))) {
			dto.dataCadastro = entity.getDataCadastro();
		}
		
		List<String> agendamentosDisplayFields = displayFields.stream()
			.filter(displayField -> displayField.trim().startsWith("agendamentos.")).map(f -> f.substring("agendamentos.".length() + f.indexOf("agendamentos.")).trim()).collect(Collectors.toList());
		if (!agendamentosDisplayFields.isEmpty()) {
			dto.agendamentos = new java.util.ArrayList<>();
			for (AgendamentoEntity agendamentoEntity : entity.getAgendamentos()) {
				dto.agendamentos.add(agendamentoDTOConverter.toDTO(agendamentoEntity, agendamentosDisplayFields, converted));
			}
		}
		
		List<String> doacoesDisplayFields = displayFields.stream()
			.filter(displayField -> displayField.trim().startsWith("doacoes.")).map(f -> f.substring("doacoes.".length() + f.indexOf("doacoes.")).trim()).collect(Collectors.toList());
		if (!doacoesDisplayFields.isEmpty()) {
			dto.doacoes = new java.util.ArrayList<>();
			for (DoacaoEntity doacaoEntity : entity.getDoacoes()) {
				dto.doacoes.add(doacaoDTOConverter.toDTO(doacaoEntity, doacoesDisplayFields, converted));
			}
		}
		
		if (displayFields.stream().anyMatch(displayField -> "tipoSangue".equals(displayField) || "*".equals(displayField))) {
			dto.tipoSangue = entity.getTipoSangue();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "fatorRh".equals(displayField) || "*".equals(displayField))) {
			dto.fatorRh = entity.getFatorRh();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "latitude".equals(displayField) || "*".equals(displayField))) {
			dto.latitude = entity.getLatitude();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "longitude".equals(displayField) || "*".equals(displayField))) {
			dto.longitude = entity.getLongitude();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "usuarioCloud".equals(displayField) || "*".equals(displayField))) {
			dto.usuarioCloud = entity.getUsuarioCloud();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "tipoUsuario".equals(displayField) || "*".equals(displayField))) {
			dto.tipoUsuario = entity.getTipoUsuario();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "cep".equals(displayField) || "*".equals(displayField))) {
			dto.cep = entity.getCep();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "rua".equals(displayField) || "*".equals(displayField))) {
			dto.rua = entity.getRua();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "numero".equals(displayField) || "*".equals(displayField))) {
			dto.numero = entity.getNumero();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "complemento".equals(displayField) || "*".equals(displayField))) {
			dto.complemento = entity.getComplemento();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "bairro".equals(displayField) || "*".equals(displayField))) {
			dto.bairro = entity.getBairro();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "cidade".equals(displayField) || "*".equals(displayField))) {
			dto.cidade = entity.getCidade();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "uf".equals(displayField) || "*".equals(displayField))) {
			dto.uf = entity.getUf();
		}
		for(String customField : entity.getCustomFields()) {
			dto.setCustom(customField, entity.getCustom(customField));
		}
        return dto;
    }
    
    Usuario toDTOforRelation(UsuarioEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}

		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));

        Usuario dto = new Usuario();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		if (displayFields.stream().anyMatch(displayField -> "nomeCompleto".equals(displayField) || "*".equals(displayField))) {
			dto.nomeCompleto = entity.getNomeCompleto();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "email".equals(displayField) || "*".equals(displayField))) {
			dto.email = entity.getEmail();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "telefone".equals(displayField) || "*".equals(displayField))) {
			dto.telefone = entity.getTelefone();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "cpf".equals(displayField) || "*".equals(displayField))) {
			dto.cpf = entity.getCpf();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "dataNascimento".equals(displayField) || "*".equals(displayField))) {
			dto.dataNascimento = entity.getDataNascimento();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "ativo".equals(displayField) || "*".equals(displayField))) {
			dto.ativo = entity.getAtivo();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "dataCadastro".equals(displayField) || "*".equals(displayField))) {
			dto.dataCadastro = entity.getDataCadastro();
		}
		
		
		
		if (displayFields.stream().anyMatch(displayField -> "tipoSangue".equals(displayField) || "*".equals(displayField))) {
			dto.tipoSangue = entity.getTipoSangue();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "fatorRh".equals(displayField) || "*".equals(displayField))) {
			dto.fatorRh = entity.getFatorRh();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "latitude".equals(displayField) || "*".equals(displayField))) {
			dto.latitude = entity.getLatitude();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "longitude".equals(displayField) || "*".equals(displayField))) {
			dto.longitude = entity.getLongitude();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "usuarioCloud".equals(displayField) || "*".equals(displayField))) {
			dto.usuarioCloud = entity.getUsuarioCloud();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "tipoUsuario".equals(displayField) || "*".equals(displayField))) {
			dto.tipoUsuario = entity.getTipoUsuario();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "cep".equals(displayField) || "*".equals(displayField))) {
			dto.cep = entity.getCep();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "rua".equals(displayField) || "*".equals(displayField))) {
			dto.rua = entity.getRua();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "numero".equals(displayField) || "*".equals(displayField))) {
			dto.numero = entity.getNumero();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "complemento".equals(displayField) || "*".equals(displayField))) {
			dto.complemento = entity.getComplemento();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "bairro".equals(displayField) || "*".equals(displayField))) {
			dto.bairro = entity.getBairro();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "cidade".equals(displayField) || "*".equals(displayField))) {
			dto.cidade = entity.getCidade();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "uf".equals(displayField) || "*".equals(displayField))) {
			dto.uf = entity.getUf();
		}
        return dto;
    }
    
    public java.util.List<Usuario> toDTOList(java.util.List<UsuarioEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Usuario> toDTOList(java.util.List<UsuarioEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Usuario> dtos = null;
    	if (entities != null) {
    		dtos = entities.stream().map(entity -> toDTO(entity, converted)).collect(Collectors.toList());
    	}
    	return dtos;
    }
    
    public java.util.List<Usuario> toDTOList(java.util.Set<UsuarioEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Usuario> toDTOList(java.util.Set<UsuarioEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Usuario> dtos = null;
    	if (entities != null) {
    		dtos = entities.stream().map(entity -> toDTO(entity, converted)).collect(Collectors.toList());
    	}
    	return dtos;
    }
    
        
	private static Set<Field> findFields(Class<?> clazz, Class<? extends Annotation> ann) {
		Set<Field> set = new HashSet<>();
		Class<?> c = clazz;
		while (c != null) {
			for (Field field : c.getDeclaredFields()) {
				if (field.isAnnotationPresent(ann)) {
					set.add(field);
				}
			}
			c = c.getSuperclass();
		}
		return set;
	}
	
	private void treatJsonPath(UsuarioEntity entity, JsonPatch jsonPatch) {
		if (!JsonPatch.REMOVE_OPERATION.equals(jsonPatch.getOp())){
			return;
		}
		
		if("id".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setId(null);
		}
		if("nomeCompleto".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setNomeCompleto(null);
		}
		if("email".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setEmail(null);
		}
		if("telefone".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setTelefone(null);
		}
		if("cpf".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setCpf(null);
		}
		if("dataNascimento".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setDataNascimento(null);
		}
		if("ativo".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setAtivo(null);
		}
		if("dataCadastro".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setDataCadastro(null);
		}
		if("agendamentos".equals(jsonPatch.getPath().replace("/", ""))) {
			for (AgendamentoEntity e : new java.util.ArrayList<>(entity.getAgendamentos())) {
				entity.removeFromAgendamentos(e);
			}
		}
		if("doacoes".equals(jsonPatch.getPath().replace("/", ""))) {
			for (DoacaoEntity e : new java.util.ArrayList<>(entity.getDoacoes())) {
				entity.removeFromDoacoes(e);
			}
		}
		if("tipoSangue".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setTipoSangue(null);
		}
		if("fatorRh".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setFatorRh(null);
		}
		if("latitude".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setLatitude(null);
		}
		if("longitude".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setLongitude(null);
		}
		if("usuarioCloud".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setUsuarioCloud(null);
		}
		if("tipoUsuario".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setTipoUsuario(null);
		}
		if("cep".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setCep(null);
		}
		if("rua".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setRua(null);
		}
		if("numero".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setNumero(null);
		}
		if("complemento".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setComplemento(null);
		}
		if("bairro".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setBairro(null);
		}
		if("cidade".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setCidade(null);
		}
		if("uf".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setUf(null);
		}
	}
}
