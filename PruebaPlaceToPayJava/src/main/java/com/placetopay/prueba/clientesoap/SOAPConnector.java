package com.placetopay.prueba.clientesoap;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

//Clase para conectarse al web service, extiende de la clase WebServiceGatewaySupport
public class SOAPConnector extends WebServiceGatewaySupport {

	public Object callWebService(String url, Object request){
        return getWebServiceTemplate().marshalSendAndReceive(url, request);
    }
}
