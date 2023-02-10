package com.app.StudentTwo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.StudentTwo.model.Student;
import com.app.StudentTwo.services.StudentService;

@RestController
@RequestMapping("api/student")
public class StudentControl {
	
	@Autowired
	StudentService stuSer;
	
	//CREATE
	@PostMapping
	public Student addStudent(@RequestBody Student s) {
		return stuSer.addStudent(s);
	}
	
	//READ
	@GetMapping
	public ArrayList<Student> getStudent(){
		return stuSer.getStudent();
	}
	
	//UPDATE
	@PatchMapping("/{id}")
	public void updateStudent(@PathVariable("id") Integer id, @RequestBody Student s) {
		stuSer.updateStudent(id, s);
	}
	
	//DELETE
	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable("id") Integer id) {
		stuSer.deleteStudent(id);
	}
	
	
	
	

}
