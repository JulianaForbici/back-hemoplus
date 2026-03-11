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

@Component("my_domain.my_service.AgendamentoDTOConverter")
@Lazy
public class AgendamentoDTOConverter {
	
	static final Logger logger = LoggerFactory.getLogger(AgendamentoDTOConverter.class);
	
	private UsuarioDTOConverter usuarioDTOConverter;
	private HemocentroDTOConverter hemocentroDTOConverter;
	private DoacaoDTOConverter doacaoDTOConverter;
	
	@Inject
	public void setUsuarioDTOConverter(UsuarioDTOConverter usuarioDTOConverter) {
		this.usuarioDTOConverter = usuarioDTOConverter;
	}
	
	@Inject
	public void setHemocentroDTOConverter(HemocentroDTOConverter hemocentroDTOConverter) {
		this.hemocentroDTOConverter = hemocentroDTOConverter;
	}
	
	@Inject
	public void setDoacaoDTOConverter(DoacaoDTOConverter doacaoDTOConverter) {
		this.doacaoDTOConverter = doacaoDTOConverter;
	}
	
	public AgendamentoEntity toEntity(Agendamento dto, boolean createMethod) {
		AgendamentoEntity ret = toEntity(dto, new HashMap<>());
		if(createMethod){
			ret.defineAsNewEntity();
		}
		return ret;
	}

	public AgendamentoEntity toEntity(Agendamento dto) {
		return toEntity(dto, new HashMap<>());
	}
	
	AgendamentoEntity toEntity(Agendamento dto, java.util.Map<Object, Object> converted) {
		if (dto == null) {
			return null;
		}
		AgendamentoEntity entity = (AgendamentoEntity) converted.get(dto);
		if (entity != null) {
			return entity;
		}
		entity = new AgendamentoEntity();
		converted.put(dto, entity);
		return mergeEntity(entity, dto, converted);
	}
	
	public AgendamentoEntity mergeEntity(AgendamentoEntity entity, Agendamento dto) {
		return mergeEntity(entity, dto, new HashMap<>());
	}
	
	AgendamentoEntity mergeEntity(AgendamentoEntity entity, Agendamento dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		if (dto.dataHora != null) {
			entity.setDataHora(dto.dataHora);
		}
		if (dto.status != null) {
			entity.setStatus(dto.status);
		}
		if (dto.observacao != null) {
			entity.setObservacao(dto.observacao);
		}
		if (dto.motivoStatus != null) {
			entity.setMotivoStatus(dto.motivoStatus);
		}
		if (dto.dataCriacao != null) {
			entity.setDataCriacao(dto.dataCriacao);
		}
		if (dto.dataAtualizacao != null) {
			entity.setDataAtualizacao(dto.dataAtualizacao);
		}
		if (dto.token != null) {
			entity.setToken(dto.token);
		}
		if (dto.tokenExpiraEm != null) {
			entity.setTokenExpiraEm(dto.tokenExpiraEm);
		}
		if (dto.tokenUsadoEm != null) {
			entity.setTokenUsadoEm(dto.tokenUsadoEm);
		}
		if (dto.usuario != null) {
			entity.setUsuario(usuarioDTOConverter.toEntity(dto.usuario, converted));
		}
		
		if (dto.hemocentro != null) {
			entity.setHemocentro(hemocentroDTOConverter.toEntity(dto.hemocentro, converted));
		}
		
		// For composition attributes only not null attributes will be set to parent. You should use PUT/PATCH parent/{id}/child/{id} instead.
		if (dto.doacoes != null) {
			if (dto.doacoes.isEmpty()) {
				final java.util.List<DoacaoEntity> listDoacoes = new java.util.ArrayList<>();
				listDoacoes.addAll(entity.getDoacoes());
				for (DoacaoEntity detail : listDoacoes) {
					entity.removeFromDoacoes(detail);
				}
			} else {
				for (DoacaoEntity detail : doacaoDTOConverter.toEntityList(dto.doacoes, converted)) {
					entity.addToDoacoes(detail);
				}
			}
		}
		for (Map.Entry<String, Object> entry : dto.getCustom().entrySet()) {
			entity.setCustom(entry.getKey(), entry.getValue());
		}
		
        for (JsonPatch jsonPatch : dto.getJsonPatches()) {
            treatJsonPath(entity, jsonPatch);
        }
		
		return entity;
	}
	
	public AgendamentoEntity updateEntity(AgendamentoEntity entity, Agendamento dto) {
		return updateEntity(entity, dto, new HashMap<>());
	}

