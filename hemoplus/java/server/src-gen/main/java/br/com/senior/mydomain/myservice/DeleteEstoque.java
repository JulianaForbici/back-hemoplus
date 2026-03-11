/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Estoque entity.
 */
@CommandDescription(name="deleteEstoque", kind=CommandKind.Delete, requestPrimitive="deleteEstoque", responsePrimitive="deleteEstoqueResponse")
public interface DeleteEstoque extends MessageHandler {
    
    public void deleteEstoque(Estoque.Id id);
    
}
