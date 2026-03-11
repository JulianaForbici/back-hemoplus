/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listEstoque
 */
@CommandDescription(name="listEstoqueResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listEstoqueResponse")
public interface ListEstoqueResponse extends MessageHandler {

	void listEstoqueResponse(Estoque.PagedResults response);
	
	void listEstoqueResponseError(ErrorPayload error);

}
