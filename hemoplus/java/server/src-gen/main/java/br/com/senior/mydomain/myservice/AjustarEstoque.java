/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * actions de estoque
 */
@CommandDescription(name="ajustarEstoque", kind=CommandKind.Action, requestPrimitive="ajustarEstoque", responsePrimitive="ajustarEstoqueResponse")
public interface AjustarEstoque extends MessageHandler {
    
    public AjustarEstoqueOutput ajustarEstoque(AjustarEstoqueInput request);
    
}
