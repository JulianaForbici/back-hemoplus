/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="importHemocentro", kind=CommandKind.Action, requestPrimitive="importHemocentro", responsePrimitive="importHemocentroResponse")
public interface ImportHemocentro extends MessageHandler {
    
    public ImportHemocentroOutput importHemocentro(ImportHemocentroInput request);
    
}
