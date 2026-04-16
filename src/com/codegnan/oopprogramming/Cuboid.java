package com.codegnan.oopprogramming;

import java.util.Scanner;

public class Cuboid extends Shape {
	public void calculateVolume() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Length of Cuboid : ");
		double length = scanner.nextDouble();
		System.out.println("Width of cuboid : ");
		double width = scanner.nextDouble();
		System.out.println("Height of cuboid : ");
		double height = scanner.nextDouble();
		double volume = length * width * height;
		System.out.printf("Volume of Cuboid : %.2f\n", volume);
		scanner.close();
	}
}
