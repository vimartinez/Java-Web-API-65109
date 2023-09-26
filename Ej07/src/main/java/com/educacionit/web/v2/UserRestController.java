package com.educacionit.web.v2;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.educacionit.model.User;
import com.educacionit.service.UserService;

@Path("/V2/users")
public class UserRestController {
	
	UserService userService = new UserService();
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUserByid(@PathParam("id") Long id) {
		
		User usuarioObtenido = userService.getUserById(id);
		
		if(usuarioObtenido != null) {
			return Response
					.status(Response.Status.OK)
					.entity(usuarioObtenido)
					.type(MediaType.APPLICATION_JSON)
					.build();
		} else {
			return Response
					.status(Response.Status.NOT_FOUND)
					.entity( "{\"mensaje\":\"No existe un usuario con id: "+id+"\"}")
					.type(MediaType.APPLICATION_JSON)
					.build();
		}	
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addUser(User user) {
		
		if(userService.addUser(user)) {
			return Response
					.status(Response.Status.CREATED)
					.entity("{\"mensaje\":\"Se generó el usuario correctamente! \"}")
					.type(MediaType.APPLICATION_JSON)
					.build();
		} else {
			return Response
					.status(Response.Status.CONFLICT)
					.entity("{\"mensaje\":\"No se pudo generar el usuario! \"}")
					.type(MediaType.APPLICATION_JSON)
					.build();
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAllUsers(){
		return userService.getAll();
		
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public Response delUser(User user) {
		
		if(userService.del(user)) {
			return Response
					.status(Response.Status.OK)
					.entity("{\"mensaje\":\"Se eliminó el usuario correctamente! \"}")
					.type(MediaType.APPLICATION_JSON)
					.build();
			
		} else {
			return Response
					.status(Response.Status.CONFLICT)
					.entity("{\"mensaje\":\"No se pudo eliminar el usuario! \"}")
					.type(MediaType.APPLICATION_JSON)
					.build();
		}
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updUser(User user) {
		
		if(userService.upd(user)) {
			return Response
					.status(Response.Status.OK)
					.entity("{\"mensaje\":\"Se modificó el usuario correctamente! \"}")
					.type(MediaType.APPLICATION_JSON)
					.build();
		} else {
			return Response
					.status(Response.Status.CONFLICT)
					.entity("{\"mensaje\":\"No se pudo modificar el usuario! \"}")
					.type(MediaType.APPLICATION_JSON)
					.build();
		}
		
	}

}
