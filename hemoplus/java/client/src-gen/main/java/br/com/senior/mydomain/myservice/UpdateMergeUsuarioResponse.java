/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for updateMergeUsuario
 */
@CommandDescription(name="updateMergeUsuarioResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateMergeUsuarioResponse")
public interface UpdateMergeUsuarioResponse extends MessageHandler {

	void updateMergeUsuarioResponse(Usuario response);
	
	void updateMergeUsuarioResponseError(ErrorPayload error);

}
