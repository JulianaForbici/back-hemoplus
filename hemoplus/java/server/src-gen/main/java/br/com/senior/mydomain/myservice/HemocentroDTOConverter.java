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

@Component("my_domain.my_service.HemocentroDTOConverter")
@Lazy
public class HemocentroDTOConverter {
	
	static final Logger logger = LoggerFactory.getLogger(HemocentroDTOConverter.class);
	
	private AgendamentoDTOConverter agendamentoDTOConverter;
	private DoacaoDTOConverter doacaoDTOConverter;
	private EstoqueDTOConverter estoqueDTOConverter;
	
	@Inject
	public void setAgendamentoDTOConverter(AgendamentoDTOConverter agendamentoDTOConverter) {
		this.agendamentoDTOConverter = agendamentoDTOConverter;
	}
	
	@Inject
	public void setDoacaoDTOConverter(DoacaoDTOConverter doacaoDTOConverter) {
		this.doacaoDTOConverter = doacaoDTOConverter;
	}
	
	@Inject
	public void setEstoqueDTOConverter(EstoqueDTOConverter estoqueDTOConverter) {
		this.estoqueDTOConverter = estoqueDTOConverter;
	}
	
	public HemocentroEntity toEntity(Hemocentro dto, boolean createMethod) {
		HemocentroEntity ret = toEntity(dto, new HashMap<>());
		if(createMethod){
			ret.defineAsNewEntity();
		}
		return ret;
	}

	public HemocentroEntity toEntity(Hemocentro dto) {
		return toEntity(dto, new HashMap<>());
	}
	
	HemocentroEntity toEntity(Hemocentro dto, java.util.Map<Object, Object> converted) {
		if (dto == null) {
			return null;
		}
		HemocentroEntity entity = (HemocentroEntity) converted.get(dto);
		if (entity != null) {
			return entity;
		}
		entity = new HemocentroEntity();
		converted.put(dto, entity);
		return mergeEntity(entity, dto, converted);
	}
	
	public HemocentroEntity mergeEntity(HemocentroEntity entity, Hemocentro dto) {
		return mergeEntity(entity, dto, new HashMap<>());
	}
	
