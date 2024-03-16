package com.greatlearning.studentmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.studentmanagement.repository.StudentRepository;
import com.greatlearning.studentmanagement.entity.Student;

import java.util.List;

@Service
public class StudentServiceImplement implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	public List<Student> findAll() {

		List<Student> students = studentRepository.findAll();
		return students;
	}

	public Student findById(int id) {
		Student student = new Student();
		student = studentRepository.findById(id).get();
		return student;
	}

	public void save(Student theStudent) {
		studentRepository.save(theStudent);
	}

	public void deleteById(int Id) {
		studentRepository.deleteById(Id);
	}
}
