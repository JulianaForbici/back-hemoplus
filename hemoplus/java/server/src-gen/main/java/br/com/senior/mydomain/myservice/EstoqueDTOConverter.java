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

@Component("my_domain.my_service.EstoqueDTOConverter")
@Lazy
public class EstoqueDTOConverter {
	
	static final Logger logger = LoggerFactory.getLogger(EstoqueDTOConverter.class);
	
	private HemocentroDTOConverter hemocentroDTOConverter;
	
	@Inject
	public void setHemocentroDTOConverter(HemocentroDTOConverter hemocentroDTOConverter) {
		this.hemocentroDTOConverter = hemocentroDTOConverter;
	}
	
	public EstoqueEntity toEntity(Estoque dto, boolean createMethod) {
		EstoqueEntity ret = toEntity(dto, new HashMap<>());
		if(createMethod){
			ret.defineAsNewEntity();
		}
		return ret;
	}

	public EstoqueEntity toEntity(Estoque dto) {
		return toEntity(dto, new HashMap<>());
	}
	
	EstoqueEntity toEntity(Estoque dto, java.util.Map<Object, Object> converted) {
		if (dto == null) {
			return null;
		}
		EstoqueEntity entity = (EstoqueEntity) converted.get(dto);
		if (entity != null) {
			return entity;
		}
		entity = new EstoqueEntity();
		converted.put(dto, entity);
		return mergeEntity(entity, dto, converted);
	}
	
	public EstoqueEntity mergeEntity(EstoqueEntity entity, Estoque dto) {
		return mergeEntity(entity, dto, new HashMap<>());
	}
	
	EstoqueEntity mergeEntity(EstoqueEntity entity, Estoque dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		if (dto.tipoSangue != null) {
			entity.setTipoSangue(dto.tipoSangue);
		}
		if (dto.fatorRh != null) {
			entity.setFatorRh(dto.fatorRh);
		}
		if (dto.quantidadeMl != null) {
			entity.setQuantidadeMl(dto.quantidadeMl);
		}
		if (dto.minimoMl != null) {
			entity.setMinimoMl(dto.minimoMl);
		}
		if (dto.dataAtualizacao != null) {
			entity.setDataAtualizacao(dto.dataAtualizacao);
		}
		if (dto.hemocentro != null) {
			entity.setHemocentro(hemocentroDTOConverter.toEntity(dto.hemocentro, converted));
		}
		for (Map.Entry<String, Object> entry : dto.getCustom().entrySet()) {
			entity.setCustom(entry.getKey(), entry.getValue());
		}
		
        for (JsonPatch jsonPatch : dto.getJsonPatches()) {
            treatJsonPath(entity, jsonPatch);
        }
		
		return entity;
	}
	
	public EstoqueEntity updateEntity(EstoqueEntity entity, Estoque dto) {
		return updateEntity(entity, dto, new HashMap<>());
	}

	EstoqueEntity updateEntity(EstoqueEntity entity, Estoque dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		entity.setTipoSangue(dto.tipoSangue);
		entity.setFatorRh(dto.fatorRh);
		entity.setQuantidadeMl(dto.quantidadeMl);
		entity.setMinimoMl(dto.minimoMl);
		entity.setDataAtualizacao(dto.dataAtualizacao);
		entity.setHemocentro(hemocentroDTOConverter.toEntity(dto.hemocentro, converted));
		for (Map.Entry<String, Object> entry : dto.getCustom().entrySet()) {
			entity.setCustom(entry.getKey(), entry.getValue());
		}
		return entity;
	}
	
	public java.util.List<EstoqueEntity> toEntityList(java.util.List<Estoque> dtos) {
		return toEntityList(dtos, new HashMap<>());
	}
	
	java.util.List<EstoqueEntity> toEntityList(java.util.List<Estoque> dtos, java.util.Map<Object, Object> converted) {
		java.util.List<EstoqueEntity> entities = null;
		if (dtos != null) {
			entities = dtos.stream().map(dto -> toEntity(dto, converted)).collect(Collectors.toList());
		}	
		return entities;
	}
	
	public Estoque toDTO(EstoqueEntity entity) {
		return toDTO(entity, new HashMap<>());
	}
	
