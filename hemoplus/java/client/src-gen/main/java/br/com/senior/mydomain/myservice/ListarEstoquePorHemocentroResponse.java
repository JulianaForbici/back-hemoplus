/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listarEstoquePorHemocentro
 */
@CommandDescription(name="listarEstoquePorHemocentroResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listarEstoquePorHemocentroResponse")
public interface ListarEstoquePorHemocentroResponse extends MessageHandler {

	void listarEstoquePorHemocentroResponse(ListarEstoquePorHemocentroOutput response);
	
	void listarEstoquePorHemocentroResponseError(ErrorPayload error);

}
