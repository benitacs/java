package com.app.StudentTwo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	
	String name;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	
	int age;
	
	@OneToMany(mappedBy="customer")
	private List<Creditcard> creditcard;
	

	public List<Creditcard> getCreditcard() {
		return creditcard;
	}

	public void setCreditcard(List<Creditcard> creditcard) {
		this.creditcard = creditcard;
	}

	public Customer(String name, Integer id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public Customer() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	
	

}
