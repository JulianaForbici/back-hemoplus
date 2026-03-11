/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * actions de agendamento
 */
@CommandDescription(name="criarAgendamento", kind=CommandKind.Action, requestPrimitive="criarAgendamento", responsePrimitive="criarAgendamentoResponse")
public interface CriarAgendamento extends MessageHandler {
    
    public CriarAgendamentoOutput criarAgendamento(CriarAgendamentoInput request);
    
}
