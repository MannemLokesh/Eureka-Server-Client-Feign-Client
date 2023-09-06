package com.lokesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lokesh.helloserviceclient.HelloClient;

@RestController
public class RestControllers 
{
	@Autowired
	private HelloClient client;
	
	@CrossOrigin(origins = {"*"})
	@GetMapping("/hi/{name}")
	public ResponseEntity<?> sayHello(@PathVariable String name)
	{
		ResponseEntity<String> sayHello = client.sayHello(name);
//		System.out.println(client.sayHello(name));
//		System.out.println(sayHello);
		
		String body = sayHello.getBody();
		return new ResponseEntity<String>("Hi Service "+ name+ body, HttpStatus.OK);
	}
}
