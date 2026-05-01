package com.codegnan.java8;

import java.io.Serializable;

public class Student implements Serializable {
	private int id;
	private String name;
	private String email;

	public Student(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	public void displayStudentDetails() {
		System.out.println("Student Id : " + id);
		System.out.println("Student Name : " + name);
		System.out.println("Student Email : " + email);
	}

}
