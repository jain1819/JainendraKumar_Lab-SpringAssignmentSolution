package com.gl.Lab6.StudentSecuritySpring.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.Lab6.StudentSecuritySpring.Entity.Student;
import com.gl.Lab6.StudentSecuritySpring.Repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	 StudentRepository studentRepository;
	
	
	
	
	@Override
	public void save(Student theStudent) {
		// TODO Auto-generated method stub
		studentRepository.save(theStudent);
		
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		
		return studentRepository.findAll();
		
		/*OR 
		 * List<Student> students = studentRepository.findAll();
		 * return students;*/
	}

	@Override
	public Student findById(int theId) {
		// TODO Auto-generated method stub
		
		return studentRepository.findById(theId).get();
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(theId);
		
	}

	
	/*@Override
	public List<Student> searchByName(String name) {
		// TODO Auto-generated method stub
		(List<Student>) theStudent studentRepository.findByName(name);
		return theStudent;
	}*/
	
	/*@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		user.setPassword(bcryptEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}

	@Override
	public Role saveRole(Role role) {
		// TODO Auto-generated method stub
		return roleRepository.save(role);
	}
	 * 
	 * */

}
