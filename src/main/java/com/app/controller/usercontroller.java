package com.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class usercontroller {
	
	@GetMapping("/")
	public String login()
	{
	

		return"login";
	}

}