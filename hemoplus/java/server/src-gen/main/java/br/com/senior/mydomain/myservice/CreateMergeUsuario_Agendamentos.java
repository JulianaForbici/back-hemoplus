/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
 */
@CommandDescription(name="createMergeUsuario_Agendamentos", kind=CommandKind.CreateMerge, requestPrimitive="createMergeUsuario_Agendamentos", responsePrimitive="createMergeUsuario_AgendamentosResponse")
public interface CreateMergeUsuario_Agendamentos extends MessageHandler {
    
    public Agendamento createMergeUsuario_Agendamentos(Agendamento toCreateMerge);
    
}
