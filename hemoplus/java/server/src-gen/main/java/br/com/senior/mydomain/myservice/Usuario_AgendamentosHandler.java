/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_CREATE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_DELETE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_UPDATE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_VIEW;
import static br.com.senior.mydomain.myservice.AgendamentoEntity.SECURITY_RESOURCE;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;

import br.com.senior.messaging.customspringdata.EntityInfo;

import javax.inject.Inject;
import org.springframework.dao.DataIntegrityViolationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import br.com.senior.platform.translationhub.api.TranslationHubApi;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.Message;
import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.messaging.security.SecureResource;
import br.com.senior.mydomain.myservice.Agendamento.PagedResults;

@HandlerImpl(serviceClass = MyServiceConstants.class)
public class Usuario_AgendamentosHandler implements CreateUsuario_Agendamentos, CreateMergeUsuario_Agendamentos, UpdateUsuario_Agendamentos,
		UpdateMergeUsuario_Agendamentos, DeleteUsuario_Agendamentos, RetrieveUsuario_Agendamentos, ListUsuario_Agendamentos {
	
	static final Logger logger = LoggerFactory.getLogger(Usuario_AgendamentosHandler.class);
	
	private static final String ID_FIELD_NAME = Arrays.stream(AgendamentoEntity.class.getDeclaredFields())
            .filter(field -> field.isAnnotationPresent(javax.persistence.Id.class))
            .map(Field::getName)
            .findFirst()
            .orElseGet(() -> "id");
	
	@Inject
	AgendamentoCrudService service;
	
	@Inject
	UsuarioCrudService masterService;
	
	
	@Inject
	AgendamentoDTOConverter dtoConverter;
	
	@Inject
	TranslationHubApi translationHubApi;
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public Agendamento createUsuario_Agendamentos(Agendamento toCreate) {
		try {
			AgendamentoEntity entity = dtoConverter.toEntity(toCreate);
			entity.setUsuario(getParentEntity());
			return dtoConverter.toDTO(service.createAgendamento(entity));
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		}catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.agendamento_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.agendamento_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public Agendamento createMergeUsuario_Agendamentos(Agendamento toCreateMerge) {
		try {
			AgendamentoEntity entity = dtoConverter.toEntity(toCreateMerge);
			entity.setUsuario(getParentEntity());
			return dtoConverter.toDTO(service.createAgendamento(entity));
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		}catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.agendamento_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.agendamento_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_UPDATE)
	@Transactional
	@Override
	public Agendamento updateUsuario_Agendamentos(Agendamento toUpdate) {
		try {
			AgendamentoEntity entity = service.retrieveAgendamento(new Agendamento.Id(toUpdate.id));
			UsuarioEntity masterEntity = getParentEntity();
			if (entity == null || entity.getUsuario() == null || !entity.getUsuario().getId().equals(masterEntity.getId())) {
				throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getMessage("my_domain.my_service.agendamento_notFound", "Usuario.agendamentos not found with id " + toUpdate.id));
			}
			dtoConverter.updateEntity(entity, toUpdate);
			entity.setUsuario(masterEntity);
			return dtoConverter.toDTO(service.updateAgendamento(entity));
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		}catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.agendamento_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.agendamento_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_UPDATE)
	@Transactional
	@Override
	public Agendamento updateMergeUsuario_Agendamentos(Agendamento toUpdateMerge) {
		try {
			//The entity id is required and need to be validated accordly.
			if (toUpdateMerge.id == null) {
				throw new IllegalArgumentException("Agendamentos.id is required");
			}
			
			AgendamentoEntity entity = service.retrieveAgendamento(new Agendamento.Id(toUpdateMerge.id));
			UsuarioEntity masterEntity = getParentEntity();
			if (entity == null || entity.getUsuario() == null || !entity.getUsuario().getId().equals(masterEntity.getId())) {
				throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getMessage("my_domain.my_service.agendamento_notFound", "Usuario.agendamentos not found with id " + toUpdateMerge.id));
			}
			dtoConverter.mergeEntity(entity, toUpdateMerge);
			return dtoConverter.toDTO(service.updateAgendamento(entity));
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		}catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.agendamento_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.agendamento_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_DELETE)
	@Transactional
	@Override
	public void deleteUsuario_Agendamentos(Agendamento.Id id) {
		try {
			AgendamentoEntity entity = service.retrieveAgendamento(id);
			UsuarioEntity masterEntity = getParentEntity();
			if (entity == null || entity.getUsuario() == null || !entity.getUsuario().getId().equals(masterEntity.getId())) {
				throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getMessage("my_domain.my_service.agendamento_notFound", "Usuario.agendamentos not found with id " + id));
			}
			service.deleteAgendamento(id);
		} catch (org.hibernate.exception.ConstraintViolationException ex) {
			throw new ServiceException(ErrorCategory.CONFLICT, translationHubApi.getMessage("my_domain.my_service.agendamento_constraintViolation", "Constraint Violation " + ex.getClass().getSimpleName()), ex);
		} catch(DataIntegrityViolationException ex) {
			throw new ServiceException(ErrorCategory.CONFLICT, translationHubApi.getMessage("my_domain.my_service.agendamento_dataIntegrityViolation", "Data integrity violation to Update Agendamento. Error: "
				+ ex.getMessage()), ex);
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		} catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.agendamento_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.agendamento_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public Agendamento retrieveUsuario_Agendamentos(Agendamento.GetRequest request) {
		try {
			AgendamentoEntity entity = service.retrieveAgendamento(new Agendamento.Id(request.id));
			UsuarioEntity masterEntity = getParentEntity();
			if (entity.getUsuario() == null || !entity.getUsuario().getId().equals(masterEntity.getId())) {
				entity = null;
			}
			List<String> displayFields = request.displayFields == null ? getDefaultDisplayFields() : request.displayFields;
			return dtoConverter.toDTO(entity, displayFields);
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		}catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.agendamento_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.agendamento_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public PagedResults listUsuario_Agendamentos(Agendamento.PageRequest pageRequest) {
		try {
			int skip = pageRequest.offset != null ? pageRequest.offset.intValue() : 0;
			int top = pageRequest.size != null ? pageRequest.size.intValue() : 0;
			String orderBy = pageRequest.orderBy == null ? ID_FIELD_NAME + " asc" : pageRequest.orderBy;
			String filter = pageRequest.filter != null ? String.format("(%s)", pageRequest.filter) : null;
			EntityInfo parentEntityInfo = new EntityInfo(UsuarioEntity.class, java.util.UUID.fromString(getParentId().id), "agendamentos");
			Page<AgendamentoEntity> pages = service.listAgendamentoPageable(skip, top, orderBy, filter, parentEntityInfo);
			List<AgendamentoEntity> entities = pages.getContent();
			List<String> displayFields = pageRequest.displayFields == null ? getDefaultDisplayFields() : pageRequest.displayFields;
			List<Agendamento> dtos = entities != null ? entities.stream().map(e -> dtoConverter.toDTO(e, displayFields)).collect(Collectors.toList()) : null;
			return new PagedResults(dtos, Long.valueOf(pages.getTotalPages()), Long.valueOf(pages.getTotalElements()));
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		}catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.agendamento_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.agendamento_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	
	public static List<String> getDefaultDisplayFields(){
		List<String> displayFields = new ArrayList<String>();
		displayFields.add("*");
		return displayFields;
	}
	
	private String getParentIdHeader() {
		Message message = getMessage();
		return message.containsHeader(Message.ENTITY_PARENT_ID_HEADER) ? message.getHeader(Message.ENTITY_PARENT_ID_HEADER).toString() : null;
	}
	
	private Usuario.Id getParentId() {
		String parentId = getParentIdHeader();
		if (parentId == null) {
			throw new IllegalArgumentException("Header '" + Message.ENTITY_PARENT_ID_HEADER + "' is required");
		}
		return new Usuario.Id(java.util.UUID.fromString(parentId).toString());
	}
	
	private UsuarioEntity getParentEntity() {
		Usuario.Id parentId = getParentId();
		UsuarioEntity entity = masterService.retrieveUsuario(parentId);
		if (entity == null) {
			throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getMessage("my_domain.my_service.usuario_notFound", "Usuario not found with id " + parentId.id));
		}
		return entity;
	}
}
