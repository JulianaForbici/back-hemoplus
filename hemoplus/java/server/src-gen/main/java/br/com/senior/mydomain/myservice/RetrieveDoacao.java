/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Doacao entity.
 */
@CommandDescription(name="retrieveDoacao", kind=CommandKind.Retrieve, requestPrimitive="retrieveDoacao", responsePrimitive="retrieveDoacaoResponse")
public interface RetrieveDoacao extends MessageHandler {
    
    public Doacao retrieveDoacao(Doacao.GetRequest id);
    
}
