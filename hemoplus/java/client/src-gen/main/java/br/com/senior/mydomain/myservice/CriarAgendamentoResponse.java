/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for criarAgendamento
 */
@CommandDescription(name="criarAgendamentoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="criarAgendamentoResponse")
public interface CriarAgendamentoResponse extends MessageHandler {

	void criarAgendamentoResponse(CriarAgendamentoOutput response);
	
	void criarAgendamentoResponseError(ErrorPayload error);

}
