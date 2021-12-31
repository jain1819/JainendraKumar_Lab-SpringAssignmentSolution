package com.gl.Lab6.StudentSecuritySpring.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.Lab6.StudentSecuritySpring.Entity.Student;

@Service
public interface StudentService {
	
	//Create
	public void save (Student theStudent);
	
	//Read
	public List<Student> findAll();
	public Student findById(int id);
	
	//Delete
	public void deleteById(int id);
	
	//Search
	//public List<Student> searchByName(String name);
	
	
	/*public User saveUser(User user);
	public Role saveRole(Role role);
	 * */
	
	
}
