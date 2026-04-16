package com.codegnan.oopprogramming;

public class FullTimeEmployee extends Employe {
	double monthlySalary;

	public FullTimeEmployee(double monthlySalary, String name) {
		super(name);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double calculateSalary() {
		return monthlySalary;
	}

}