	AgendamentoEntity updateEntity(AgendamentoEntity entity, Agendamento dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		entity.setDataHora(dto.dataHora);
		entity.setStatus(dto.status);
		entity.setObservacao(dto.observacao);
		entity.setMotivoStatus(dto.motivoStatus);
		entity.setDataCriacao(dto.dataCriacao);
		entity.setDataAtualizacao(dto.dataAtualizacao);
		entity.setToken(dto.token);
		entity.setTokenExpiraEm(dto.tokenExpiraEm);
		entity.setTokenUsadoEm(dto.tokenUsadoEm);
		entity.setUsuario(usuarioDTOConverter.toEntity(dto.usuario, converted));
		
		entity.setHemocentro(hemocentroDTOConverter.toEntity(dto.hemocentro, converted));
		
		// For composition attributes only not null attributes will be set to parent. You should use PUT/PATCH parent/{id}/child/{id} instead.
		if (dto.doacoes != null) {
			if (dto.doacoes.isEmpty()) {
				final java.util.List<DoacaoEntity> listDoacoes = new java.util.ArrayList<>();
				listDoacoes.addAll(entity.getDoacoes());
				for (DoacaoEntity detail : listDoacoes) {
					entity.removeFromDoacoes(detail);
				}
			} else {
				for (DoacaoEntity detail : doacaoDTOConverter.toEntityList(dto.doacoes, converted)) {
					entity.addToDoacoes(detail);
				}
			}
		}
		for (Map.Entry<String, Object> entry : dto.getCustom().entrySet()) {
			entity.setCustom(entry.getKey(), entry.getValue());
		}
		return entity;
	}
	
	public java.util.List<AgendamentoEntity> toEntityList(java.util.List<Agendamento> dtos) {
		return toEntityList(dtos, new HashMap<>());
	}
	
	java.util.List<AgendamentoEntity> toEntityList(java.util.List<Agendamento> dtos, java.util.Map<Object, Object> converted) {
		java.util.List<AgendamentoEntity> entities = null;
		if (dtos != null) {
			entities = dtos.stream().map(dto -> toEntity(dto, converted)).collect(Collectors.toList());
		}	
		return entities;
	}
	
	public Agendamento toDTO(AgendamentoEntity entity) {
		return toDTO(entity, new HashMap<>());
	}
	
	Agendamento toDTO(AgendamentoEntity entity, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		Agendamento dto = (Agendamento) converted.get(entity);
		if (dto != null) {
			return dto;
		}
        dto = new Agendamento();
        converted.put(entity, dto);

		dto.id = entity.getId() != null ? entity.getId().toString() : null;
		dto.dataHora = entity.getDataHora();
		dto.status = entity.getStatus();
		dto.observacao = entity.getObservacao();
		dto.motivoStatus = entity.getMotivoStatus();
		dto.dataCriacao = entity.getDataCriacao();
		dto.dataAtualizacao = entity.getDataAtualizacao();
		dto.token = entity.getToken();
		dto.tokenExpiraEm = entity.getTokenExpiraEm();
		dto.tokenUsadoEm = entity.getTokenUsadoEm();
		dto.usuario = usuarioDTOConverter.toDTO(entity.getUsuario(), converted);
		dto.hemocentro = hemocentroDTOConverter.toDTO(entity.getHemocentro(), converted);
		dto.doacoes = doacaoDTOConverter.toDTOList(entity.getDoacoes(), converted);
		for(String customField : entity.getCustomFields()) {
			dto.setCustom(customField, entity.getCustom(customField));
		}
        return dto;
    }
	
	public Agendamento toDTO(AgendamentoEntity entity, List<String> displayFields) {
		return toDTO(entity, displayFields, new HashMap<>());
	}
	
