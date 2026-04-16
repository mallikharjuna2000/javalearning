package com.codegnan.oopprogramming;

public class ContarctEmployee extends Employe {
	public ContarctEmployee(String name, double contractAmount) {
		super(name);
		// TODO Auto-generated constructor stub
		this.contractAmount = contractAmount;
	}

	double contractAmount;

	@Override
	public double calculateSalary() {

		return contractAmount;
	}
}
