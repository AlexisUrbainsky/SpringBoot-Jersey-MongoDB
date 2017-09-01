package com.alexis.RestJerseyMongo.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.alexis.RestJerseyMongo.model.Person;
import com.alexis.RestJerseyMongo.repository.PersonRepository;

@Path("/person")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Component
public class PersonResource {
	
	@Autowired
	PersonRepository repository;
	
	@GET
	public Response.ResponseBuilder getAllPersons(){
		return Response.ok(repository.findAll());
	}
	
	@GET
	@Path("/{lastName}")
	public Response.ResponseBuilder getPersonByLastName(@PathParam("{lastName}") String lastName){
		
		Person person = repository.findFirtByLastName(lastName);
		
		if(person == null) {
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}else {
			return Response.ok(person);	
		}
		
	}
	
}
