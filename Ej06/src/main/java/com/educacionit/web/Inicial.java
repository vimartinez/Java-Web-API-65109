package com.educacionit.web;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/inicial")
public class Inicial {
	
	@GET
	@Path("/salu")
	@Produces(MediaType.APPLICATION_JSON)
	public String saludo() {
		return "Hola Java API REST!";
	}

	
	
	// Locahost + puerto + nombre de proyecto + path de Config + path de la clase + path del métdodo
	// http://localhost:8080/Ej06/rest/inicial/salu
}
