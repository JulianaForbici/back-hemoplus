/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for updateMergeAgendamento_Doacoes
 */
@CommandDescription(name="updateMergeAgendamento_DoacoesResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateMergeAgendamento_DoacoesResponse")
public interface UpdateMergeAgendamento_DoacoesResponse extends MessageHandler {

	void updateMergeAgendamento_DoacoesResponse(Doacao response);
	
	void updateMergeAgendamento_DoacoesResponseError(ErrorPayload error);

}
