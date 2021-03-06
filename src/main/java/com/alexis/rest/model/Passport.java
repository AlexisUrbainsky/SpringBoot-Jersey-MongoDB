package com.alexis.rest.model;

import java.io.Serializable;
import java.util.Date;

public class Passport implements Serializable {

	private String nationality;
	private Date expeditionDate;
	private Date expirationDate;
	
	public Passport(){
		
	}
	
	public Passport(String nationality, Date expeditionDate,Date expirationDate){
		this.nationality 	= nationality;
		this.expeditionDate = expeditionDate;
		this.expirationDate = expirationDate;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getExpeditionDate() {
		return expeditionDate;
	}

	public void setExpeditionDate(Date expeditionDate) {
		this.expeditionDate = expeditionDate;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	
	//Do HashCode equals & toString methods

}
