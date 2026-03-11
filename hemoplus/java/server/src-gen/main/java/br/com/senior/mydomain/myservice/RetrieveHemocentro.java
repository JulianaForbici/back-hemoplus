/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Hemocentro entity.
 */
@CommandDescription(name="retrieveHemocentro", kind=CommandKind.Retrieve, requestPrimitive="retrieveHemocentro", responsePrimitive="retrieveHemocentroResponse")
public interface RetrieveHemocentro extends MessageHandler {
    
    public Hemocentro retrieveHemocentro(Hemocentro.GetRequest id);
    
}
