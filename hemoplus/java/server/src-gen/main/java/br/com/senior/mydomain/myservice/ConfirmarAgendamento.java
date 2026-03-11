/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="confirmarAgendamento", kind=CommandKind.Action, requestPrimitive="confirmarAgendamento", responsePrimitive="confirmarAgendamentoResponse")
public interface ConfirmarAgendamento extends MessageHandler {
    
    public ConfirmarAgendamentoOutput confirmarAgendamento(ConfirmarAgendamentoInput request);
    
}
