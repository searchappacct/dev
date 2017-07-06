package com.searchapp.config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControl {

	
	@RequestMapping(value="/test")
	public String check(){
		return "test";
	}
	
}
