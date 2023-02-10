package com.app.StudentTwo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.StudentTwo.model.Customer;
import com.app.StudentTwo.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository custrepo;
	
	public ArrayList<Customer> getallcustomers(){
		return (ArrayList<Customer>) custrepo.findAll();
	}
}
