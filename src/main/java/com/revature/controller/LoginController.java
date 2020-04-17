package com.revature.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/user")
public class LoginController {
	
	@PostMapping("/login.app")
	public @ResponseBody ResponseEntity<String> handlePost()
	{
		return new ResponseEntity<String>("Answer to login", HttpStatus.OK);
		//successful response using postman: localhost:8080/user/login.app
	}
	
	
	

}
