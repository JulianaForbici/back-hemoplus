/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Agendamento entity.
 */
@CommandDescription(name="retrieveAgendamento", kind=CommandKind.Retrieve, requestPrimitive="retrieveAgendamento", responsePrimitive="retrieveAgendamentoResponse")
public interface RetrieveAgendamento extends MessageHandler {
    
    public Agendamento retrieveAgendamento(Agendamento.GetRequest id);
    
}
