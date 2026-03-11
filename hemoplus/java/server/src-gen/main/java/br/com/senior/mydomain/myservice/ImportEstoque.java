/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="importEstoque", kind=CommandKind.Action, requestPrimitive="importEstoque", responsePrimitive="importEstoqueResponse")
public interface ImportEstoque extends MessageHandler {
    
    public ImportEstoqueOutput importEstoque(ImportEstoqueInput request);
    
}
