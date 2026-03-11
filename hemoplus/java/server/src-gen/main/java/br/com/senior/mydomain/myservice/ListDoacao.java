/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Doacao entity.
 */
@CommandDescription(name="listDoacao", kind=CommandKind.List, requestPrimitive="listDoacao", responsePrimitive="listDoacaoResponse")
public interface ListDoacao extends MessageHandler {
    
    public Doacao.PagedResults listDoacao(Doacao.PageRequest pageRequest);
    
}
