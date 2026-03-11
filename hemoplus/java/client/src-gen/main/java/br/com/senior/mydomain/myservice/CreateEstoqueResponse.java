/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createEstoque
 */
@CommandDescription(name="createEstoqueResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createEstoqueResponse")
public interface CreateEstoqueResponse extends MessageHandler {

	void createEstoqueResponse(Estoque response);
	
	void createEstoqueResponseError(ErrorPayload error);

}
