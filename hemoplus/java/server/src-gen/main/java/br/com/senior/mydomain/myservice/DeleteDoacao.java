/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Doacao entity.
 */
@CommandDescription(name="deleteDoacao", kind=CommandKind.Delete, requestPrimitive="deleteDoacao", responsePrimitive="deleteDoacaoResponse")
public interface DeleteDoacao extends MessageHandler {
    
    public void deleteDoacao(Doacao.Id id);
    
}
