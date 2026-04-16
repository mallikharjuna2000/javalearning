package com.codegnan.oopprogramming;

public class PartTimeEmployee extends Employe {
	double hourlyRate;
	int hoursWorked;

	public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
		super(name);
		// TODO Auto-generated constructor stub
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double calculateSalary() {
		return hoursWorked * hourlyRate;
	}

}