	HemocentroEntity mergeEntity(HemocentroEntity entity, Hemocentro dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		if (dto.nome != null) {
			entity.setNome(dto.nome);
		}
		if (dto.rua != null) {
			entity.setRua(dto.rua);
		}
		if (dto.numero != null) {
			entity.setNumero(dto.numero);
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
		if (dto.cep != null) {
			entity.setCep(dto.cep);
		}
		if (dto.latitude != null) {
			entity.setLatitude(dto.latitude);
		}
		if (dto.longitude != null) {
			entity.setLongitude(dto.longitude);
		}
		if (dto.telefone != null) {
			entity.setTelefone(dto.telefone);
		}
		if (dto.ativo != null) {
			entity.setAtivo(dto.ativo);
		}
		if (dto.agendamentos != null) {
			entity.getAgendamentos().clear();
			for (AgendamentoEntity detail : agendamentoDTOConverter.toEntityList(dto.agendamentos, converted)) {
				entity.addToAgendamentos(detail);
			}
		}
		
		if (dto.doacoes != null) {
			entity.getDoacoes().clear();
			for (DoacaoEntity detail : doacaoDTOConverter.toEntityList(dto.doacoes, converted)) {
				entity.addToDoacoes(detail);
			}
		}
		
		if (dto.estoques != null) {
			entity.getEstoques().clear();
			for (EstoqueEntity detail : estoqueDTOConverter.toEntityList(dto.estoques, converted)) {
				entity.addToEstoques(detail);
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
	
	public HemocentroEntity updateEntity(HemocentroEntity entity, Hemocentro dto) {
		return updateEntity(entity, dto, new HashMap<>());
	}

	HemocentroEntity updateEntity(HemocentroEntity entity, Hemocentro dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		entity.setNome(dto.nome);
		entity.setRua(dto.rua);
		entity.setNumero(dto.numero);
		entity.setBairro(dto.bairro);
		entity.setCidade(dto.cidade);
		entity.setUf(dto.uf);
		entity.setCep(dto.cep);
		entity.setLatitude(dto.latitude);
		entity.setLongitude(dto.longitude);
		entity.setTelefone(dto.telefone);
		entity.setAtivo(dto.ativo);
		if (dto.agendamentos != null) {
			entity.getAgendamentos().clear();
			for (AgendamentoEntity detail : agendamentoDTOConverter.toEntityList(dto.agendamentos, converted)) {
				entity.addToAgendamentos(detail);
			}
		}
		
		if (dto.doacoes != null) {
			entity.getDoacoes().clear();
			for (DoacaoEntity detail : doacaoDTOConverter.toEntityList(dto.doacoes, converted)) {
				entity.addToDoacoes(detail);
			}
		}
		
		if (dto.estoques != null) {
			entity.getEstoques().clear();
			for (EstoqueEntity detail : estoqueDTOConverter.toEntityList(dto.estoques, converted)) {
				entity.addToEstoques(detail);
			}
		}
		for (Map.Entry<String, Object> entry : dto.getCustom().entrySet()) {
			entity.setCustom(entry.getKey(), entry.getValue());
		}
		return entity;
	}
	
	public java.util.List<HemocentroEntity> toEntityList(java.util.List<Hemocentro> dtos) {
		return toEntityList(dtos, new HashMap<>());
	}
	
	java.util.List<HemocentroEntity> toEntityList(java.util.List<Hemocentro> dtos, java.util.Map<Object, Object> converted) {
		java.util.List<HemocentroEntity> entities = null;
		if (dtos != null) {
			entities = dtos.stream().map(dto -> toEntity(dto, converted)).collect(Collectors.toList());
		}	
		return entities;
	}
	
	public Hemocentro toDTO(HemocentroEntity entity) {
		return toDTO(entity, new HashMap<>());
	}
	
	Hemocentro toDTO(HemocentroEntity entity, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		Hemocentro dto = (Hemocentro) converted.get(entity);
		if (dto != null) {
			return dto;
		}
        dto = new Hemocentro();
        converted.put(entity, dto);

		dto.id = entity.getId() != null ? entity.getId().toString() : null;
		dto.nome = entity.getNome();
		dto.rua = entity.getRua();
		dto.numero = entity.getNumero();
		dto.bairro = entity.getBairro();
		dto.cidade = entity.getCidade();
		dto.uf = entity.getUf();
		dto.cep = entity.getCep();
		dto.latitude = entity.getLatitude();
		dto.longitude = entity.getLongitude();
		dto.telefone = entity.getTelefone();
		dto.ativo = entity.getAtivo();
		dto.agendamentos = agendamentoDTOConverter.toDTOList(entity.getAgendamentos(), converted);
		dto.doacoes = doacaoDTOConverter.toDTOList(entity.getDoacoes(), converted);
		dto.estoques = estoqueDTOConverter.toDTOList(entity.getEstoques(), converted);
		for(String customField : entity.getCustomFields()) {
			dto.setCustom(customField, entity.getCustom(customField));
		}
        return dto;
    }
	
	public Hemocentro toDTO(HemocentroEntity entity, List<String> displayFields) {
		return toDTO(entity, displayFields, new HashMap<>());
	}
	
	Hemocentro toDTO(HemocentroEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}
		
		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));
		
        Hemocentro dto = new Hemocentro();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		if (displayFields.stream().anyMatch(displayField -> "nome".equals(displayField) || "*".equals(displayField))) {
			dto.nome = entity.getNome();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "rua".equals(displayField) || "*".equals(displayField))) {
			dto.rua = entity.getRua();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "numero".equals(displayField) || "*".equals(displayField))) {
			dto.numero = entity.getNumero();
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
		
		if (displayFields.stream().anyMatch(displayField -> "cep".equals(displayField) || "*".equals(displayField))) {
			dto.cep = entity.getCep();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "latitude".equals(displayField) || "*".equals(displayField))) {
			dto.latitude = entity.getLatitude();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "longitude".equals(displayField) || "*".equals(displayField))) {
			dto.longitude = entity.getLongitude();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "telefone".equals(displayField) || "*".equals(displayField))) {
			dto.telefone = entity.getTelefone();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "ativo".equals(displayField) || "*".equals(displayField))) {
			dto.ativo = entity.getAtivo();
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
		
		List<String> estoquesDisplayFields = displayFields.stream()
			.filter(displayField -> displayField.trim().startsWith("estoques.")).map(f -> f.substring("estoques.".length() + f.indexOf("estoques.")).trim()).collect(Collectors.toList());
		if (!estoquesDisplayFields.isEmpty()) {
			dto.estoques = new java.util.ArrayList<>();
			for (EstoqueEntity estoqueEntity : entity.getEstoques()) {
				dto.estoques.add(estoqueDTOConverter.toDTO(estoqueEntity, estoquesDisplayFields, converted));
			}
		}
		for(String customField : entity.getCustomFields()) {
			dto.setCustom(customField, entity.getCustom(customField));
		}
        return dto;
    }
    
    Hemocentro toDTOforRelation(HemocentroEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}

		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));

        Hemocentro dto = new Hemocentro();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		if (displayFields.stream().anyMatch(displayField -> "nome".equals(displayField) || "*".equals(displayField))) {
			dto.nome = entity.getNome();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "rua".equals(displayField) || "*".equals(displayField))) {
			dto.rua = entity.getRua();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "numero".equals(displayField) || "*".equals(displayField))) {
			dto.numero = entity.getNumero();
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
		
		if (displayFields.stream().anyMatch(displayField -> "cep".equals(displayField) || "*".equals(displayField))) {
			dto.cep = entity.getCep();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "latitude".equals(displayField) || "*".equals(displayField))) {
			dto.latitude = entity.getLatitude();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "longitude".equals(displayField) || "*".equals(displayField))) {
			dto.longitude = entity.getLongitude();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "telefone".equals(displayField) || "*".equals(displayField))) {
			dto.telefone = entity.getTelefone();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "ativo".equals(displayField) || "*".equals(displayField))) {
			dto.ativo = entity.getAtivo();
		}
		
		
		
        return dto;
    }
    
    public java.util.List<Hemocentro> toDTOList(java.util.List<HemocentroEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Hemocentro> toDTOList(java.util.List<HemocentroEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Hemocentro> dtos = null;
    	if (entities != null) {
    		dtos = entities.stream().map(entity -> toDTO(entity, converted)).collect(Collectors.toList());
    	}
    	return dtos;
    }
    
    public java.util.List<Hemocentro> toDTOList(java.util.Set<HemocentroEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Hemocentro> toDTOList(java.util.Set<HemocentroEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Hemocentro> dtos = null;
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
	
	private void treatJsonPath(HemocentroEntity entity, JsonPatch jsonPatch) {
		if (!JsonPatch.REMOVE_OPERATION.equals(jsonPatch.getOp())){
			return;
		}
		
		if("id".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setId(null);
		}
		if("nome".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setNome(null);
		}
		if("rua".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setRua(null);
		}
		if("numero".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setNumero(null);
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
		if("cep".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setCep(null);
		}
		if("latitude".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setLatitude(null);
		}
		if("longitude".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setLongitude(null);
		}
		if("telefone".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setTelefone(null);
		}
		if("ativo".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setAtivo(null);
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
		if("estoques".equals(jsonPatch.getPath().replace("/", ""))) {
			for (EstoqueEntity e : new java.util.ArrayList<>(entity.getEstoques())) {
				entity.removeFromEstoques(e);
			}
		}
	}
}
