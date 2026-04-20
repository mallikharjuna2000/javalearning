package com.codegnan.oopprogramming;

public class VechileApp {

	public static void main(String[] args) {
		//Fortuner f=new Fortuner();
		//Slavia f=new Slavia();
		//Car f=new Fortuner();
		Car f=new Slavia();
		f.accelerate(10);
		f.accelerate(30);
		f.accelerate(70);
		f.accelerate(50);
		f.accelerate(20);
		f.turnDirection("right");
		f.accelerate(60);
		f.accelerate(30);
		f.turnDirection("left");
		f.stop();
		

	}

}
