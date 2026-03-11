/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createMergeAgendamento_Doacoes
 */
@CommandDescription(name="createMergeAgendamento_DoacoesResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createMergeAgendamento_DoacoesResponse")
public interface CreateMergeAgendamento_DoacoesResponse extends MessageHandler {

	void createMergeAgendamento_DoacoesResponse(Doacao response);
	
	void createMergeAgendamento_DoacoesResponseError(ErrorPayload error);

}
