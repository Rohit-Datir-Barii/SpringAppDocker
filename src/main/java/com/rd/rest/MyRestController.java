package com.rd.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring")
public class MyRestController {
	
	@GetMapping("/msg")
	public String getMesage() {
		return "Welcome to Docker";
	}

}

