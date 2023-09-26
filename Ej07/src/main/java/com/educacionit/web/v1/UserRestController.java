package com.educacionit.web.v1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/V1/users")
public class UserRestController {
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getUserByid(@PathParam("id") Long id) {
		System.out.println("id recibido:"+ id);
		return "{\"mensaje\":\"El id del usuario recibido es:"+id+"\"}";
		
	}

}
