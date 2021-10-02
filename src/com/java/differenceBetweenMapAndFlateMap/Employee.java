package com.java.differenceBetweenMapAndFlateMap;

import java.util.List;

public class Employee {
	
	String name;
	String email;
	List<Integer> phoneNumber;
	public Employee(String name, String email, List<Integer> phoneNumber) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Integer> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(List<Integer> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}
	

}
