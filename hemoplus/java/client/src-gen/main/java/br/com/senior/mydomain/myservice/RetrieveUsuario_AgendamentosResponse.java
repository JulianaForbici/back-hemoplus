/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for retrieveUsuario_Agendamentos
 */
@CommandDescription(name="retrieveUsuario_AgendamentosResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retrieveUsuario_AgendamentosResponse")
public interface RetrieveUsuario_AgendamentosResponse extends MessageHandler {

	void retrieveUsuario_AgendamentosResponse(Agendamento response);
	
	void retrieveUsuario_AgendamentosResponseError(ErrorPayload error);

}
