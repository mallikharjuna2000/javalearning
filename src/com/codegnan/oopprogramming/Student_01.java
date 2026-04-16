package com.codegnan.oopprogramming;

import java.util.Objects;

public class Student_01 {
	String name;
	int rollNo;

	public Student_01(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	
	@Override
	public String toString() {
		return "Student_01 [name=" + name + ", rollNo=" + rollNo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rollNo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student_01 other = (Student_01) obj;
		return Objects.equals(name, other.name) && rollNo == other.rollNo;
	}


	public static void main(String[] args) {
		Student_01 s1 = new Student_01("sai", 101);
		Student_01 s2 = new Student_01("suma", 102);
		Student_01 s3 = new Student_01("sai", 101);
		System.out.println(s1.equals(s2));//f
		System.out.println(s1.equals(s3));//t
		System.out.println(s2.equals(s3));//f
	}

}
