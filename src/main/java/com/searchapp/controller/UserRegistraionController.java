package com.searchapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.searchapp.dto.UserCreated;
import com.searchapp.dto.UserDto;

@RestController
public class UserRegistraionController {
	private static final Logger logger = LoggerFactory.getLogger(UserRegistraionController.class);
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public UserCreated register(@RequestBody UserDto user){
		
		logger.debug("user"+user.toString());
		return null;
		
	}
	
}
