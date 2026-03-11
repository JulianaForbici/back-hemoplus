/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Usuario entity.
 */
@CommandDescription(name="deleteUsuario", kind=CommandKind.Delete, requestPrimitive="deleteUsuario", responsePrimitive="deleteUsuarioResponse")
public interface DeleteUsuario extends MessageHandler {
    
    public void deleteUsuario(Usuario.Id id);
    
}
