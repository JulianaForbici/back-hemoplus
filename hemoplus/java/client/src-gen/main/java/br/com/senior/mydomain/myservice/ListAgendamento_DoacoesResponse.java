/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listAgendamento_Doacoes
 */
@CommandDescription(name="listAgendamento_DoacoesResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listAgendamento_DoacoesResponse")
public interface ListAgendamento_DoacoesResponse extends MessageHandler {

	void listAgendamento_DoacoesResponse(Doacao.PagedResults response);
	
	void listAgendamento_DoacoesResponseError(ErrorPayload error);

}
