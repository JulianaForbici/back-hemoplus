/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Agendamento entity.
 */
@CommandDescription(name="createMergeAgendamento", kind=CommandKind.CreateMerge, requestPrimitive="createMergeAgendamento", responsePrimitive="createMergeAgendamentoResponse")
public interface CreateMergeAgendamento extends MessageHandler {
    
    public Agendamento createMergeAgendamento(Agendamento toCreateMerge);
    
}
