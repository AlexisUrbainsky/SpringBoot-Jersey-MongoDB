package com.alexis.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class AppResource {
	
	@GET
	public String welcomeToApp (){
		return "Welcome to my new Api Rest \n\n Created with Spring Boot, Jersey, Hateoas, Spring Data & MongoDB ";
	}

}
