/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for retrieveUsuario
 */
@CommandDescription(name="retrieveUsuarioResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retrieveUsuarioResponse")
public interface RetrieveUsuarioResponse extends MessageHandler {

	void retrieveUsuarioResponse(Usuario response);
	
	void retrieveUsuarioResponseError(ErrorPayload error);

}
