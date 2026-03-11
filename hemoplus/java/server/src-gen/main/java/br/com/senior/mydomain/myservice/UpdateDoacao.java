/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Doacao entity.
 */
@CommandDescription(name="updateDoacao", kind=CommandKind.Update, requestPrimitive="updateDoacao", responsePrimitive="updateDoacaoResponse")
public interface UpdateDoacao extends MessageHandler {
    
    public Doacao updateDoacao(Doacao toUpdate);
    
}
