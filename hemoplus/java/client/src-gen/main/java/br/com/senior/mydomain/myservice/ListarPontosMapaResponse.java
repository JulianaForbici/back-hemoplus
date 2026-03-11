/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listarPontosMapa
 */
@CommandDescription(name="listarPontosMapaResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listarPontosMapaResponse")
public interface ListarPontosMapaResponse extends MessageHandler {

	void listarPontosMapaResponse(ListarPontosMapaOutput response);
	
	void listarPontosMapaResponseError(ErrorPayload error);

}
