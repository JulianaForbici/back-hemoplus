/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Agendamento entity.
 */
@CommandDescription(name="updateAgendamento", kind=CommandKind.Update, requestPrimitive="updateAgendamento", responsePrimitive="updateAgendamentoResponse")
public interface UpdateAgendamento extends MessageHandler {
    
    public Agendamento updateAgendamento(Agendamento toUpdate);
    
}
