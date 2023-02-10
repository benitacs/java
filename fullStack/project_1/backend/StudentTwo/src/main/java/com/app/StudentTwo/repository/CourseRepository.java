package com.app.StudentTwo.repository;

//import java.util.ArrayList;
//import java.util.Optional;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.StudentTwo.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer>{
//public interface CourseRepository extends CrudRepository<Course, Integer>{

	//ArrayList<Course> findAll();
	//Optional<Course> findById(Integer id);

}
