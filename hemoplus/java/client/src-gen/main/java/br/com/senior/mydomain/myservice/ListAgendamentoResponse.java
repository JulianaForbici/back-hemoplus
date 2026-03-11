/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listAgendamento
 */
@CommandDescription(name="listAgendamentoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listAgendamentoResponse")
public interface ListAgendamentoResponse extends MessageHandler {

	void listAgendamentoResponse(Agendamento.PagedResults response);
	
	void listAgendamentoResponseError(ErrorPayload error);

}
