/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name = "createBulkUsuario", kind = CommandKind.Create, requestPrimitive = "createBulkUsuario", responsePrimitive="")
public interface CreateBulkUsuario extends MessageHandler {
    public CreateBulkUsuarioOutput createBulkUsuario(CreateBulkUsuarioInput toCreate);
}
