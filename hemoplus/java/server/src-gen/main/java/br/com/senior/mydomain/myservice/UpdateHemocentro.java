/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Hemocentro entity.
 */
@CommandDescription(name="updateHemocentro", kind=CommandKind.Update, requestPrimitive="updateHemocentro", responsePrimitive="updateHemocentroResponse")
public interface UpdateHemocentro extends MessageHandler {
    
    public Hemocentro updateHemocentro(Hemocentro toUpdate);
    
}
