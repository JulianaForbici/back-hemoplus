/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * events de dominio
 */
@SubscriptionDescription(domain="my_domain", service="my_service", event="doacaoConfirmada")
public interface DoacaoConfirmada extends MessageHandler {
    public void doacaoConfirmada(DoacaoConfirmadaPayload payload);
    
}
