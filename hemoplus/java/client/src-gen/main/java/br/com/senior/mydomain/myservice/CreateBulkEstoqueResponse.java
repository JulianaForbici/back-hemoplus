/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createBulkEstoque
 */
@CommandDescription(name="createBulkEstoqueResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createBulkEstoqueResponse")
public interface CreateBulkEstoqueResponse extends MessageHandler {

	void createBulkEstoqueResponse(CreateBulkEstoqueOutput response);
	
	void createBulkEstoqueResponseError(ErrorPayload error);

}
