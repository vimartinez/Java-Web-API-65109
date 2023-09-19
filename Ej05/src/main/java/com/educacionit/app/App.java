package com.educacionit.app;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import com.educacionit.ws.DadoPortBindingStub;
import com.educacionit.ws.DadoServiceLocator;

public class App {

	public static void main(String[] args) throws MalformedURLException, RemoteException {
		
		DadoServiceLocator dadoServiceLocator = new DadoServiceLocator();
		DadoPortBindingStub dadoProtBindingStub = new DadoPortBindingStub(new URL(dadoServiceLocator.getDadoPortAddress()), dadoServiceLocator);
		
		System.out.println("Se tiró el dado desde el WS y el resultado es: " + dadoProtBindingStub.tirarDado());
		
		System.out.println("Se tiró el dado de 12 caras desde el WS y el resultado es: " + dadoProtBindingStub.tirarDiferentesDados(12));
		

	}

}
