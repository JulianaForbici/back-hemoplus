/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Agendamento entity.
 */
@CommandDescription(name="listAgendamento", kind=CommandKind.List, requestPrimitive="listAgendamento", responsePrimitive="listAgendamentoResponse")
public interface ListAgendamento extends MessageHandler {
    
    public Agendamento.PagedResults listAgendamento(Agendamento.PageRequest pageRequest);
    
}
