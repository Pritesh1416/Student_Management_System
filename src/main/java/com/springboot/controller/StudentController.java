package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Student;
import com.springboot.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	@GetMapping("/read/{id}")
	public Student getStudent(@PathVariable int id) {
		return studentService.getById(id);
	}
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		return studentService.deleteById(id);
	}
	@PostMapping("/createAll")
	public List<Student> createAllStudents(@RequestBody List<Student> students) {
		return studentService.addStudents(students);
	}
	@GetMapping("/readAll")
	public List<Student> getAllStudents() {
		return studentService.findAll();
	}

}
