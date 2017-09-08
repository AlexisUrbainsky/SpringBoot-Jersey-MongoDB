package com.alexis.rest.resources;

import java.net.URI;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.alexis.rest.model.Person;
import com.alexis.rest.repository.PersonRepository;
import java.util.Optional;


@Path("/person")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Component
public class PersonResource {
	
	private static final String PERSON_NOT_FOUND_MSG = "Person with _ID[%s] does not exist";
	
	@Autowired
	PersonRepository repository;

	@Context
	private UriInfo uriInfo;
	
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
	
	@POST
	@Path("/save")
	public Response savePerson(Person person) {

		person = repository.save(person);
		
		URI location = uriInfo.getAbsolutePathBuilder().path("{_id}").resolveTemplate("_id", person.get_id()).build();
		
		return Response.created(location).build();
		
	}
	
	@DELETE
	@Path("/delete/{id}")
	public Response deletePerson(@PathParam("id") String id){
		
		if(id == null){
			return Response.status(Status.NOT_ACCEPTABLE).build();
		}
		
		ObjectId objectId = new ObjectId(id);
		
		repository.delete(objectId);
		
		return Response.accepted().build();
		
	}
	
	@PUT
	@Path("/update")
	public Response updatePerson(Person person) {
		
		Optional<Person> optional = repository.updatePerson(person);
	
		if (optional.isPresent()) {
	      return Response.status(Status.NO_CONTENT).build();
	    }
	
	    return Response.status(Status.NOT_FOUND).entity(String.format(PERSON_NOT_FOUND_MSG, person.get_id())).build();
	}
	
}
