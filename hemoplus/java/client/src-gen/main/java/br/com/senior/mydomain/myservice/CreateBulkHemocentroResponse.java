/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createBulkHemocentro
 */
@CommandDescription(name="createBulkHemocentroResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createBulkHemocentroResponse")
public interface CreateBulkHemocentroResponse extends MessageHandler {

	void createBulkHemocentroResponse(CreateBulkHemocentroOutput response);
	
	void createBulkHemocentroResponseError(ErrorPayload error);

}
