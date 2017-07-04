package com.searchapp.dto;

import org.springframework.stereotype.Component;

@Component
public class UserCreated {

	private String uuid;
	private String name;
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString(){
		
		return "{uuid: "+this.uuid+", name :+"+this.name+"}";
	}
	
	
	
}
