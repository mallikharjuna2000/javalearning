package com.codegnan;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "arun", 30000);
		emp.displayDetails();
		emp.setName("mallikharjuna");
		emp.setSalary(3000);
		System.out.println("updated Employee Details");
		emp.displayDetails();
	}

}
