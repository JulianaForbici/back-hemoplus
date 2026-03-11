/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * queries de agendamento
 */
@CommandDescription(name="listarAgendamentosPorPeriodo", kind=CommandKind.Query, requestPrimitive="listarAgendamentosPorPeriodo", responsePrimitive="listarAgendamentosPorPeriodoResponse")
public interface ListarAgendamentosPorPeriodo extends MessageHandler {
    
    public ListarAgendamentosPorPeriodoOutput listarAgendamentosPorPeriodo(ListarAgendamentosPorPeriodoInput request);
    
}
