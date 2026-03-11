/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
 */
@CommandDescription(name="createMergeAgendamento_Doacoes", kind=CommandKind.CreateMerge, requestPrimitive="createMergeAgendamento_Doacoes", responsePrimitive="createMergeAgendamento_DoacoesResponse")
public interface CreateMergeAgendamento_Doacoes extends MessageHandler {
    
    public Doacao createMergeAgendamento_Doacoes(Doacao toCreateMerge);
    
}
