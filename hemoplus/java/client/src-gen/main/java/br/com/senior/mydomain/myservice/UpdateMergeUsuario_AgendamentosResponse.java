/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for updateMergeUsuario_Agendamentos
 */
@CommandDescription(name="updateMergeUsuario_AgendamentosResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateMergeUsuario_AgendamentosResponse")
public interface UpdateMergeUsuario_AgendamentosResponse extends MessageHandler {

	void updateMergeUsuario_AgendamentosResponse(Agendamento response);
	
	void updateMergeUsuario_AgendamentosResponseError(ErrorPayload error);

}
