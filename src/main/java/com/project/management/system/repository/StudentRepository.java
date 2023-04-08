package com.project.management.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.management.system.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
