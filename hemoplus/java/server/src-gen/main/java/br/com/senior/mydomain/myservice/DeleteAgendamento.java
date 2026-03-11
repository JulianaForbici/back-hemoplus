/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Agendamento entity.
 */
@CommandDescription(name="deleteAgendamento", kind=CommandKind.Delete, requestPrimitive="deleteAgendamento", responsePrimitive="deleteAgendamentoResponse")
public interface DeleteAgendamento extends MessageHandler {
    
    public void deleteAgendamento(Agendamento.Id id);
    
}
