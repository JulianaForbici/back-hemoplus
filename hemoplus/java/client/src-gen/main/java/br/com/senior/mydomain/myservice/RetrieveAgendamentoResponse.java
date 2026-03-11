/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for retrieveAgendamento
 */
@CommandDescription(name="retrieveAgendamentoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retrieveAgendamentoResponse")
public interface RetrieveAgendamentoResponse extends MessageHandler {

	void retrieveAgendamentoResponse(Agendamento response);
	
	void retrieveAgendamentoResponseError(ErrorPayload error);

}
