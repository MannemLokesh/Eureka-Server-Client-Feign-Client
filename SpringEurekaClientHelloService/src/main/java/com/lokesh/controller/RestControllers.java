package com.lokesh.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers 
{
	@GetMapping("/hello/{name}")
	public ResponseEntity<?> sayHello(@PathVariable String name)
	{
//		return ResponseEntity.ok(null);
		return new ResponseEntity<String>("Hello Service"+ name, HttpStatus.OK);
	}
}
