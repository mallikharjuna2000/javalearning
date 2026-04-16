package com.codegnan.oopprogramming;

import java.util.Scanner;

public class Cube extends Shape {
	public void calculateVolume() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Side of the Cube : ");
		double side = scanner.nextDouble();
		double volume = side * side * side;
		System.out.printf("Volume of Cube : %.2f\n", volume);
		

	}
}
