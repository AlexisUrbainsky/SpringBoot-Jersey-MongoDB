package com.alexis.RestJerseyMongo.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.alexis.RestJerseyMongo.model.Person;

public interface PersonRepository extends MongoRepository<Person, Long> {
	
	Person findFirtByLastName(String lastName);
	
	Person findByLastNameAndName(String lastName,String name);
	
	@Query("{lastName:'?0'}")
	Person findPersonByLastName(String lastName);
	
	@Query("{lastName:{$regex:?0}}")
	List<Person> findPersonByRegExLastName(String lastName);
	
}
