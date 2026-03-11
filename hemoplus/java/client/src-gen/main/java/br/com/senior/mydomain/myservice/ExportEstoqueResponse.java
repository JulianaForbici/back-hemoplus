/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for exportEstoque
 */
@CommandDescription(name="exportEstoqueResponse", kind=CommandKind.ResponseCommand, requestPrimitive="exportEstoqueResponse")
public interface ExportEstoqueResponse extends MessageHandler {

	void exportEstoqueResponse(ExportEstoqueOutput response);
	
	void exportEstoqueResponseError(ErrorPayload error);

}
