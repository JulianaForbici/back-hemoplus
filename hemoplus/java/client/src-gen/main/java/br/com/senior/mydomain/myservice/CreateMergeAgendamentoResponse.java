/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createMergeAgendamento
 */
@CommandDescription(name="createMergeAgendamentoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createMergeAgendamentoResponse")
public interface CreateMergeAgendamentoResponse extends MessageHandler {

	void createMergeAgendamentoResponse(Agendamento response);
	
	void createMergeAgendamentoResponseError(ErrorPayload error);

}
