package com.alexis.rest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.alexis.rest.model.Passport;

public interface PassportRepository extends MongoRepository<Passport, Long> {
	
	
	
	
}
