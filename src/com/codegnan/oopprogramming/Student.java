package com.codegnan.oopprogramming;

public class Student {
	private int studentId;
	private String name;
	private int marks;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void calculateGrade() {
		System.out.println("Calculating Grade for Student");
	}
}
