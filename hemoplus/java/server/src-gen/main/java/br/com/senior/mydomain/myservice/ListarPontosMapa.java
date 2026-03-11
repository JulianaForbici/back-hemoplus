/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * queries de mapa e usuario
 */
@CommandDescription(name="listarPontosMapa", kind=CommandKind.Query, requestPrimitive="listarPontosMapa", responsePrimitive="listarPontosMapaResponse")
public interface ListarPontosMapa extends MessageHandler {
    
    public ListarPontosMapaOutput listarPontosMapa(ListarPontosMapaInput request);
    
}
