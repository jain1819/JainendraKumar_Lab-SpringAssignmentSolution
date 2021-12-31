package com.gl.Lab6.StudentSecuritySpring.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gl.Lab6.StudentSecuritySpring.Entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

	
	@Query ("SELECT u FROM User u WHERE u.username =?1")
	public User getByUsername(String username);
}
