/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="cancelarAgendamento", kind=CommandKind.Action, requestPrimitive="cancelarAgendamento", responsePrimitive="cancelarAgendamentoResponse")
public interface CancelarAgendamento extends MessageHandler {
    
    public CancelarAgendamentoOutput cancelarAgendamento(CancelarAgendamentoInput request);
    
}
