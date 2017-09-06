package com.alexis.rest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.alexis.rest.model.Travel;

public interface CountryRepository extends MongoRepository<Travel, Long> {

}
