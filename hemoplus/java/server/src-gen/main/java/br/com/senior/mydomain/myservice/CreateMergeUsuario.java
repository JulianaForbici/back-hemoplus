/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Usuario entity.
 */
@CommandDescription(name="createMergeUsuario", kind=CommandKind.CreateMerge, requestPrimitive="createMergeUsuario", responsePrimitive="createMergeUsuarioResponse")
public interface CreateMergeUsuario extends MessageHandler {
    
    public Usuario createMergeUsuario(Usuario toCreateMerge);
    
}
