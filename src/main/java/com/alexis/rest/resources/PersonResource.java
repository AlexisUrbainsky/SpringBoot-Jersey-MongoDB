package com.alexis.rest.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.alexis.rest.model.Person;
import com.alexis.rest.repository.PersonRepository;

@Path("/person")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Component
public class PersonResource {
	
	@Autowired
	PersonRepository repository;
	
	@GET
	public Response getAllPersons(){
		return Response.ok(repository.findAll()).build();
	}
	
	@GET
	@Path("{lastname}")
	public Response getPersonByLastName(@PathParam("lastname") String lastname){
		
		Person person = repository.findPersonByLastname(lastname);
		
		if(person == null) {
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}else {
			return Response.ok(person).build();	
		}
		
	}
	
}
