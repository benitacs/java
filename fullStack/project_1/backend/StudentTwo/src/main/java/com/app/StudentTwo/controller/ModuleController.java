package com.app.StudentTwo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.StudentTwo.services.ModuleService;
import com.app.StudentTwo.model.Module;

@RestController
@CrossOrigin("*")
public class ModuleController {
	
	@Autowired
	ModuleService module;
	
	
	//READ
	@GetMapping("/api/v1/module")
	public ArrayList<Module> getAllModule(){
		return module.getAllModule();
	}
	
	@PostMapping("/api/v1/courses/{id}/module")
	public Module addModule(@PathVariable("id") Integer id, @RequestBody Module m) {
		System.out.println("ID = "+id+" Module = "+m);
		return module.addModule(id, m);
	}

	//CREATE

}
