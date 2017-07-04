package com.searchapp.util;

import java.util.UUID;

public class UserRegistrationHelper {

	public static String generateUUID(){
		UUID uuid=UUID.randomUUID();
		return uuid.toString();
	} 
	
	
}
