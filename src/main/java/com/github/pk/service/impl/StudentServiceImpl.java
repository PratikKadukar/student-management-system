package com.github.pk.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.pk.entity.Student;
import com.github.pk.repository.StudentRepository;
import com.github.pk.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}


	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}

}
