package com.alexis.rest.model;

import java.io.Serializable;
import java.util.Date;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "travels")
public class Travel implements Serializable {
	
	@Id
	private ObjectId _id;
	private ObjectId personId;
	private String  purpose;
	private Date 	startDate;
	private Date 	endDate;
	private Country country;
	
	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public ObjectId getPersonId() {
		return personId;
	}
	public void setPersonId(ObjectId personId) {
		this.personId = personId;
	}
	
	//Do HashCode equals & toString methods
	
}
