package com.searchapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.searchapp.dao.UserDetails;
import com.searchapp.dao.UserDetailsDAO;
import com.searchapp.dto.UserDto;

@RestController
@RequestMapping("/user")
public class UserRegistraionController {

	 @Autowired
	 private UserDetailsDAO userDao;

	private static final Logger logger = LoggerFactory.getLogger(UserRegistraionController.class);

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {
			return "test";
		//return new ResponseEntity<UserDto>(HttpStatus.NO_CONTENT);
		// return "test";

	}

	@RequestMapping(value = "/create", method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public String register(@RequestBody UserDetails user) {

		logger.debug("user12" + user.toString());
		//valida
		userDao.save(user);
		return "created";

	}

}
