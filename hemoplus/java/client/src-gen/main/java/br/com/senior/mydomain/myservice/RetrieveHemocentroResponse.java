/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for retrieveHemocentro
 */
@CommandDescription(name="retrieveHemocentroResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retrieveHemocentroResponse")
public interface RetrieveHemocentroResponse extends MessageHandler {

	void retrieveHemocentroResponse(Hemocentro response);
	
	void retrieveHemocentroResponseError(ErrorPayload error);

}
