/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * queries de dashboard
 */
@CommandDescription(name="buscarDashboardResumoAgendamentos", kind=CommandKind.Query, requestPrimitive="buscarDashboardResumoAgendamentos", responsePrimitive="buscarDashboardResumoAgendamentosResponse")
public interface BuscarDashboardResumoAgendamentos extends MessageHandler {
    
    public BuscarDashboardResumoAgendamentosOutput buscarDashboardResumoAgendamentos(BuscarDashboardResumoAgendamentosInput request);
    
}
