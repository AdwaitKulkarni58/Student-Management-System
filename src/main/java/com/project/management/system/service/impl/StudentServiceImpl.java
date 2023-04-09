package com.project.management.system.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.management.system.model.Student;
import com.project.management.system.repository.StudentRepository;
import com.project.management.system.service.StudentService;

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
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return null;
	}

	@Override
	public void deleteStudentById(Long id) {

	}

}
