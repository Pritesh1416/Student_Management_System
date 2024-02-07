package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.entity.Student;
import com.springboot.repository.StudentRepository;

@Component
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getById(int id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		Student updateStudent = studentRepository.findById(student.getId()).orElse(null);
		updateStudent.setName(student.getName());
		updateStudent.setCollege(student.getCollege());
		updateStudent.setBranch(student.getBranch());
		updateStudent.setContact(student.getContact());
		updateStudent.setEmail(student.getEmail());
		updateStudent.setFee(student.getFee());
		updateStudent.setAddress(student.getAddress());
		return studentRepository.save(updateStudent);
	}

	@Override
	public String deleteById(int id) {
		studentRepository.deleteById(id);
		return "Student Deleted Successfully....!!";
	}

	@Override
	public List<Student> addStudents(List<Student> students) {
		return (List<Student>) studentRepository.saveAll(students);
	}

	@Override
	public List<Student> findAll() {
		return (List<Student>) studentRepository.findAll();
	}

}
