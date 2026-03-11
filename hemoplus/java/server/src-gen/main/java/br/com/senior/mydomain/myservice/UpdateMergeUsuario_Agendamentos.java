/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
 */
@CommandDescription(name="updateMergeUsuario_Agendamentos", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeUsuario_Agendamentos", responsePrimitive="updateMergeUsuario_AgendamentosResponse")
public interface UpdateMergeUsuario_Agendamentos extends MessageHandler {
    
    public Agendamento updateMergeUsuario_Agendamentos(Agendamento toUpdateMerge);
    
}
