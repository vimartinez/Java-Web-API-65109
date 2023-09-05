package com.educacionit.ws;

import java.util.ArrayList;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

@WebService
public class Dado {
	
	@WebMethod
	public Integer tirarDado() {
		return (int) (Math.random()*6+1);
		
	}
	
	@WebMethod(operationName = "TirarDiferentesDados")
	@WebResult(name="Resultado")
	public String tirarDadoNCaras(@WebParam(name="CantidadDeCaras") Integer cantidadDeCaras) {
		
		String resultado = "";
		ArrayList<Integer> carasSoportadas = new ArrayList<Integer>();
		carasSoportadas.add(4);
		carasSoportadas.add(6);
		carasSoportadas.add(8);
		carasSoportadas.add(12);
		carasSoportadas.add(20);
		
		if (carasSoportadas.contains(cantidadDeCaras)) {
			Integer tirada = (int) (Math.random()*cantidadDeCaras+1);
			resultado = "Se tiró un dado de " + cantidadDeCaras + " caras y salió " + tirada.toString();
		}
		else {
			resultado = "No existe un dado de " + cantidadDeCaras + " caras!!!";
		}
		
		return resultado;
		
	}
	
	@WebMethod(operationName="TirarParaGenerala")
	@WebResult(name="Resultado")
	public String tirarGenerala(@WebParam(name="cantidadDeDados") Integer cantidadDeDados) {
		
		String resultado = "";
		if((cantidadDeDados > 0) && (cantidadDeDados < 6)) {
			for(int i=0; i<cantidadDeDados;i++) {
				resultado = resultado + tirarDado().toString() + " ";
			}
		}
		else {
			resultado = "En la generala se tira entre 1 y 5 dados";
		}
		
		return resultado;
		
	}

}
