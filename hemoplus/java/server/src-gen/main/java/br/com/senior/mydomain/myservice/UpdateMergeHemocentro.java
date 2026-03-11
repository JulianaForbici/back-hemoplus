/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Hemocentro entity.
 */
@CommandDescription(name="updateMergeHemocentro", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeHemocentro", responsePrimitive="updateMergeHemocentroResponse")
public interface UpdateMergeHemocentro extends MessageHandler {
    
    public Hemocentro updateMergeHemocentro(Hemocentro toUpdateMerge);
    
}
