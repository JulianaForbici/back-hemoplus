/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Agendamento entity.
 */
@CommandDescription(name="updateMergeAgendamento", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeAgendamento", responsePrimitive="updateMergeAgendamentoResponse")
public interface UpdateMergeAgendamento extends MessageHandler {
    
    public Agendamento updateMergeAgendamento(Agendamento toUpdateMerge);
    
}
