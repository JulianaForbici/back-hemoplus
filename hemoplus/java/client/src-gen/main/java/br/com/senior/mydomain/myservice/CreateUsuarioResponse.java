/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createUsuario
 */
@CommandDescription(name="createUsuarioResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createUsuarioResponse")
public interface CreateUsuarioResponse extends MessageHandler {

	void createUsuarioResponse(Usuario response);
	
	void createUsuarioResponseError(ErrorPayload error);

}
