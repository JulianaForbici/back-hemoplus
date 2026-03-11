/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Estoque entity.
 */
@CommandDescription(name="updateMergeEstoque", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeEstoque", responsePrimitive="updateMergeEstoqueResponse")
public interface UpdateMergeEstoque extends MessageHandler {
    
    public Estoque updateMergeEstoque(Estoque toUpdateMerge);
    
}
