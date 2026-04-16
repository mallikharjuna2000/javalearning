package com.codegnan.oopprogramming;

public class PostGraduateStudent extends Student{
	public void calculateGrade() {
		super.calculateGrade();
		double marks = getMarks();
		if (marks >= 80) {
			System.out.println("PG Student Grade : Distinction");
		} else {
			if (marks >= 65) {
				System.out.println("PG Student Grade : First Class");
			} else {
				System.out.println("PG Student Grade : Pass");
			}
		}
	}
}
