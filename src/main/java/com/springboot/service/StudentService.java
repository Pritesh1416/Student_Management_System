package com.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.entity.Student;

@Service
public interface StudentService {

	Student addStudent(Student student);

	Student getById(int id);

	Student updateStudent(Student student);

	String deleteById(int id);

	List<Student> addStudents(List<Student> students);

	List<Student> findAll();

}
