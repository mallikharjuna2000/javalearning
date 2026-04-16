package com.codegnan;

public class Student {
	String name;
	int rollNumber;
	int[] marks;
	
	public Student() {
		this.name="unknown";
		this.rollNumber=0;
		this.marks=new int[] {0,0,0} ;//int[] marks={0,0,0};
	}
	public Student(String name,int rollNumber,int[] marks) {
		this.name=name;
		this.rollNumber=rollNumber;
		this.marks=new int[3];
		for(int i=0;i<3;i++) {
			this.marks[i]=marks[i];
		}
	}
	
	public void displayStudentDetails() {
		System.out.println("Name : "+name);
		System.out.println("RollNumber : "+rollNumber);
		System.out.println("Marks : ");
		for(int i=0;i<marks.length;i++) {
			System.out.println("subject : "+(i+1)+" marks : "+marks[i]);
		}
	}
	public int total() {
		int total=0;
		for(int mark:marks) {
			total+=mark;
		}
		return total;
	}
	public double calculateAverage() {
		return total()/3.0;
	}
	
}
