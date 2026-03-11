/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
 */
@CommandDescription(name="updateAgendamento_Doacoes", kind=CommandKind.Update, requestPrimitive="updateAgendamento_Doacoes", responsePrimitive="updateAgendamento_DoacoesResponse")
public interface UpdateAgendamento_Doacoes extends MessageHandler {
    
    public Doacao updateAgendamento_Doacoes(Doacao toUpdate);
    
}
