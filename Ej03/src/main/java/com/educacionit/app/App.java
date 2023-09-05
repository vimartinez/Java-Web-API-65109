package com.educacionit.app;

import com.educacionit.ws.ProductosWsImpl;

import jakarta.xml.ws.Endpoint;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Levantando Web Service Productos");
		Endpoint.publish("http://localhost:8080/wssoap/products", new ProductosWsImpl());
		System.out.println("http://localhost:8080/wssoap/products");

	}

}
