/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice.impl;

import java.util.function.Supplier;

import br.com.senior.messaging.*;
import br.com.senior.messaging.utils.DtoJsonConverter;
import br.com.senior.sdl.user.UserIdentifier;			


import br.com.senior.mydomain.myservice.Doacao;
import br.com.senior.mydomain.myservice.Agendamento;
import br.com.senior.mydomain.myservice.MyServiceConstants;
import br.com.senior.mydomain.myservice.MyServiceException;
import br.com.senior.mydomain.myservice.MyServiceMessageException;

/**
 * 
 */
public class DeleteAgendamento_DoacoesImpl {

	private final Supplier<IMessenger> messengerSupplier;

	private final UserIdentifier userId;

	private final Supplier<Message> messageSupplier;

	public DeleteAgendamento_DoacoesImpl(Supplier<IMessenger> messengerSupplier, UserIdentifier userId, Supplier<Message> messageSupplier) {
		this.messengerSupplier = messengerSupplier;
		this.userId = userId;
		this.messageSupplier = messageSupplier;
	}

	private Message createMessage(Doacao.Id input) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				MyServiceConstants.Commands.DELETE_AGENDAMENTO_DOACOES, //
				DtoJsonConverter.toJSON(input));
		}
		return new Message(userId.getTenant(), //
			MyServiceConstants.DOMAIN, //
			MyServiceConstants.SERVICE, //
			MyServiceConstants.Commands.DELETE_AGENDAMENTO_DOACOES, //
			DtoJsonConverter.toJSON(input));
	}
	
	/**
	* Chamada síncrona para o método deleteAgendamento_Doacoes
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* The 'delete' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity. 
	* @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	*/
	public void deleteAgendamento_Doacoes(Agendamento.Id parentId, Doacao.Id input, long timeout) {
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
	}
	
	/**
	* Chamada assíncrona para o método deleteAgendamento_Doacoes
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* The 'delete' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
	*/
	public void deleteAgendamento_Doacoes(Agendamento.Id parentId, Doacao.Id input) {
		Message message = createMessage(input);
		try {
			message.addHeader("entity_parent_id", parentId.id);
			addMessageHeaders(message);
			messengerSupplier.get().send(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	private void addMessageHeaders(Message message) {
		message.setUsername(userId.getUsername());
		if (userId.isTrusted()) {
			message.addHeader("trusted", true);
		}
	}
}