	Estoque toDTO(EstoqueEntity entity, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		Estoque dto = (Estoque) converted.get(entity);
		if (dto != null) {
			return dto;
		}
        dto = new Estoque();
        converted.put(entity, dto);

		dto.id = entity.getId() != null ? entity.getId().toString() : null;
		dto.tipoSangue = entity.getTipoSangue();
		dto.fatorRh = entity.getFatorRh();
		dto.quantidadeMl = entity.getQuantidadeMl();
		dto.minimoMl = entity.getMinimoMl();
		dto.dataAtualizacao = entity.getDataAtualizacao();
		dto.hemocentro = hemocentroDTOConverter.toDTO(entity.getHemocentro(), converted);
		for(String customField : entity.getCustomFields()) {
			dto.setCustom(customField, entity.getCustom(customField));
		}
        return dto;
    }
	
	public Estoque toDTO(EstoqueEntity entity, List<String> displayFields) {
		return toDTO(entity, displayFields, new HashMap<>());
	}
	
	Estoque toDTO(EstoqueEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}
		
		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));
		
        Estoque dto = new Estoque();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		if (displayFields.stream().anyMatch(displayField -> "tipoSangue".equals(displayField) || "*".equals(displayField))) {
			dto.tipoSangue = entity.getTipoSangue();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "fatorRh".equals(displayField) || "*".equals(displayField))) {
			dto.fatorRh = entity.getFatorRh();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "quantidadeMl".equals(displayField) || "*".equals(displayField))) {
			dto.quantidadeMl = entity.getQuantidadeMl();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "minimoMl".equals(displayField) || "*".equals(displayField))) {
			dto.minimoMl = entity.getMinimoMl();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "dataAtualizacao".equals(displayField) || "*".equals(displayField))) {
			dto.dataAtualizacao = entity.getDataAtualizacao();
		}
		
		List<String> hemocentroDisplayFields = displayFields.stream()
						.filter(displayField -> displayField.trim().startsWith("hemocentro.")).map(f -> f.substring("hemocentro.".length() + f.indexOf("hemocentro.")).trim()).collect(Collectors.toList());
		if (!hemocentroDisplayFields.isEmpty()) {
			dto.hemocentro = hemocentroDTOConverter.toDTO(entity.getHemocentro(), hemocentroDisplayFields, new java.util.HashMap<Object, Object>());
		}
		for(String customField : entity.getCustomFields()) {
			dto.setCustom(customField, entity.getCustom(customField));
		}
        return dto;
    }
    
    Estoque toDTOforRelation(EstoqueEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}

		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));

        Estoque dto = new Estoque();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		if (displayFields.stream().anyMatch(displayField -> "tipoSangue".equals(displayField) || "*".equals(displayField))) {
			dto.tipoSangue = entity.getTipoSangue();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "fatorRh".equals(displayField) || "*".equals(displayField))) {
			dto.fatorRh = entity.getFatorRh();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "quantidadeMl".equals(displayField) || "*".equals(displayField))) {
			dto.quantidadeMl = entity.getQuantidadeMl();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "minimoMl".equals(displayField) || "*".equals(displayField))) {
			dto.minimoMl = entity.getMinimoMl();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "dataAtualizacao".equals(displayField) || "*".equals(displayField))) {
			dto.dataAtualizacao = entity.getDataAtualizacao();
		}
		
        return dto;
    }
    
    public java.util.List<Estoque> toDTOList(java.util.List<EstoqueEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Estoque> toDTOList(java.util.List<EstoqueEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Estoque> dtos = null;
    	if (entities != null) {
    		dtos = entities.stream().map(entity -> toDTO(entity, converted)).collect(Collectors.toList());
    	}
    	return dtos;
    }
    
    public java.util.List<Estoque> toDTOList(java.util.Set<EstoqueEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Estoque> toDTOList(java.util.Set<EstoqueEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Estoque> dtos = null;
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
	
	private void treatJsonPath(EstoqueEntity entity, JsonPatch jsonPatch) {
		if (!JsonPatch.REMOVE_OPERATION.equals(jsonPatch.getOp())){
			return;
		}
		
		if("id".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setId(null);
		}
		if("tipoSangue".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setTipoSangue(null);
		}
		if("fatorRh".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setFatorRh(null);
		}
		if("quantidadeMl".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setQuantidadeMl(null);
		}
		if("minimoMl".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setMinimoMl(null);
		}
		if("dataAtualizacao".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setDataAtualizacao(null);
		}
		if("hemocentro".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setHemocentro(null);
		}
	}
}
