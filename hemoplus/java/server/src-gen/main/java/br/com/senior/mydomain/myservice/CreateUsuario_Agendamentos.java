/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the agendamentos attribute of usuario entity.\nThis primitive requires the header 'entity_parent_id' with id of parent usuario entity.
 */
@CommandDescription(name="createUsuario_Agendamentos", kind=CommandKind.Create, requestPrimitive="createUsuario_Agendamentos", responsePrimitive="createUsuario_AgendamentosResponse")
public interface CreateUsuario_Agendamentos extends MessageHandler {
    
    public Agendamento createUsuario_Agendamentos(Agendamento toCreate);
    
}
