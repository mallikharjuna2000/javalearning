package com.codegnan;

import java.util.Scanner;

public class AreaCalculator {
	public  void rectangleArea(double length, double width) {
		double area = length * width;
		System.out.println("Area of Rectanglee : " + area);
	}

	public static double circleArea(double radius) {
		return Math.PI * radius * radius;
	}

	public static void squareArea(double side) {
		double area = side * side;
		System.out.println("Area of Squaree : " + area);
	}

	// triangleArea -->0.5*base*height
	public static void triangleArea(double base, double height) {
		double area = 0.5 * base * height;
		System.out.println("Area of Triangle : " + area);
	}

	public static void trapezoidArea(double base1, double base2, double height) {
		double area = 0.5 * (base1 + base2) * height;
		System.out.println("Area of Trapezoid: " + area);
	}

	public static void parallelogramArea(double base, double height) {
		double area = base * height;
		System.out.println("Area of Parallelogram: " + area);
	}
	// TrapezoidArea-->0.5*(base1+base2)*height

	// paralleogramArea--> base*height

	public static void main(String[] args) {
//direct call
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Dimeessions for Area of Rectangle");
		System.out.println("Enter Length of Rectangle");
		double length=sc.nextDouble();
		System.out.println("Enter Width of Rectangle");
		double width=sc.nextDouble();
		AreaCalculator ac=new AreaCalculator();
		ac.rectangleArea(length,width);
		System.out.println(circleArea(4));
		// by creating object to call static method.
		
		ac.squareArea(5);
		ac.triangleArea(5, 6);
		//by using className
		AreaCalculator.trapezoidArea(10, 20, 3);
		AreaCalculator.parallelogramArea(2, 3);
	}

}
