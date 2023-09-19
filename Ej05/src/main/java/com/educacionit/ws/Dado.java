/**
 * Dado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.educacionit.ws;

public interface Dado extends java.rmi.Remote {
    public java.lang.Integer tirarDado() throws java.rmi.RemoteException;
    public java.lang.String tirarDiferentesDados(java.lang.Integer cantidadDeCaras) throws java.rmi.RemoteException;
    public java.lang.String tirarParaGenerala(java.lang.Integer cantidadDeDados) throws java.rmi.RemoteException;
}
