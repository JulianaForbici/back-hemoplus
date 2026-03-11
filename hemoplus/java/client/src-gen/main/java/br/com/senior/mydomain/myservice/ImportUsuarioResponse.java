/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for importUsuario
 */
@CommandDescription(name="importUsuarioResponse", kind=CommandKind.ResponseCommand, requestPrimitive="importUsuarioResponse")
public interface ImportUsuarioResponse extends MessageHandler {

	void importUsuarioResponse(ImportUsuarioOutput response);
	
	void importUsuarioResponseError(ErrorPayload error);

}
