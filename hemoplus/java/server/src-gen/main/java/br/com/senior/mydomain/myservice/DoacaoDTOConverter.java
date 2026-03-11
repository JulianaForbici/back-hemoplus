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

@Component("my_domain.my_service.DoacaoDTOConverter")
@Lazy
public class DoacaoDTOConverter {
	
	static final Logger logger = LoggerFactory.getLogger(DoacaoDTOConverter.class);
	
	private UsuarioDTOConverter usuarioDTOConverter;
	private HemocentroDTOConverter hemocentroDTOConverter;
	private AgendamentoDTOConverter agendamentoDTOConverter;
	
	@Inject
	public void setUsuarioDTOConverter(UsuarioDTOConverter usuarioDTOConverter) {
		this.usuarioDTOConverter = usuarioDTOConverter;
	}
	
	@Inject
	public void setHemocentroDTOConverter(HemocentroDTOConverter hemocentroDTOConverter) {
		this.hemocentroDTOConverter = hemocentroDTOConverter;
	}
	
	@Inject
	public void setAgendamentoDTOConverter(AgendamentoDTOConverter agendamentoDTOConverter) {
		this.agendamentoDTOConverter = agendamentoDTOConverter;
	}
	
	public DoacaoEntity toEntity(Doacao dto, boolean createMethod) {
		DoacaoEntity ret = toEntity(dto, new HashMap<>());
		if(createMethod){
			ret.defineAsNewEntity();
		}
		return ret;
	}

	public DoacaoEntity toEntity(Doacao dto) {
		return toEntity(dto, new HashMap<>());
	}
	
	DoacaoEntity toEntity(Doacao dto, java.util.Map<Object, Object> converted) {
		if (dto == null) {
			return null;
		}
		DoacaoEntity entity = (DoacaoEntity) converted.get(dto);
		if (entity != null) {
			return entity;
		}
		entity = new DoacaoEntity();
		converted.put(dto, entity);
		return mergeEntity(entity, dto, converted);
	}
	
	public DoacaoEntity mergeEntity(DoacaoEntity entity, Doacao dto) {
		return mergeEntity(entity, dto, new HashMap<>());
	}
	
	DoacaoEntity mergeEntity(DoacaoEntity entity, Doacao dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		if (dto.dataHoraConfirmacao != null) {
			entity.setDataHoraConfirmacao(dto.dataHoraConfirmacao);
		}
		if (dto.responsavelValidacao != null) {
			entity.setResponsavelValidacao(dto.responsavelValidacao);
		}
		if (dto.usuario != null) {
			entity.setUsuario(usuarioDTOConverter.toEntity(dto.usuario, converted));
		}
		
		if (dto.hemocentro != null) {
			entity.setHemocentro(hemocentroDTOConverter.toEntity(dto.hemocentro, converted));
		}
		
		if (dto.agendamento != null) {
			entity.setAgendamento(agendamentoDTOConverter.toEntity(dto.agendamento, converted));
		}
		
		if (dto.tipoSangue != null) {
			entity.setTipoSangue(dto.tipoSangue);
		}
		if (dto.fatorRh != null) {
			entity.setFatorRh(dto.fatorRh);
		}
		for (Map.Entry<String, Object> entry : dto.getCustom().entrySet()) {
			entity.setCustom(entry.getKey(), entry.getValue());
		}
		
        for (JsonPatch jsonPatch : dto.getJsonPatches()) {
            treatJsonPath(entity, jsonPatch);
        }
		
		return entity;
	}
	
	public DoacaoEntity updateEntity(DoacaoEntity entity, Doacao dto) {
		return updateEntity(entity, dto, new HashMap<>());
	}

	DoacaoEntity updateEntity(DoacaoEntity entity, Doacao dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		entity.setDataHoraConfirmacao(dto.dataHoraConfirmacao);
		entity.setResponsavelValidacao(dto.responsavelValidacao);
		entity.setUsuario(usuarioDTOConverter.toEntity(dto.usuario, converted));
		
		entity.setHemocentro(hemocentroDTOConverter.toEntity(dto.hemocentro, converted));
		
		entity.setAgendamento(agendamentoDTOConverter.toEntity(dto.agendamento, converted));
		
		entity.setTipoSangue(dto.tipoSangue);
		entity.setFatorRh(dto.fatorRh);
		for (Map.Entry<String, Object> entry : dto.getCustom().entrySet()) {
			entity.setCustom(entry.getKey(), entry.getValue());
		}
		return entity;
	}
	
	public java.util.List<DoacaoEntity> toEntityList(java.util.List<Doacao> dtos) {
		return toEntityList(dtos, new HashMap<>());
	}
	
	java.util.List<DoacaoEntity> toEntityList(java.util.List<Doacao> dtos, java.util.Map<Object, Object> converted) {
		java.util.List<DoacaoEntity> entities = null;
		if (dtos != null) {
			entities = dtos.stream().map(dto -> toEntity(dto, converted)).collect(Collectors.toList());
		}	
		return entities;
	}
	
