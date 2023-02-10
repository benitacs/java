package com.app.StudentTwo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.StudentTwo.model.Student;
import com.app.StudentTwo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository  stuRep;
	
	ArrayList<Student> stuList = new ArrayList<>();
	
	//CREATE
	public Student addStudent(Student stu) {
		//stuList.add(stu);
		return this.stuRep.save(stu);
	}
	
	//READ
	public ArrayList<Student> getStudent(){
		return (ArrayList<Student>) stuRep.findAll();
	}
	
	//UPDATE
	public void updateStudent(Integer id, Student s) {
		Student studentUpdate = stuRep.findById(id).get();
		studentUpdate.setAge(s.getAge());
		studentUpdate.setName(s.getName());
		stuRep.save(studentUpdate);
	}
	
	//DELETE
	public void deleteStudent(Integer id)
	{
		stuRep.deleteById(id);
		
	}
	

}
