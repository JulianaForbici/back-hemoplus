/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name = "createBulkHemocentro", kind = CommandKind.Create, requestPrimitive = "createBulkHemocentro", responsePrimitive="")
public interface CreateBulkHemocentro extends MessageHandler {
    public CreateBulkHemocentroOutput createBulkHemocentro(CreateBulkHemocentroInput toCreate);
}
