package com.searchapp.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserDetails {
	@Id
	@GeneratedValue
	private long iduser;
	
	private String name;
	@Column(name="lat_long")
	private String latLong;
	
	private String city;
	private String country;
	private String zipcode;
	@Column(name="created_on")
	private long createdOn;
	@Column(name="updated_on")
	private long updatedOn;
	public long getIduser() {
		return iduser;
	}
	public void setIduser(long iduser) {
		this.iduser = iduser;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLatLong() {
		return latLong;
	}
	public void setLatLong(String latLong) {
		this.latLong = latLong;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public long getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(long createdOn) {
		this.createdOn = createdOn;
	}
	public long getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(long updatedOn) {
		this.updatedOn = updatedOn;
	}
	
	
	
	
}
