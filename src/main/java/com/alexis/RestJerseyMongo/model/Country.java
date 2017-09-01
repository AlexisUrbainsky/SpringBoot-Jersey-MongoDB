package com.alexis.RestJerseyMongo.model;

public class Country {

	private int 	idCountry;
	private String 	name;
	private String 	code;
	
	public int getIdCountry() {
		return idCountry;
	}
	public void setIdCountry(int idCountry) {
		this.idCountry = idCountry;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	//Do HashCode equals & toString methods
	
}
