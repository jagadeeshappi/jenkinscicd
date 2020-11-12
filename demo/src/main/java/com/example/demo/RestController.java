package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController { 
    @GetMapping("/get")
    
	public String get()
	{
		
		return "hi jagadeesh";
	}
}
