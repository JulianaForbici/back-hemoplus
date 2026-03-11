/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Usuario entity.
 */
@CommandDescription(name="updateMergeUsuario", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeUsuario", responsePrimitive="updateMergeUsuarioResponse")
public interface UpdateMergeUsuario extends MessageHandler {
    
    public Usuario updateMergeUsuario(Usuario toUpdateMerge);
    
}
