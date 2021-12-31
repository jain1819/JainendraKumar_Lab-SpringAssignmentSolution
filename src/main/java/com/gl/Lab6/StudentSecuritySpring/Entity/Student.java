package com.gl.Lab6.StudentSecuritySpring.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Entity
@Table(name ="Students")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Students")
    
	private int id;

	private String name;

	private String dept;

	private String country;
	
	
	
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public Student() {
		super();
	}

	

public Student(String name, String dept, String country) {
	super();
	this.name = name;
	this.dept = dept;
	this.country = country;
}


}
