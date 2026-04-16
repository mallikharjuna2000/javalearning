package com.codegnan.oopprogramming;

public class Triangle extends Figure {

	public Triangle(double dim1, double dim2) {
		super(dim1, dim2);
		// TODO Auto-generated constructor stub
	}

	public double area() {
		System.out.println("Inside Area for Triangle");
		return (dim1 * dim2) / 2;
	}
}
