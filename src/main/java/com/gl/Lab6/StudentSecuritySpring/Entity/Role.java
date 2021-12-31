package com.gl.Lab6.StudentSecuritySpring.Entity;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name ="roles")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="role_id")
	private int id;
	
	private String name;
	
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}   
	
	
}
