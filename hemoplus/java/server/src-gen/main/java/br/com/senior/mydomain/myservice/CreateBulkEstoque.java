/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name = "createBulkEstoque", kind = CommandKind.Create, requestPrimitive = "createBulkEstoque", responsePrimitive="")
public interface CreateBulkEstoque extends MessageHandler {
    public CreateBulkEstoqueOutput createBulkEstoque(CreateBulkEstoqueInput toCreate);
}
