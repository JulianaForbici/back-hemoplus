/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Estoque entity.
 */
@CommandDescription(name="createMergeEstoque", kind=CommandKind.CreateMerge, requestPrimitive="createMergeEstoque", responsePrimitive="createMergeEstoqueResponse")
public interface CreateMergeEstoque extends MessageHandler {
    
    public Estoque createMergeEstoque(Estoque toCreateMerge);
    
}
