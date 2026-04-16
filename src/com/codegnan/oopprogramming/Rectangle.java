package com.codegnan.oopprogramming;

public class Rectangle extends Figure {

	public Rectangle(double dim1, double dim2) {
		super(dim1, dim2);
		// TODO Auto-generated constructor stub
	}

	public double area() {
		System.out.println("Inside Area for Rectangle ");
		return dim1 * dim2;
	}
}
