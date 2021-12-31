package com.gl.Lab6.StudentSecuritySpring.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
	
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@ManyToMany(cascade=CascadeType.ALL,fetch =FetchType.EAGER)
	@JoinTable(
			name = "users_roles",
			joinColumns=@JoinColumn(name="user_id"),
			inverseJoinColumns = @JoinColumn(name="role_id")
			)
	private List<Role> roles = new ArrayList<Role>();
	
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		this.Id = id;
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public List<Role> getRoles() {
		// TODO Auto-generated method stub
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}


}