	Agendamento toDTO(AgendamentoEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}
		
		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));
		
        Agendamento dto = new Agendamento();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		if (displayFields.stream().anyMatch(displayField -> "dataHora".equals(displayField) || "*".equals(displayField))) {
			dto.dataHora = entity.getDataHora();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "status".equals(displayField) || "*".equals(displayField))) {
			dto.status = entity.getStatus();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "observacao".equals(displayField) || "*".equals(displayField))) {
			dto.observacao = entity.getObservacao();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "motivoStatus".equals(displayField) || "*".equals(displayField))) {
			dto.motivoStatus = entity.getMotivoStatus();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "dataCriacao".equals(displayField) || "*".equals(displayField))) {
			dto.dataCriacao = entity.getDataCriacao();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "dataAtualizacao".equals(displayField) || "*".equals(displayField))) {
			dto.dataAtualizacao = entity.getDataAtualizacao();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "token".equals(displayField) || "*".equals(displayField))) {
			dto.token = entity.getToken();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "tokenExpiraEm".equals(displayField) || "*".equals(displayField))) {
			dto.tokenExpiraEm = entity.getTokenExpiraEm();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "tokenUsadoEm".equals(displayField) || "*".equals(displayField))) {
			dto.tokenUsadoEm = entity.getTokenUsadoEm();
		}
		
		List<String> usuarioDisplayFields = displayFields.stream()
						.filter(displayField -> displayField.trim().startsWith("usuario.")).map(f -> f.substring("usuario.".length() + f.indexOf("usuario.")).trim()).collect(Collectors.toList());
		if (!usuarioDisplayFields.isEmpty()) {
			dto.usuario = usuarioDTOConverter.toDTO(entity.getUsuario(), usuarioDisplayFields, new java.util.HashMap<Object, Object>());
		}
		
		List<String> hemocentroDisplayFields = displayFields.stream()
						.filter(displayField -> displayField.trim().startsWith("hemocentro.")).map(f -> f.substring("hemocentro.".length() + f.indexOf("hemocentro.")).trim()).collect(Collectors.toList());
		if (!hemocentroDisplayFields.isEmpty()) {
			dto.hemocentro = hemocentroDTOConverter.toDTO(entity.getHemocentro(), hemocentroDisplayFields, new java.util.HashMap<Object, Object>());
		}
		
		List<String> doacoesDisplayFields = displayFields.stream()
			.filter(displayField -> displayField.trim().startsWith("doacoes.")).map(f -> f.substring("doacoes.".length() + f.indexOf("doacoes.")).trim()).collect(Collectors.toList());
		if (!doacoesDisplayFields.isEmpty()) {
			dto.doacoes = new java.util.ArrayList<>();
			for (DoacaoEntity doacaoEntity : entity.getDoacoes()) {
				dto.doacoes.add(doacaoDTOConverter.toDTO(doacaoEntity, doacoesDisplayFields, converted));
			}
		}
		for(String customField : entity.getCustomFields()) {
			dto.setCustom(customField, entity.getCustom(customField));
		}
        return dto;
    }
    
    Agendamento toDTOforRelation(AgendamentoEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}

		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));

        Agendamento dto = new Agendamento();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		if (displayFields.stream().anyMatch(displayField -> "dataHora".equals(displayField) || "*".equals(displayField))) {
			dto.dataHora = entity.getDataHora();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "status".equals(displayField) || "*".equals(displayField))) {
			dto.status = entity.getStatus();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "observacao".equals(displayField) || "*".equals(displayField))) {
			dto.observacao = entity.getObservacao();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "motivoStatus".equals(displayField) || "*".equals(displayField))) {
			dto.motivoStatus = entity.getMotivoStatus();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "dataCriacao".equals(displayField) || "*".equals(displayField))) {
			dto.dataCriacao = entity.getDataCriacao();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "dataAtualizacao".equals(displayField) || "*".equals(displayField))) {
			dto.dataAtualizacao = entity.getDataAtualizacao();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "token".equals(displayField) || "*".equals(displayField))) {
			dto.token = entity.getToken();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "tokenExpiraEm".equals(displayField) || "*".equals(displayField))) {
			dto.tokenExpiraEm = entity.getTokenExpiraEm();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "tokenUsadoEm".equals(displayField) || "*".equals(displayField))) {
			dto.tokenUsadoEm = entity.getTokenUsadoEm();
		}
		
		
		
        return dto;
    }
    
    public java.util.List<Agendamento> toDTOList(java.util.List<AgendamentoEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Agendamento> toDTOList(java.util.List<AgendamentoEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Agendamento> dtos = null;
    	if (entities != null) {
    		dtos = entities.stream().map(entity -> toDTO(entity, converted)).collect(Collectors.toList());
    	}
    	return dtos;
    }
    
    public java.util.List<Agendamento> toDTOList(java.util.Set<AgendamentoEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Agendamento> toDTOList(java.util.Set<AgendamentoEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Agendamento> dtos = null;
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
	
	private void treatJsonPath(AgendamentoEntity entity, JsonPatch jsonPatch) {
		if (!JsonPatch.REMOVE_OPERATION.equals(jsonPatch.getOp())){
			return;
		}
		
		if("id".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setId(null);
		}
		if("dataHora".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setDataHora(null);
		}
		if("status".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setStatus(null);
		}
		if("observacao".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setObservacao(null);
		}
		if("motivoStatus".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setMotivoStatus(null);
		}
		if("dataCriacao".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setDataCriacao(null);
		}
		if("dataAtualizacao".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setDataAtualizacao(null);
		}
		if("token".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setToken(null);
		}
		if("tokenExpiraEm".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setTokenExpiraEm(null);
		}
		if("tokenUsadoEm".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setTokenUsadoEm(null);
		}
		if("usuario".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setUsuario(null);
		}
		if("hemocentro".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setHemocentro(null);
		}
		if("doacoes".equals(jsonPatch.getPath().replace("/", ""))) {
			for (DoacaoEntity e : new java.util.ArrayList<>(entity.getDoacoes())) {
				entity.removeFromDoacoes(e);
			}
		}
	}
}
