/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
 */
@CommandDescription(name="retrieveAgendamento_Doacoes", kind=CommandKind.Retrieve, requestPrimitive="retrieveAgendamento_Doacoes", responsePrimitive="retrieveAgendamento_DoacoesResponse")
public interface RetrieveAgendamento_Doacoes extends MessageHandler {
    
    public Doacao retrieveAgendamento_Doacoes(Doacao.GetRequest id);
    
}
