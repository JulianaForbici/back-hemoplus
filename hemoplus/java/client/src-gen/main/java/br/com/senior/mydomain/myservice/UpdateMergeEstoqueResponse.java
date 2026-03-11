/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for updateMergeEstoque
 */
@CommandDescription(name="updateMergeEstoqueResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateMergeEstoqueResponse")
public interface UpdateMergeEstoqueResponse extends MessageHandler {

	void updateMergeEstoqueResponse(Estoque response);
	
	void updateMergeEstoqueResponseError(ErrorPayload error);

}
