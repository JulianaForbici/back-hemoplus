/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="buscarDashboardSerieAgendamentosPorDia", kind=CommandKind.Query, requestPrimitive="buscarDashboardSerieAgendamentosPorDia", responsePrimitive="buscarDashboardSerieAgendamentosPorDiaResponse")
public interface BuscarDashboardSerieAgendamentosPorDia extends MessageHandler {
    
    public BuscarDashboardSerieAgendamentosPorDiaOutput buscarDashboardSerieAgendamentosPorDia(BuscarDashboardSerieAgendamentosPorDiaInput request);
    
}
