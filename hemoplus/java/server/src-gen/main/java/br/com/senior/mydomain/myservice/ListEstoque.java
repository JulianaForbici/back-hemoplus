/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Estoque entity.
 */
@CommandDescription(name="listEstoque", kind=CommandKind.List, requestPrimitive="listEstoque", responsePrimitive="listEstoqueResponse")
public interface ListEstoque extends MessageHandler {
    
    public Estoque.PagedResults listEstoque(Estoque.PageRequest pageRequest);
    
}
