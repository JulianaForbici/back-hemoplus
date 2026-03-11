/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
 */
@CommandDescription(name="createAgendamento_Doacoes", kind=CommandKind.Create, requestPrimitive="createAgendamento_Doacoes", responsePrimitive="createAgendamento_DoacoesResponse")
public interface CreateAgendamento_Doacoes extends MessageHandler {
    
    public Doacao createAgendamento_Doacoes(Doacao toCreate);
    
}
