package com.eduacionit.conf;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/jwa")
public class Config extends ResourceConfig{
	
	public Config() {
		packages("com.educacionit.web");
	}

}
