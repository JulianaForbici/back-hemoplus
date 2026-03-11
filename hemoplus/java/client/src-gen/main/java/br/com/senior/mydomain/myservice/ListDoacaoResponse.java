/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listDoacao
 */
@CommandDescription(name="listDoacaoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listDoacaoResponse")
public interface ListDoacaoResponse extends MessageHandler {

	void listDoacaoResponse(Doacao.PagedResults response);
	
	void listDoacaoResponseError(ErrorPayload error);

}
