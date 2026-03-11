/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for updateHemocentro
 */
@CommandDescription(name="updateHemocentroResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateHemocentroResponse")
public interface UpdateHemocentroResponse extends MessageHandler {

	void updateHemocentroResponse(Hemocentro response);
	
	void updateHemocentroResponseError(ErrorPayload error);

}
