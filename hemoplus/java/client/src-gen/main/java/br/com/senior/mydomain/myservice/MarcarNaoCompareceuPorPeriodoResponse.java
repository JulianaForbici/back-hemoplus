/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for marcarNaoCompareceuPorPeriodo
 */
@CommandDescription(name="marcarNaoCompareceuPorPeriodoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="marcarNaoCompareceuPorPeriodoResponse")
public interface MarcarNaoCompareceuPorPeriodoResponse extends MessageHandler {

	void marcarNaoCompareceuPorPeriodoResponse(MarcarNaoCompareceuPorPeriodoOutput response);
	
	void marcarNaoCompareceuPorPeriodoResponseError(ErrorPayload error);

}
