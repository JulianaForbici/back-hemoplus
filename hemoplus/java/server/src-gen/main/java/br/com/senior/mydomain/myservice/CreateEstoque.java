/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Estoque entity.
 */
@CommandDescription(name="createEstoque", kind=CommandKind.Create, requestPrimitive="createEstoque", responsePrimitive="createEstoqueResponse")
public interface CreateEstoque extends MessageHandler {
    
    public Estoque createEstoque(Estoque toCreate);
    
}
