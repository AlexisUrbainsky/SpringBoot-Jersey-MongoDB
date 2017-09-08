package com.alexis.rest.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.alexis.rest.model.Country;

public interface CountryRepository extends MongoRepository<Country, ObjectId> {

}
