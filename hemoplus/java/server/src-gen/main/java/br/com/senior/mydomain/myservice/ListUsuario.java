/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Usuario entity.
 */
@CommandDescription(name="listUsuario", kind=CommandKind.List, requestPrimitive="listUsuario", responsePrimitive="listUsuarioResponse")
public interface ListUsuario extends MessageHandler {
    
    public Usuario.PagedResults listUsuario(Usuario.PageRequest pageRequest);
    
}
