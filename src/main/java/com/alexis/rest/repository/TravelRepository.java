package com.alexis.rest.repository;

import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.alexis.rest.model.Travel;

public interface TravelRepository extends MongoRepository<Travel, ObjectId> {

	@Query("{'personId' : {'$gte' : {'$oid': \"50b98ed00000000000000000\"}}}")
	public List<Travel> findTravelsByIdPassport(ObjectId id);
	
}

