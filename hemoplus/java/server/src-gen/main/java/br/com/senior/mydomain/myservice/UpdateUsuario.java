/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Usuario entity.
 */
@CommandDescription(name="updateUsuario", kind=CommandKind.Update, requestPrimitive="updateUsuario", responsePrimitive="updateUsuarioResponse")
public interface UpdateUsuario extends MessageHandler {
    
    public Usuario updateUsuario(Usuario toUpdate);
    
}
