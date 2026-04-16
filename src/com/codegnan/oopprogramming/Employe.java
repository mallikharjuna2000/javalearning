package com.codegnan.oopprogramming;

public abstract class Employe {
	String name;

	public Employe(String name) {
		super();
		this.name = name;
	}

	public abstract double calculateSalary();

	void display() {
		System.out.println("Employee Name : " + name);
	}
}
