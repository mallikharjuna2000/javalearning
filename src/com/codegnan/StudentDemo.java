package com.codegnan;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		
		int[] marks= {95,98,100};
		Student s2=new Student("arjun",101,marks);
		Student s3=new Student("arjun1",111,marks);
		
		System.out.println("Student1 Details");
		s1.displayStudentDetails();
		System.out.println("Total Marks : "+s1.total());
		System.out.println("Average Marks : "+s1.calculateAverage());
		
		System.out.println("Student2 Details");
		s2.displayStudentDetails();
		System.out.println("Total Marks : "+s2.total());
		System.out.println("Average Marks : "+s2.calculateAverage());
	}

}
