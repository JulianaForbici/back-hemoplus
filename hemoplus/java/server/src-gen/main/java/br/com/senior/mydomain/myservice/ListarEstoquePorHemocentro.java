/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * queries de estoque
 */
@CommandDescription(name="listarEstoquePorHemocentro", kind=CommandKind.Query, requestPrimitive="listarEstoquePorHemocentro", responsePrimitive="listarEstoquePorHemocentroResponse")
public interface ListarEstoquePorHemocentro extends MessageHandler {
    
    public ListarEstoquePorHemocentroOutput listarEstoquePorHemocentro(ListarEstoquePorHemocentroInput request);
    
}
