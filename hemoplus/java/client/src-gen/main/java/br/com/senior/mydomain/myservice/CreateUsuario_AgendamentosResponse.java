/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createUsuario_Agendamentos
 */
@CommandDescription(name="createUsuario_AgendamentosResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createUsuario_AgendamentosResponse")
public interface CreateUsuario_AgendamentosResponse extends MessageHandler {

	void createUsuario_AgendamentosResponse(Agendamento response);
	
	void createUsuario_AgendamentosResponseError(ErrorPayload error);

}
