/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Hemocentro entity.
 */
@CommandDescription(name="listHemocentro", kind=CommandKind.List, requestPrimitive="listHemocentro", responsePrimitive="listHemocentroResponse")
public interface ListHemocentro extends MessageHandler {
    
    public Hemocentro.PagedResults listHemocentro(Hemocentro.PageRequest pageRequest);
    
}
