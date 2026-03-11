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

import br.com.senior.mydomain.myservice.Agendamento;
import br.com.senior.mydomain.myservice.Usuario;
import br.com.senior.mydomain.myservice.MyServiceConstants;
import br.com.senior.mydomain.myservice.MyServiceException;
import br.com.senior.mydomain.myservice.MyServiceMessageException;

/**
 * 
 */
public class RetrieveUsuario_AgendamentosImpl {

	private final Supplier<IMessenger> messengerSupplier;

	private final UserIdentifier userId;

	private final Supplier<Message> messageSupplier;

	public RetrieveUsuario_AgendamentosImpl(Supplier<IMessenger> messengerSupplier, UserIdentifier userId, Supplier<Message> messageSupplier) {
		this.messengerSupplier = messengerSupplier;
		this.userId = userId;
		this.messageSupplier = messageSupplier;
	}

	private Message createMessage(Agendamento.GetRequest input) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				MyServiceConstants.Commands.RETRIEVE_USUARIO_AGENDAMENTOS, //
				DtoJsonConverter.toJSON(input));
		}
		return new Message(userId.getTenant(), //
			MyServiceConstants.DOMAIN, //
			MyServiceConstants.SERVICE, //
			MyServiceConstants.Commands.RETRIEVE_USUARIO_AGENDAMENTOS, //
			DtoJsonConverter.toJSON(input));
	}
	
	/**
	* Chamada síncrona para o método retrieveUsuario_Agendamentos
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* The 'retrieve' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity. 
	* @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	*/
	public Agendamento retrieveUsuario_Agendamentos(Usuario.Id parentId, Agendamento.GetRequest input, long timeout) {
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
		Agendamento output = DtoJsonConverter.toDTO(resultMessage.getContent(), Agendamento.class);
		if (output == null) {
			throw new MyServiceException("Contéudo do retorno inválido");
		}
		return output;
	}
	
	/**
	* Chamada assíncrona para o método retrieveUsuario_Agendamentos
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* The 'retrieve' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	*/
	public void retrieveUsuario_Agendamentos(Usuario.Id parentId, Agendamento.GetRequest input) {
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
	* Chamada assíncrona para o método retrieveUsuario_Agendamentos
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* The 'retrieve' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	*/
	@Deprecated
	public CompletableFuture<Agendamento> retrieveUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento.GetRequest input) {
	
		if (ServiceContext.get() == null) {
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "Service Context não iniciado. Erro ao efetuar request da mensagem");
		}
		ServiceRunner serviceRunner = ServiceContext.get().getCurrentServiceRunner();
		Message message = createMessage(input);
		addMessageHeaders(message);
		message.addHeader("entity_parent_id", parentId.id);
		return serviceRunner.request(message, Agendamento.class);
	}
	
	/**
	* Chamada assíncrona para o método retrieveUsuario_Agendamentos
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* The 'retrieve' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
	*/
	public CompletableFuture<Agendamento> retrieveUsuario_AgendamentosRequest(Usuario.Id parentId, Agendamento.GetRequest input, long timeout, TimeUnit unit) {
	
		if (ServiceContext.get() == null) {
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "Service Context não iniciado. Erro ao efetuar request da mensagem");
		}
		ServiceRunner serviceRunner = ServiceContext.get().getCurrentServiceRunner();
		Message message = createMessage(input);
		addMessageHeaders(message);
		message.addHeader("entity_parent_id", parentId.id);
		return serviceRunner.request(message, Agendamento.class, TimeUnit.MILLISECONDS.convert(timeout, unit));
	}
	
	private void addMessageHeaders(Message message) {
		message.setUsername(userId.getUsername());
		if (userId.isTrusted()) {
			message.addHeader("trusted", true);
		}
	}
}
