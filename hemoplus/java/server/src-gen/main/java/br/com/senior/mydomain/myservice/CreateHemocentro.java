/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Hemocentro entity.
 */
@CommandDescription(name="createHemocentro", kind=CommandKind.Create, requestPrimitive="createHemocentro", responsePrimitive="createHemocentroResponse")
public interface CreateHemocentro extends MessageHandler {
    
    public Hemocentro createHemocentro(Hemocentro toCreate);
    
}
