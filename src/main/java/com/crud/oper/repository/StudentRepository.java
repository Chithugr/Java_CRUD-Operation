package com.crud.oper.repository;

import org.springframework.data.repository.CrudRepository;

import com.crud.oper.bean.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
