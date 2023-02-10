package com.app.StudentTwo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.StudentTwo.model.Course;
import com.app.StudentTwo.repository.CourseRepository;

@Service
public class CourseService{

	@Autowired
	CourseRepository courseRepo;
	
	public ArrayList<Course> getallCourses()
	{
		return (ArrayList<Course>) courseRepo.findAll();
	}
	
	
	public Course addcourse(Course cou) {
		return this.courseRepo.save(cou);
	}

}
