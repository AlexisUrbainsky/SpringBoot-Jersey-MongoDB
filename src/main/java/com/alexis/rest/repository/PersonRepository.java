package com.alexis.rest.repository;

import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.alexis.rest.model.Person;

public interface PersonRepository extends MongoRepository<Person, ObjectId>, PersonRepositoryCustom {
	
	Person findFirtByLastname(String lastname);
	
	Person findByLastnameAndName(String lastName,String name);
	
	@Query("{lastname:'?0'}")
	Person findPersonByLastname(String lastname);
	
	@Query("{lastname:{$regex:?0}}")
	List<Person> findPersonByRegExLastname(String lastname);
	
}
