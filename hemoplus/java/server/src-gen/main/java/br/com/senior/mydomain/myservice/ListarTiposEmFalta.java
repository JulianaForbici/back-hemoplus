/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="listarTiposEmFalta", kind=CommandKind.Query, requestPrimitive="listarTiposEmFalta", responsePrimitive="listarTiposEmFaltaResponse")
public interface ListarTiposEmFalta extends MessageHandler {
    
    public ListarTiposEmFaltaOutput listarTiposEmFalta(ListarTiposEmFaltaInput request);
    
}
