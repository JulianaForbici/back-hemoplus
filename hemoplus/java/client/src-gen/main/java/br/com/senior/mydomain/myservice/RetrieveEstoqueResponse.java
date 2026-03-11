/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for retrieveEstoque
 */
@CommandDescription(name="retrieveEstoqueResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retrieveEstoqueResponse")
public interface RetrieveEstoqueResponse extends MessageHandler {

	void retrieveEstoqueResponse(Estoque response);
	
	void retrieveEstoqueResponseError(ErrorPayload error);

}
