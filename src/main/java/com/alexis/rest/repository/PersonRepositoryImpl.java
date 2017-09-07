package com.alexis.rest.repository;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import com.alexis.rest.model.Person;
import com.mongodb.WriteResult;

public class PersonRepositoryImpl implements PersonRepositoryCustom {

	@Autowired
    MongoTemplate mongoTemplate;
	
	@Override
	public Optional<Person> updatePerson(Person person) {

		Query query = new Query(Criteria.where("_id").is(person.get_id()));
		
		Update update = new Update();
		update.set("name", person.getName());
		update.set("lastname", person.getLastname());
		update.set("sex", person.getSex());
		
		WriteResult result = mongoTemplate.updateFirst(query, update, Person.class);

		 if (result.getN() == 1) {
		      return Optional.of(person);
	    }else {
			return Optional.empty();	
		}
		
	}

}
