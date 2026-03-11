/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for confirmarAgendamento
 */
@CommandDescription(name="confirmarAgendamentoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="confirmarAgendamentoResponse")
public interface ConfirmarAgendamentoResponse extends MessageHandler {

	void confirmarAgendamentoResponse(ConfirmarAgendamentoOutput response);
	
	void confirmarAgendamentoResponseError(ErrorPayload error);

}
