/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Hemocentro entity.
 */
@CommandDescription(name="deleteHemocentro", kind=CommandKind.Delete, requestPrimitive="deleteHemocentro", responsePrimitive="deleteHemocentroResponse")
public interface DeleteHemocentro extends MessageHandler {
    
    public void deleteHemocentro(Hemocentro.Id id);
    
}
