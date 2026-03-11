/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createHemocentro
 */
@CommandDescription(name="createHemocentroResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createHemocentroResponse")
public interface CreateHemocentroResponse extends MessageHandler {

	void createHemocentroResponse(Hemocentro response);
	
	void createHemocentroResponseError(ErrorPayload error);

}
