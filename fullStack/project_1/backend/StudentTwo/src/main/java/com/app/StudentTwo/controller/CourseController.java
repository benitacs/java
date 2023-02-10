package com.app.StudentTwo.controller;

import java.util.ArrayList;

//import javax.persistence.criteria.CriteriaBuilder.Case;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.StudentTwo.model.Course;
import com.app.StudentTwo.services.CourseService;

@RestController
@CrossOrigin("*")
public class CourseController {
	
	@Autowired
	CourseService course;
	
	@GetMapping("/api/v1/courses")
	public ArrayList<Course> getAllCourses(){
		
		return course.getallCourses();
	}
	
	//CREATE
		@PostMapping("/api/v1/courses")
		public Course addcourse(@RequestBody Course c) {
			return course.addcourse(c);
		}
	
	/*//CREATE
		@PostMapping("/api/v1/courses/add")
		public Course addcourse(@RequestBody Course c) {
			return course.addcourse(c);
		}*/

}
