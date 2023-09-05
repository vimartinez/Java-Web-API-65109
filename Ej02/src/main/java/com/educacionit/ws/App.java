package com.educacionit.ws;

import jakarta.xml.ws.Endpoint;

public class App {

	public static void main(String[] args) {
		System.out.println("Levando Web Service SOAP");
		Endpoint.publish("http://localhost:8090/wssoap/tirardado", new Dado());
		System.out.println("http://localhost:8090/wssoap/tirardado");

	}

}
