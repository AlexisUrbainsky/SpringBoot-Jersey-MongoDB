package com.alexis.RestJerseyMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.alexis.RestJerseyMongo.model.Travel;

public interface TravelRepository extends MongoRepository<Travel, Long> {

}
