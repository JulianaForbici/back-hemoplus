/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listUsuario
 */
@CommandDescription(name="listUsuarioResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listUsuarioResponse")
public interface ListUsuarioResponse extends MessageHandler {

	void listUsuarioResponse(Usuario.PagedResults response);
	
	void listUsuarioResponseError(ErrorPayload error);

}
