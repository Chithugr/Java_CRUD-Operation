package com.crud.oper.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.oper.bean.Student;
import com.crud.oper.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	public StudentRepository studentrepo;

	public List<Student> getAllStudent(){
		List<Student> student=new ArrayList<>();
		studentrepo.findAll().forEach(student::add);
		return student;

	}
	public void addStudent(Student student) {
		studentrepo.save(student);
	}


	public void updateStudent(Long id ,Student student) {
		studentrepo.save(student);

	}
	public void deleteStudent(Long id) {
		studentrepo.deleteById(id);
		// TODO Auto-generated method stub
		
	}


	//	public void deleteStudent(Long id) {
	//		studentrepo.deleteById(id);
	//		
	//	}




}
