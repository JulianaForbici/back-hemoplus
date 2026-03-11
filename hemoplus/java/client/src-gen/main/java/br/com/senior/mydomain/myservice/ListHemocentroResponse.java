/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listHemocentro
 */
@CommandDescription(name="listHemocentroResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listHemocentroResponse")
public interface ListHemocentroResponse extends MessageHandler {

	void listHemocentroResponse(Hemocentro.PagedResults response);
	
	void listHemocentroResponseError(ErrorPayload error);

}
