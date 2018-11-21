package com.example.demo.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("R")
public class RegistredUser extends User{

	private String password;
	private int points;
	public RegistredUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegistredUser(Long id, String nom, String email, String password, int points) {
		super(id, nom, email);
		this.password = password;
		this.points = points;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}

	
	
}
