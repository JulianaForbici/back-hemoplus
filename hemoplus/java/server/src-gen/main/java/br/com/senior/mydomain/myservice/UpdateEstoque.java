/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Estoque entity.
 */
@CommandDescription(name="updateEstoque", kind=CommandKind.Update, requestPrimitive="updateEstoque", responsePrimitive="updateEstoqueResponse")
public interface UpdateEstoque extends MessageHandler {
    
    public Estoque updateEstoque(Estoque toUpdate);
    
}
