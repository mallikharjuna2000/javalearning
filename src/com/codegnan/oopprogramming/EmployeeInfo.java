package com.codegnan.oopprogramming;

import java.util.Scanner;

public class EmployeeInfo extends Employee {
	double salaryPerYear;

	public EmployeeInfo() {
		super("","",0);
		// TODO Auto-generated constructor stub
	}

	public void inputDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Employee Name : ");
		name = scanner.nextLine();
		System.out.print("Enter Employee Designation ");
		designation = scanner.nextLine();
		System.out.print("Enter Years oF Experieencee :  ");
		yearsOfExperience = scanner.nextInt();
		System.out.print("Enter Salary Per Year  :  ");
		salaryPerYear = scanner.nextDouble();
		scanner.close();
	}

	public void displayEmployeeInfo() {
		System.out.println("EmployeeName : " + name);
		System.out.println("Employee Designation : " + designation);
		System.out.println("YearsOfExpeerience  : " + yearsOfExperience + " yeears");
	}

	public void calculateSalary() {
		double salary = yearsOfExperience * salaryPerYear;
		System.out.println("Salary : " + salary);
	}
}