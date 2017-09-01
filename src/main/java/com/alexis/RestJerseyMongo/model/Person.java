package com.alexis.RestJerseyMongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "person")
public class Person {
	
	@Id
	private long idPerson;
	private String name;
	private String lastName;
	private String sex;
	private Passport passport;
	
	public Person(){

	}
	
	public Person(String name, String lastName, String sex){
		this.name 	  = name;
		this.lastName = lastName;
		this.sex 	  = sex;
	}

	public long getIdPerson() {
		return idPerson;
	}

	public void setId(long idPerson) {
		this.idPerson = idPerson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	//Do HashCode equals & toString methods
	
}
