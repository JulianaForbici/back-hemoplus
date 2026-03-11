/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
 */
@CommandDescription(name="deleteUsuario_Agendamentos", kind=CommandKind.Delete, requestPrimitive="deleteUsuario_Agendamentos", responsePrimitive="deleteUsuario_AgendamentosResponse")
public interface DeleteUsuario_Agendamentos extends MessageHandler {
    
    public void deleteUsuario_Agendamentos(Agendamento.Id id);
    
}
