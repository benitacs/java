package com.app.StudentTwo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.StudentTwo.model.Customer;
import com.app.StudentTwo.services.CustomerService;

@RestController
@CrossOrigin("*")
public class CustomerController {
	
	@Autowired
	CustomerService custser;
	
	@GetMapping("/api/v1/customer")
	public ArrayList<Customer> getallcustomers(){
		return custser.getallcustomers();
	}

}
