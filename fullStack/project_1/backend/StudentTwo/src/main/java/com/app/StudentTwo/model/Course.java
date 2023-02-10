package com.app.StudentTwo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	String title;
	String author;
	
	@OneToMany(mappedBy="course")
	private List<Module> modules;
	
	
	
	public Course() {
		super();
	}
	public Course(Integer id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	
	

	public Course(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	public List<Module> getModules() {
		return modules;
	}
	public void setModules(List<Module> modules) {
		this.modules = modules;
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
	public String getauthor() {
		return author;
	}
	public void setauthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", author=" + author + "]";
	}
	
	
	

}
