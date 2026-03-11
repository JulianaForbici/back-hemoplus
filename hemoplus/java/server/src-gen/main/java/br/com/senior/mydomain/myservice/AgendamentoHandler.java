/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import static br.com.senior.SecurityConstants.*;
import static br.com.senior.mydomain.myservice.AgendamentoEntity.SECURITY_RESOURCE;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.security.SecureResource;
import br.com.senior.mydomain.myservice.Agendamento.Id;
import br.com.senior.mydomain.myservice.Agendamento.PageRequest;
import br.com.senior.mydomain.myservice.Agendamento.PagedResults;
import org.springframework.stereotype.Component;

@HandlerImpl(serviceClass = MyServiceConstants.class)
@Component("my_domain.my_service.AgendamentoHandler")
public class AgendamentoHandler implements  RetrieveAgendamento, ListAgendamento {
	static final Logger logger = LoggerFactory.getLogger(AgendamentoHandler.class);
	
	private static final String ID_FIELD_NAME = Arrays.stream(AgendamentoEntity.class.getDeclaredFields())
            .filter(field -> field.isAnnotationPresent(javax.persistence.Id.class))
            .map(Field::getName)
            .findFirst()
            .orElseGet(() -> "id");

	@Inject
	AgendamentoCrudService service;
	
	@Inject
	AgendamentoDTOConverter dtoConverter;
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public Agendamento retrieveAgendamento(Agendamento.GetRequest request) {
		AgendamentoEntity entity = service.retrieveAgendamento(new Agendamento.Id(request.id));
		List<String> displayFields = request.displayFields == null ? getDefaultDisplayFields() : request.displayFields;
		return dtoConverter.toDTO(entity, displayFields);
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public PagedResults listAgendamento(PageRequest pageRequest) {
		int skip = pageRequest.offset != null ? pageRequest.offset.intValue() : 0;
		int top = pageRequest.size != null ? pageRequest.size.intValue() : 0;
		String orderBy = pageRequest.orderBy == null ? ID_FIELD_NAME + " asc" : pageRequest.orderBy;
		String filter = pageRequest.filter;
		Page<AgendamentoEntity> pages = this.service.listAgendamentoPageable(skip, top, orderBy, filter);
		List<AgendamentoEntity> entities = pages.getContent();
		List<Agendamento> dtos = null;
		List<String> displayFields = pageRequest.displayFields == null ? getDefaultDisplayFields() : pageRequest.displayFields;
		
		dtos = entities != null ? entities.stream().map(e -> dtoConverter.toDTO(e, displayFields)).collect(Collectors.toList()) : null;
		return new PagedResults(dtos, Long.valueOf(pages.getTotalPages()), Long.valueOf(pages.getTotalElements()));
	}
	
	public static List<String> getDefaultDisplayFields(){
		List<String> displayFields = new ArrayList<String>();
		displayFields.add("*");
		return displayFields;
	}
}
