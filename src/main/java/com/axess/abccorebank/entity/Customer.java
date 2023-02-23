package com.axess.abccorebank.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private long id;
	
	private String name;
		
	private int age;
	
	private String gender;
	
	private double creditScore;
	
	public Customer() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(double creditScore) {
		this.creditScore = creditScore;
	}
	
	

	
	
}

