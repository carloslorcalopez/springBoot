package com.example.demo;


import java.util.List;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerUser {

	
	@Autowired
	private UserRepository repository;

	
	@GetMapping("/customers")
	public List<User> getCustomers() {
		return IteratorUtils.toList(repository.findAll().iterator());
	}
}
