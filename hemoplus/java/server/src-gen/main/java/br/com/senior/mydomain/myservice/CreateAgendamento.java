/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Agendamento entity.
 */
@CommandDescription(name="createAgendamento", kind=CommandKind.Create, requestPrimitive="createAgendamento", responsePrimitive="createAgendamentoResponse")
public interface CreateAgendamento extends MessageHandler {
    
    public Agendamento createAgendamento(Agendamento toCreate);
    
}
