/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
 */
@CommandDescription(name="deleteAgendamento_Doacoes", kind=CommandKind.Delete, requestPrimitive="deleteAgendamento_Doacoes", responsePrimitive="deleteAgendamento_DoacoesResponse")
public interface DeleteAgendamento_Doacoes extends MessageHandler {
    
    public void deleteAgendamento_Doacoes(Doacao.Id id);
    
}
