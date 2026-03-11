/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listarTiposEmFalta
 */
@CommandDescription(name="listarTiposEmFaltaResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listarTiposEmFaltaResponse")
public interface ListarTiposEmFaltaResponse extends MessageHandler {

	void listarTiposEmFaltaResponse(ListarTiposEmFaltaOutput response);
	
	void listarTiposEmFaltaResponseError(ErrorPayload error);

}
