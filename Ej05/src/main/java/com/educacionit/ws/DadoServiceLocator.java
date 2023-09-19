/**
 * DadoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.educacionit.ws;

public class DadoServiceLocator extends org.apache.axis.client.Service implements com.educacionit.ws.DadoService {

    public DadoServiceLocator() {
    }


    public DadoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DadoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DadoPort
    private java.lang.String DadoPort_address = "http://localhost:8090/wssoap/tirardado";

    public java.lang.String getDadoPortAddress() {
        return DadoPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DadoPortWSDDServiceName = "DadoPort";

    public java.lang.String getDadoPortWSDDServiceName() {
        return DadoPortWSDDServiceName;
    }

    public void setDadoPortWSDDServiceName(java.lang.String name) {
        DadoPortWSDDServiceName = name;
    }

    public com.educacionit.ws.Dado getDadoPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DadoPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDadoPort(endpoint);
    }

    public com.educacionit.ws.Dado getDadoPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.educacionit.ws.DadoPortBindingStub _stub = new com.educacionit.ws.DadoPortBindingStub(portAddress, this);
            _stub.setPortName(getDadoPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDadoPortEndpointAddress(java.lang.String address) {
        DadoPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.educacionit.ws.Dado.class.isAssignableFrom(serviceEndpointInterface)) {
                com.educacionit.ws.DadoPortBindingStub _stub = new com.educacionit.ws.DadoPortBindingStub(new java.net.URL(DadoPort_address), this);
                _stub.setPortName(getDadoPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DadoPort".equals(inputPortName)) {
            return getDadoPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.educacionit.com/", "DadoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.educacionit.com/", "DadoPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DadoPort".equals(portName)) {
            setDadoPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
