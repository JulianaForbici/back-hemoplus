/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createBulkDoacao
 */
@CommandDescription(name="createBulkDoacaoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createBulkDoacaoResponse")
public interface CreateBulkDoacaoResponse extends MessageHandler {

	void createBulkDoacaoResponse(CreateBulkDoacaoOutput response);
	
	void createBulkDoacaoResponseError(ErrorPayload error);

}
