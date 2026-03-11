/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Usuario entity.
 */
@CommandDescription(name="createUsuario", kind=CommandKind.Create, requestPrimitive="createUsuario", responsePrimitive="createUsuarioResponse")
public interface CreateUsuario extends MessageHandler {
    
    public Usuario createUsuario(Usuario toCreate);
    
}
