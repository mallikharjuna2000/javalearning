package com.codegnan.oopprogramming;

public class Figure {
	double dim1;
	double dim2;

	public Figure(double dim1, double dim2) {
		super();
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	public double area() {
		System.out.println("Area for figure is undefined");
		return 0;
	}
}
