/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for buscarDashboardSerieAgendamentosPorDia
 */
@CommandDescription(name="buscarDashboardSerieAgendamentosPorDiaResponse", kind=CommandKind.ResponseCommand, requestPrimitive="buscarDashboardSerieAgendamentosPorDiaResponse")
public interface BuscarDashboardSerieAgendamentosPorDiaResponse extends MessageHandler {

	void buscarDashboardSerieAgendamentosPorDiaResponse(BuscarDashboardSerieAgendamentosPorDiaOutput response);
	
	void buscarDashboardSerieAgendamentosPorDiaResponseError(ErrorPayload error);

}
