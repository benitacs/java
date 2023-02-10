package com.app.StudentTwo.services;

import java.util.ArrayList;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.StudentTwo.model.Lesson;
import com.app.StudentTwo.repository.LessonRepository;
import com.app.StudentTwo.repository.ModuleRepository;

@Service
public class LessonService {
	
	@Autowired
	LessonRepository lesRepo;
	
	@Autowired
	ModuleRepository modRepo;
	
	Lesson less;
	
	public ArrayList<Lesson> getalllessons(){
		return (ArrayList<Lesson>) lesRepo.findAll();
		
	}
	
	public Lesson addlesson(Integer id, Lesson l) {
		Optional<com.app.StudentTwo.model.Module> optionModel = modRepo.findById(id);
		if(optionModel.isPresent()) {
			com.app.StudentTwo.model.Module mod = optionModel.get();
			l.setModule(mod);
			return lesRepo.save(l);
		}else {
			throw new EntityNotFoundException("Lesson not found with id: " + id); 
		}
		
		
	}
/*
 * 
 * 
 * public Module addModule(Integer id, Module mo) {
		Optional<Course> optionalCourse = courserepo.findById(id);
		if(optionalCourse.isPresent()) {
			Course course = optionalCourse.get();
			mo.setCourse(course);
			return modulerepo.save(mo); 
		} else {
			throw new EntityNotFoundException("Course not found with id: " + id); 
		}
	}
 */
}
