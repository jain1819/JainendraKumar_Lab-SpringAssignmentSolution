package com.gl.Lab6.StudentSecuritySpring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.Lab6.StudentSecuritySpring.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	Student findByName(String studentName);
}
