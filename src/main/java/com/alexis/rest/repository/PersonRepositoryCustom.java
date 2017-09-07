package com.alexis.rest.repository;

import java.util.Optional;

import com.alexis.rest.model.Person;

public interface PersonRepositoryCustom {

	public Optional<Person> updatePerson(Person person);
	
}
