/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the doacoes attribute of agendamento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent agendamento entity.
 */
@CommandDescription(name="listAgendamento_Doacoes", kind=CommandKind.List, requestPrimitive="listAgendamento_Doacoes", responsePrimitive="listAgendamento_DoacoesResponse")
public interface ListAgendamento_Doacoes extends MessageHandler {
    
    public Doacao.PagedResults listAgendamento_Doacoes(Doacao.PageRequest pageRequest);
    
}
