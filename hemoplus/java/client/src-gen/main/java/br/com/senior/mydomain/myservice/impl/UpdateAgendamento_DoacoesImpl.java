/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice.impl;

import java.util.function.Supplier;

import br.com.senior.messaging.*;
import br.com.senior.messaging.utils.DtoJsonConverter;
import br.com.senior.sdl.user.UserIdentifier;			

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import br.com.senior.messaging.model.ServiceContext;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.messaging.model.ServiceRunner;

import br.com.senior.mydomain.myservice.Doacao;
import br.com.senior.mydomain.myservice.Agendamento;
import br.com.senior.mydomain.myservice.MyServiceConstants;
import br.com.senior.mydomain.myservice.MyServiceValidator;
import br.com.senior.mydomain.myservice.MyServiceException;
import br.com.senior.mydomain.myservice.MyServiceMessageException;

/**
 * 
 */
public class UpdateAgendamento_DoacoesImpl {

	private final Supplier<IMessenger> messengerSupplier;

	private final UserIdentifier userId;

	private final Supplier<Message> messageSupplier;

	public UpdateAgendamento_DoacoesImpl(Supplier<IMessenger> messengerSupplier, UserIdentifier userId, Supplier<Message> messageSupplier) {
		this.messengerSupplier = messengerSupplier;
		this.userId = userId;
		this.messageSupplier = messageSupplier;
	}

	private Message createMessage(Doacao input) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				MyServiceConstants.Commands.UPDATE_AGENDAMENTO_DOACOES, //
				DtoJsonConverter.toJSON(input));
		}
		return new Message(userId.getTenant(), //
			MyServiceConstants.DOMAIN, //
			MyServiceConstants.SERVICE, //
			MyServiceConstants.Commands.UPDATE_AGENDAMENTO_DOACOES, //
			DtoJsonConverter.toJSON(input));
	}
	
	/**
	* Chamada síncrona para o método updateAgendamento_Doacoes
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* The 'update' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity. 
	* @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	*/
	public Doacao updateAgendamento_Doacoes(Agendamento.Id parentId, Doacao input, long timeout) {
		MyServiceValidator.validate(input);
		
		Message message = createMessage(input);
		Message resultMessage; 
		try {
			addMessageHeaders(message);
			message.addHeader("entity_parent_id", parentId.id);
			resultMessage = messengerSupplier.get().requestSync(message, timeout);
			messengerSupplier.get().ack(resultMessage);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
		
		if (resultMessage == null) {
			throw new MyServiceException("Retorno inválido");
		}
		
		if (resultMessage.isError()) {
			ErrorPayload error = DtoJsonConverter.toDTO(resultMessage.getContent(), ErrorPayload.class);
			throw new MyServiceMessageException(resultMessage.getErrorCategory(), error.getMessage(), error.getErrorCode());
		}
		Doacao output = DtoJsonConverter.toDTO(resultMessage.getContent(), Doacao.class);
		if (output == null) {
			throw new MyServiceException("Contéudo do retorno inválido");
		}
		return output;
	}
	
	/**
	* Chamada assíncrona para o método updateAgendamento_Doacoes
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* The 'update' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	*/
	public void updateAgendamento_Doacoes(Agendamento.Id parentId, Doacao input) {
		MyServiceValidator.validate(input);
		
		Message message = createMessage(input);
		try {
			message.addHeader("entity_parent_id", parentId.id);
			addMessageHeaders(message);
			messengerSupplier.get().send(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método updateAgendamento_Doacoes
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* The 'update' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	*/
	@Deprecated
	public CompletableFuture<Doacao> updateAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao input) {
		MyServiceValidator.validate(input);
	
		if (ServiceContext.get() == null) {
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "Service Context não iniciado. Erro ao efetuar request da mensagem");
		}
		ServiceRunner serviceRunner = ServiceContext.get().getCurrentServiceRunner();
		Message message = createMessage(input);
		addMessageHeaders(message);
		message.addHeader("entity_parent_id", parentId.id);
		return serviceRunner.request(message, Doacao.class);
	}
	
	/**
	* Chamada assíncrona para o método updateAgendamento_Doacoes
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* The 'update' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	*/
	public CompletableFuture<Doacao> updateAgendamento_DoacoesRequest(Agendamento.Id parentId, Doacao input, long timeout, TimeUnit unit) {
		MyServiceValidator.validate(input);
	
		if (ServiceContext.get() == null) {
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "Service Context não iniciado. Erro ao efetuar request da mensagem");
		}
		ServiceRunner serviceRunner = ServiceContext.get().getCurrentServiceRunner();
		Message message = createMessage(input);
		addMessageHeaders(message);
		message.addHeader("entity_parent_id", parentId.id);
		return serviceRunner.request(message, Doacao.class, TimeUnit.MILLISECONDS.convert(timeout, unit));
	}
	
	private void addMessageHeaders(Message message) {
		message.setUsername(userId.getUsername());
		if (userId.isTrusted()) {
			message.addHeader("trusted", true);
		}
	}
}
