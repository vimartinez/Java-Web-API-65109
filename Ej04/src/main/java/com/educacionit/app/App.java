package com.educacionit.app;

import com.educacionit.ws.CiudadesWs;

import jakarta.xml.ws.Endpoint;

public class App {

	public static void main(String[] args) {
		
		System.out.println("iniciando WS Ciudades");
		Endpoint.publish("http://localhost:8080/wscities", new CiudadesWs());
		System.out.println("http://localhost:8080/wscities");

	}

}
