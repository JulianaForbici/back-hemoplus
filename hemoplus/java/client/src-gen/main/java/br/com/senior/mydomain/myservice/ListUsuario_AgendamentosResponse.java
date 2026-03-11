/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listUsuario_Agendamentos
 */
@CommandDescription(name="listUsuario_AgendamentosResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listUsuario_AgendamentosResponse")
public interface ListUsuario_AgendamentosResponse extends MessageHandler {

	void listUsuario_AgendamentosResponse(Agendamento.PagedResults response);
	
	void listUsuario_AgendamentosResponseError(ErrorPayload error);

}
