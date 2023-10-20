package com.crud.oper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.oper.bean.Student;
import com.crud.oper.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentservice;
	

	@GetMapping("/student")
	public List<Student> getAllStudent(){
		
		return studentservice.getAllStudent();
	}
	
	@PostMapping("/student")
	public void addStudent(@RequestBody Student student) {
		studentservice.addStudent(student);
	}
	
	@PutMapping("/student/{id}")
	public void updateStudent(@PathVariable Long id, @RequestBody Student student) {
		studentservice.updateStudent(id, student);
	}
	
	@DeleteMapping("/student/{id}")
	public void deleteStudent(@PathVariable Long id) {
	    studentservice.deleteStudent(id);
	}

}
