/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
 */
@CommandDescription(name="updateMergeAgendamento_Doacoes", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeAgendamento_Doacoes", responsePrimitive="updateMergeAgendamento_DoacoesResponse")
public interface UpdateMergeAgendamento_Doacoes extends MessageHandler {
    
    public Doacao updateMergeAgendamento_Doacoes(Doacao toUpdateMerge);
    
}
