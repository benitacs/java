package com.app.StudentTwo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Module {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String title;
	
	
	
	@ManyToOne
	@JsonIgnore
	private Course course;
	
	@OneToMany(mappedBy = "module")
	private List<Lesson> lesson;
	

	public Module(Integer id, String title) {
		this.id = id;
		this.title = title;
	}
	
	

	public Course getCourse() {
		return course;
	}



	public void setCourse(Course course) {
		this.course = course;
	}



	public List<Lesson> getLesson() {
		return lesson;
	}



	public void setLesson(List<Lesson> lesson) {
		this.lesson = lesson;
	}



	public Module() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Module [id=" + id + ", title=" + title + "]";
	}
	
	//@ManyToOne

}
