package com.alexis.RestJerseyMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.alexis.RestJerseyMongo.model.Travel;

public interface CountryRepository extends MongoRepository<Travel, Long> {

}
