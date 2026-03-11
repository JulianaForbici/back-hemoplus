/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for updateAgendamento_Doacoes
 */
@CommandDescription(name="updateAgendamento_DoacoesResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateAgendamento_DoacoesResponse")
public interface UpdateAgendamento_DoacoesResponse extends MessageHandler {

	void updateAgendamento_DoacoesResponse(Doacao response);
	
	void updateAgendamento_DoacoesResponseError(ErrorPayload error);

}
