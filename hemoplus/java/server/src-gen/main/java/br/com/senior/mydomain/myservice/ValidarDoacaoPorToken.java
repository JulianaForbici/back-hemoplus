/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * validacao de doacao por token
 */
@CommandDescription(name="validarDoacaoPorToken", kind=CommandKind.Action, requestPrimitive="validarDoacaoPorToken", responsePrimitive="validarDoacaoPorTokenResponse")
public interface ValidarDoacaoPorToken extends MessageHandler {
    
    public ValidarDoacaoPorTokenOutput validarDoacaoPorToken(ValidarDoacaoPorTokenInput request);
    
}
