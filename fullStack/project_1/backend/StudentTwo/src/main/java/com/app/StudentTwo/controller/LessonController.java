package com.app.StudentTwo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.StudentTwo.model.Lesson;
import com.app.StudentTwo.services.LessonService;

@RestController
@CrossOrigin("*")
public class LessonController {
	
	@Autowired
	LessonService lesson;
	
	@GetMapping("/api/v1/lesson")
	public ArrayList<Lesson> getalllessons(){
		return lesson.getalllessons();
		
	}
	
	@PostMapping("/api/v1/{id}/lesson")
	public Lesson addcourse(@PathVariable("id") Integer id, @RequestBody Lesson l) {
		return lesson.addlesson(id, l);
	}
}
