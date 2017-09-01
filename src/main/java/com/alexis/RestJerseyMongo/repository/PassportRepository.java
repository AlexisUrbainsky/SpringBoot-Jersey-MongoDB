package com.alexis.RestJerseyMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.alexis.RestJerseyMongo.model.Passport;

public interface PassportRepository extends MongoRepository<Passport, Long> {
	
	
	
	
}
