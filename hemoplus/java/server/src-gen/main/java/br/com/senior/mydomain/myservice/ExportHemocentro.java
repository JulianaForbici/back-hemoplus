/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="exportHemocentro", kind=CommandKind.Query, requestPrimitive="exportHemocentro", responsePrimitive="exportHemocentroResponse")
public interface ExportHemocentro extends MessageHandler {
    
    public ExportHemocentroOutput exportHemocentro(ExportHemocentroInput request);
    
}
