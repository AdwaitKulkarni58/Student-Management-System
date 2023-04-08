package com.project.management.system.service;

import java.util.List;

import com.project.management.system.model.Student;

public interface StudentService {

	public List<Student> getAllStudents();

	public Student saveStudent(Student student);

	public Student getStudentById(Long id);

	public Student updateStudent(Student student);

	public void deleteStudentById(Long id);

}
