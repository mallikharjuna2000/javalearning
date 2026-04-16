package com.codegnan.oopprogramming;

public class ShapeCalculator {
	
	
	public static void main(String[] args) {
		 int x=10;
		x=20;
		Shape cubeInstance = new Cube();
		cubeInstance.calculateVolume();
		Shape cuboidInstance = new Cuboid();
		cuboidInstance.calculateVolume();
	}
}
