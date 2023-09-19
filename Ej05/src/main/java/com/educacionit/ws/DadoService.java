/**
 * DadoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.educacionit.ws;

public interface DadoService extends javax.xml.rpc.Service {
    public java.lang.String getDadoPortAddress();

    public com.educacionit.ws.Dado getDadoPort() throws javax.xml.rpc.ServiceException;

    public com.educacionit.ws.Dado getDadoPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
