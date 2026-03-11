/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Doacao entity.
 */
@CommandDescription(name="createDoacao", kind=CommandKind.Create, requestPrimitive="createDoacao", responsePrimitive="createDoacaoResponse")
public interface CreateDoacao extends MessageHandler {
    
    public Doacao createDoacao(Doacao toCreate);
    
}
