/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createBulkUsuario
 */
@CommandDescription(name="createBulkUsuarioResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createBulkUsuarioResponse")
public interface CreateBulkUsuarioResponse extends MessageHandler {

	void createBulkUsuarioResponse(CreateBulkUsuarioOutput response);
	
	void createBulkUsuarioResponseError(ErrorPayload error);

}
