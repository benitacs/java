package com.app.StudentTwo.services;

import java.util.ArrayList;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.StudentTwo.repository.CourseRepository;
import com.app.StudentTwo.repository.ModuleRepository;
import com.app.StudentTwo.model.Module;
import com.app.StudentTwo.model.Course;

@Service
public class ModuleService {
	
	@Autowired
	ModuleRepository modulerepo;
	
	@Autowired
	CourseRepository courserepo;
	
	Module module;
	
	public Module addModule(Integer id, Module mo) {
		Optional<Course> optionalCourse = courserepo.findById(id);
		if(optionalCourse.isPresent()) {
			Course course = optionalCourse.get();
			mo.setCourse(course);
			return modulerepo.save(mo); 
		} else {
			throw new EntityNotFoundException("Course not found with id: " + id); 
		}
	}
	
	public ArrayList<Module> getAllModule(){
		return (ArrayList<Module>) modulerepo.findAll();
		
	}

	/*
	public Module addModule(Integer id,Module module) {
        Optional<Course> optionalCourse = courseRepo.findById(id);
        if (optionalCourse.isPresent()) {
            Course course = optionalCourse.get();
            module.setCourse(course);

 

            return moduleRepo.save(module);
        } else {
            throw new EntityNotFoundException("Course not found with id: " + id);
        }
    }*/
}
