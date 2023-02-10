package com.app.StudentTwo.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.StudentTwo.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{

	
	ArrayList<Customer> findAll();
}