	public Doacao toDTO(DoacaoEntity entity) {
		return toDTO(entity, new HashMap<>());
	}
	
	Doacao toDTO(DoacaoEntity entity, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		Doacao dto = (Doacao) converted.get(entity);
		if (dto != null) {
			return dto;
		}
        dto = new Doacao();
        converted.put(entity, dto);

		dto.id = entity.getId() != null ? entity.getId().toString() : null;
		dto.dataHoraConfirmacao = entity.getDataHoraConfirmacao();
		dto.responsavelValidacao = entity.getResponsavelValidacao();
		dto.usuario = usuarioDTOConverter.toDTO(entity.getUsuario(), converted);
		dto.hemocentro = hemocentroDTOConverter.toDTO(entity.getHemocentro(), converted);
		dto.agendamento = agendamentoDTOConverter.toDTO(entity.getAgendamento(), converted);
		dto.tipoSangue = entity.getTipoSangue();
		dto.fatorRh = entity.getFatorRh();
		for(String customField : entity.getCustomFields()) {
			dto.setCustom(customField, entity.getCustom(customField));
		}
        return dto;
    }
	
	public Doacao toDTO(DoacaoEntity entity, List<String> displayFields) {
		return toDTO(entity, displayFields, new HashMap<>());
	}
	
	Doacao toDTO(DoacaoEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}
		
		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));
		
        Doacao dto = new Doacao();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		if (displayFields.stream().anyMatch(displayField -> "dataHoraConfirmacao".equals(displayField) || "*".equals(displayField))) {
			dto.dataHoraConfirmacao = entity.getDataHoraConfirmacao();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "responsavelValidacao".equals(displayField) || "*".equals(displayField))) {
			dto.responsavelValidacao = entity.getResponsavelValidacao();
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
		
		List<String> agendamentoDisplayFields = displayFields.stream()
						.filter(displayField -> displayField.trim().startsWith("agendamento.")).map(f -> f.substring("agendamento.".length() + f.indexOf("agendamento.")).trim()).collect(Collectors.toList());
		if (!agendamentoDisplayFields.isEmpty()) {
			dto.agendamento = agendamentoDTOConverter.toDTO(entity.getAgendamento(), agendamentoDisplayFields, new java.util.HashMap<Object, Object>());
		}
		
		if (displayFields.stream().anyMatch(displayField -> "tipoSangue".equals(displayField) || "*".equals(displayField))) {
			dto.tipoSangue = entity.getTipoSangue();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "fatorRh".equals(displayField) || "*".equals(displayField))) {
			dto.fatorRh = entity.getFatorRh();
		}
		for(String customField : entity.getCustomFields()) {
			dto.setCustom(customField, entity.getCustom(customField));
		}
        return dto;
    }
    
    Doacao toDTOforRelation(DoacaoEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}

		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));

        Doacao dto = new Doacao();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		if (displayFields.stream().anyMatch(displayField -> "dataHoraConfirmacao".equals(displayField) || "*".equals(displayField))) {
			dto.dataHoraConfirmacao = entity.getDataHoraConfirmacao();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "responsavelValidacao".equals(displayField) || "*".equals(displayField))) {
			dto.responsavelValidacao = entity.getResponsavelValidacao();
		}
		
		
		
		
		if (displayFields.stream().anyMatch(displayField -> "tipoSangue".equals(displayField) || "*".equals(displayField))) {
			dto.tipoSangue = entity.getTipoSangue();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "fatorRh".equals(displayField) || "*".equals(displayField))) {
			dto.fatorRh = entity.getFatorRh();
		}
        return dto;
    }
    
    public java.util.List<Doacao> toDTOList(java.util.List<DoacaoEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Doacao> toDTOList(java.util.List<DoacaoEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Doacao> dtos = null;
    	if (entities != null) {
    		dtos = entities.stream().map(entity -> toDTO(entity, converted)).collect(Collectors.toList());
    	}
    	return dtos;
    }
    
    public java.util.List<Doacao> toDTOList(java.util.Set<DoacaoEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Doacao> toDTOList(java.util.Set<DoacaoEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Doacao> dtos = null;
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
	
	private void treatJsonPath(DoacaoEntity entity, JsonPatch jsonPatch) {
		if (!JsonPatch.REMOVE_OPERATION.equals(jsonPatch.getOp())){
			return;
		}
		
		if("id".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setId(null);
		}
		if("dataHoraConfirmacao".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setDataHoraConfirmacao(null);
		}
		if("responsavelValidacao".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setResponsavelValidacao(null);
		}
		if("usuario".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setUsuario(null);
		}
		if("hemocentro".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setHemocentro(null);
		}
		if("agendamento".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setAgendamento(null);
		}
		if("tipoSangue".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setTipoSangue(null);
		}
		if("fatorRh".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setFatorRh(null);
		}
	}
}
