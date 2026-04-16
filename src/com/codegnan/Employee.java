package com.codegnan;

public class Employee {
	private int employeeId;
	private String name;
	private double salary;
	public Employee(int employeeId, String name, double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary>0) {
		this.salary = salary;
		}else {
			System.out.println("Salary Must be positive ");
		}
	}
	public void displayDetails() {
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Salary : "+salary);
	}
	
}
