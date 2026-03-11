/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createMergeUsuario_Agendamentos
 */
@CommandDescription(name="createMergeUsuario_AgendamentosResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createMergeUsuario_AgendamentosResponse")
public interface CreateMergeUsuario_AgendamentosResponse extends MessageHandler {

	void createMergeUsuario_AgendamentosResponse(Agendamento response);
	
	void createMergeUsuario_AgendamentosResponseError(ErrorPayload error);

}
