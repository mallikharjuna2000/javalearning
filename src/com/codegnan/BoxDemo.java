package com.codegnan;

public class BoxDemo {

	public static void main(String[] args) {
		Box b1=new Box();
		System.out.println("Height : "+b1.height);
		System.out.println("Width : "+b1.width);
		System.out.println("Depth : "+b1.depth);
		//b1.displayVolume();
		
		Box b2=new Box();
		b2.height=10.0;
		b2.width=20.0;
		b2.depth=30.0;
		//b2.displayVolume();
	}

}
