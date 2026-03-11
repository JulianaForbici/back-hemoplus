/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for buscarUsuarioCloud
 */
@CommandDescription(name="buscarUsuarioCloudResponse", kind=CommandKind.ResponseCommand, requestPrimitive="buscarUsuarioCloudResponse")
public interface BuscarUsuarioCloudResponse extends MessageHandler {

	void buscarUsuarioCloudResponse(BuscarUsuarioCloudOutput response);
	
	void buscarUsuarioCloudResponseError(ErrorPayload error);

}
