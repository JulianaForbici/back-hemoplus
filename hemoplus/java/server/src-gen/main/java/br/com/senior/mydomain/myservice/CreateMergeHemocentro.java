/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Hemocentro entity.
 */
@CommandDescription(name="createMergeHemocentro", kind=CommandKind.CreateMerge, requestPrimitive="createMergeHemocentro", responsePrimitive="createMergeHemocentroResponse")
public interface CreateMergeHemocentro extends MessageHandler {
    
    public Hemocentro createMergeHemocentro(Hemocentro toCreateMerge);
    
}
