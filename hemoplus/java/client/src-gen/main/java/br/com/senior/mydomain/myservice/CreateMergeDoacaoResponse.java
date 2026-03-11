/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createMergeDoacao
 */
@CommandDescription(name="createMergeDoacaoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createMergeDoacaoResponse")
public interface CreateMergeDoacaoResponse extends MessageHandler {

	void createMergeDoacaoResponse(Doacao response);
	
	void createMergeDoacaoResponseError(ErrorPayload error);

}
