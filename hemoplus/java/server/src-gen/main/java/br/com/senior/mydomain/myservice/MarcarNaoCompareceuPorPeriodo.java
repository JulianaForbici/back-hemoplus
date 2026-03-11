/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="marcarNaoCompareceuPorPeriodo", kind=CommandKind.Action, requestPrimitive="marcarNaoCompareceuPorPeriodo", responsePrimitive="marcarNaoCompareceuPorPeriodoResponse")
public interface MarcarNaoCompareceuPorPeriodo extends MessageHandler {
    
    public MarcarNaoCompareceuPorPeriodoOutput marcarNaoCompareceuPorPeriodo(MarcarNaoCompareceuPorPeriodoInput request);
    
}
