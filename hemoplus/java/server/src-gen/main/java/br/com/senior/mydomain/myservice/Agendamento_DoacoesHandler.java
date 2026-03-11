/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_CREATE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_DELETE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_UPDATE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_VIEW;
import static br.com.senior.mydomain.myservice.DoacaoEntity.SECURITY_RESOURCE;

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
import br.com.senior.mydomain.myservice.Doacao.PagedResults;

@HandlerImpl(serviceClass = MyServiceConstants.class)
public class Agendamento_DoacoesHandler implements CreateAgendamento_Doacoes, CreateMergeAgendamento_Doacoes, UpdateAgendamento_Doacoes,
		UpdateMergeAgendamento_Doacoes, DeleteAgendamento_Doacoes, RetrieveAgendamento_Doacoes, ListAgendamento_Doacoes {
	
	static final Logger logger = LoggerFactory.getLogger(Agendamento_DoacoesHandler.class);
	
	private static final String ID_FIELD_NAME = Arrays.stream(DoacaoEntity.class.getDeclaredFields())
            .filter(field -> field.isAnnotationPresent(javax.persistence.Id.class))
            .map(Field::getName)
            .findFirst()
            .orElseGet(() -> "id");
	
	@Inject
	DoacaoCrudService service;
	
	@Inject
	AgendamentoCrudService masterService;
	
	
	@Inject
	DoacaoDTOConverter dtoConverter;
	
	@Inject
	TranslationHubApi translationHubApi;
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public Doacao createAgendamento_Doacoes(Doacao toCreate) {
		try {
			DoacaoEntity entity = dtoConverter.toEntity(toCreate);
			entity.setAgendamento(getParentEntity());
			return dtoConverter.toDTO(service.createDoacao(entity));
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		}catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.doacao_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.doacao_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public Doacao createMergeAgendamento_Doacoes(Doacao toCreateMerge) {
		try {
			DoacaoEntity entity = dtoConverter.toEntity(toCreateMerge);
			entity.setAgendamento(getParentEntity());
			return dtoConverter.toDTO(service.createDoacao(entity));
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		}catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.doacao_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.doacao_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_UPDATE)
	@Transactional
	@Override
	public Doacao updateAgendamento_Doacoes(Doacao toUpdate) {
		try {
			DoacaoEntity entity = service.retrieveDoacao(new Doacao.Id(toUpdate.id));
			AgendamentoEntity masterEntity = getParentEntity();
			if (entity == null || entity.getAgendamento() == null || !entity.getAgendamento().getId().equals(masterEntity.getId())) {
				throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getMessage("my_domain.my_service.doacao_notFound", "Agendamento.doacoes not found with id " + toUpdate.id));
			}
			dtoConverter.updateEntity(entity, toUpdate);
			entity.setAgendamento(masterEntity);
			return dtoConverter.toDTO(service.updateDoacao(entity));
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		}catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.doacao_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.doacao_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_UPDATE)
	@Transactional
	@Override
	public Doacao updateMergeAgendamento_Doacoes(Doacao toUpdateMerge) {
		try {
			//The entity id is required and need to be validated accordly.
			if (toUpdateMerge.id == null) {
				throw new IllegalArgumentException("Doacoes.id is required");
			}
			
			DoacaoEntity entity = service.retrieveDoacao(new Doacao.Id(toUpdateMerge.id));
			AgendamentoEntity masterEntity = getParentEntity();
			if (entity == null || entity.getAgendamento() == null || !entity.getAgendamento().getId().equals(masterEntity.getId())) {
				throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getMessage("my_domain.my_service.doacao_notFound", "Agendamento.doacoes not found with id " + toUpdateMerge.id));
			}
			dtoConverter.mergeEntity(entity, toUpdateMerge);
			return dtoConverter.toDTO(service.updateDoacao(entity));
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		}catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.doacao_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.doacao_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_DELETE)
	@Transactional
	@Override
	public void deleteAgendamento_Doacoes(Doacao.Id id) {
		try {
			DoacaoEntity entity = service.retrieveDoacao(id);
			AgendamentoEntity masterEntity = getParentEntity();
			if (entity == null || entity.getAgendamento() == null || !entity.getAgendamento().getId().equals(masterEntity.getId())) {
				throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getMessage("my_domain.my_service.doacao_notFound", "Agendamento.doacoes not found with id " + id));
			}
			service.deleteDoacao(id);
		} catch (org.hibernate.exception.ConstraintViolationException ex) {
			throw new ServiceException(ErrorCategory.CONFLICT, translationHubApi.getMessage("my_domain.my_service.doacao_constraintViolation", "Constraint Violation " + ex.getClass().getSimpleName()), ex);
		} catch(DataIntegrityViolationException ex) {
			throw new ServiceException(ErrorCategory.CONFLICT, translationHubApi.getMessage("my_domain.my_service.doacao_dataIntegrityViolation", "Data integrity violation to Update Doacao. Error: "
				+ ex.getMessage()), ex);
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		} catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.doacao_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.doacao_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public Doacao retrieveAgendamento_Doacoes(Doacao.GetRequest request) {
		try {
			DoacaoEntity entity = service.retrieveDoacao(new Doacao.Id(request.id));
			AgendamentoEntity masterEntity = getParentEntity();
			if (entity.getAgendamento() == null || !entity.getAgendamento().getId().equals(masterEntity.getId())) {
				entity = null;
			}
			List<String> displayFields = request.displayFields == null ? getDefaultDisplayFields() : request.displayFields;
			return dtoConverter.toDTO(entity, displayFields);
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		}catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.doacao_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.doacao_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public PagedResults listAgendamento_Doacoes(Doacao.PageRequest pageRequest) {
		try {
			int skip = pageRequest.offset != null ? pageRequest.offset.intValue() : 0;
			int top = pageRequest.size != null ? pageRequest.size.intValue() : 0;
			String orderBy = pageRequest.orderBy == null ? ID_FIELD_NAME + " asc" : pageRequest.orderBy;
			String filter = pageRequest.filter != null ? String.format("(%s)", pageRequest.filter) : null;
			EntityInfo parentEntityInfo = new EntityInfo(AgendamentoEntity.class, java.util.UUID.fromString(getParentId().id), "doacoes");
			Page<DoacaoEntity> pages = service.listDoacaoPageable(skip, top, orderBy, filter, parentEntityInfo);
			List<DoacaoEntity> entities = pages.getContent();
			List<String> displayFields = pageRequest.displayFields == null ? getDefaultDisplayFields() : pageRequest.displayFields;
			List<Doacao> dtos = entities != null ? entities.stream().map(e -> dtoConverter.toDTO(e, displayFields)).collect(Collectors.toList()) : null;
			return new PagedResults(dtos, Long.valueOf(pages.getTotalPages()), Long.valueOf(pages.getTotalElements()));
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		}catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.doacao_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.doacao_internalError", "An internal error occurred: "
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
	
	private Agendamento.Id getParentId() {
		String parentId = getParentIdHeader();
		if (parentId == null) {
			throw new IllegalArgumentException("Header '" + Message.ENTITY_PARENT_ID_HEADER + "' is required");
		}
		return new Agendamento.Id(java.util.UUID.fromString(parentId).toString());
	}
	
	private AgendamentoEntity getParentEntity() {
		Agendamento.Id parentId = getParentId();
		AgendamentoEntity entity = masterService.retrieveAgendamento(parentId);
		if (entity == null) {
			throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getMessage("my_domain.my_service.agendamento_notFound", "Agendamento not found with id " + parentId.id));
		}
		return entity;
	}
}
