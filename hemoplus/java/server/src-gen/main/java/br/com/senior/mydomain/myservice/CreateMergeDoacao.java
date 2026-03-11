/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Doacao entity.
 */
@CommandDescription(name="createMergeDoacao", kind=CommandKind.CreateMerge, requestPrimitive="createMergeDoacao", responsePrimitive="createMergeDoacaoResponse")
public interface CreateMergeDoacao extends MessageHandler {
    
    public Doacao createMergeDoacao(Doacao toCreateMerge);
    
}
