package com.codegnan;

public class Box {
	double height;
	double width;
	double depth;

	public Box(double w, double h, double d) {
		width = w;
		depth = d;
		height = h;
	}

	public Box() {
		width = -1;
		depth = -1;
		height = -1;
	}

	Box(double len) {
		width = depth = height = len;
	}

	public double volume() {
		return height * depth * width;
	}

	public static void main(String[] args) {
     // Box mybox1=new Box(10,20,15);
		// Box mybox1=new Box();
		 Box mybox1=new Box(10);
		 System.out.println("box1 volume : "+mybox1.volume());
      
	}
}
