package com.alexis.rest.model;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "country")
public class Country implements Serializable{

	@Id
	private ObjectId _id;
	private String 	name;
	private String 	code;
	
	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
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
