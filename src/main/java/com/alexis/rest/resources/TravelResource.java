package com.alexis.rest.resources;

import java.net.URI;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.alexis.rest.model.Travel;
import com.alexis.rest.repository.TravelRepository;

@Path("/travel")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Component
public class TravelResource {
	
	@Autowired
	TravelRepository travelRepository;
	
	@Context
	UriInfo uriInfo;
	
	
	@GET
	@Path("{personId}")
	public Response findTravelsByPassport(@PathParam("personId") String id ){
		
		ObjectId objId = new ObjectId(id);
		
		List<Travel> travels = travelRepository.findTravelsByIdPassport(objId);
		
		return Response.ok(travels).build();
		
	}

	@POST
	@Path("/save")
	public Response saveTravel(Travel travel) {
		
		travel = travelRepository.save(travel);
		
		URI location = uriInfo.getAbsolutePathBuilder().path("{_id}").resolveTemplate("_id", travel.get_id()).build(); 
		
		return Response.created(location).build();
		
	}
	
	
}
