package com.gl.Lab6.StudentSecuritySpring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


import com.gl.Lab6.StudentSecuritySpring.Entity.User;
import com.gl.Lab6.StudentSecuritySpring.Repository.UserRepository;
import com.gl.Lab6.StudentSecuritySpring.Security.MyUserDetails;


public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepository.getByUsername(username);
		
		
		if(user == null) {
			throw new UsernameNotFoundException("Could not find user");
		}
		return new MyUserDetails(user);
	}
	
	
}
