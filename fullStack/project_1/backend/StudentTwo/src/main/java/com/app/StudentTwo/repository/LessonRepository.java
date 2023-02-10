package com.app.StudentTwo.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.StudentTwo.model.Lesson;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Integer>{
	ArrayList<Lesson> findAll();

}
