package com.app.StudentTwo.repository;

import java.util.ArrayList;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.app.StudentTwo.model.Module;

@Repository
public interface ModuleRepository extends CrudRepository<Module, Integer>{
	
	ArrayList<Module> findAll();

}
