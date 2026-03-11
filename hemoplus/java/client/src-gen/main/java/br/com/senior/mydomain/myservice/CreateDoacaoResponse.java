/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createDoacao
 */
@CommandDescription(name="createDoacaoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createDoacaoResponse")
public interface CreateDoacaoResponse extends MessageHandler {

	void createDoacaoResponse(Doacao response);
	
	void createDoacaoResponseError(ErrorPayload error);

}
