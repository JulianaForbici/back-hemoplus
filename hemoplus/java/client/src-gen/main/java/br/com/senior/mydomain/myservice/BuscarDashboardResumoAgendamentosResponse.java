/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for buscarDashboardResumoAgendamentos
 */
@CommandDescription(name="buscarDashboardResumoAgendamentosResponse", kind=CommandKind.ResponseCommand, requestPrimitive="buscarDashboardResumoAgendamentosResponse")
public interface BuscarDashboardResumoAgendamentosResponse extends MessageHandler {

	void buscarDashboardResumoAgendamentosResponse(BuscarDashboardResumoAgendamentosOutput response);
	
	void buscarDashboardResumoAgendamentosResponseError(ErrorPayload error);

}
