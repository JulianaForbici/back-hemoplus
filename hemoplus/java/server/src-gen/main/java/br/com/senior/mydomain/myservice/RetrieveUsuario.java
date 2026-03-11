/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Usuario entity.
 */
@CommandDescription(name="retrieveUsuario", kind=CommandKind.Retrieve, requestPrimitive="retrieveUsuario", responsePrimitive="retrieveUsuarioResponse")
public interface RetrieveUsuario extends MessageHandler {
    
    public Usuario retrieveUsuario(Usuario.GetRequest id);
    
}
