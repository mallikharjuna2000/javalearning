package com.codegnan.oopprogramming;

public class FindAreas {

	public static void main(String[] args) {
	   Figure f=new Figure(10,10);
      /* f.area();
       Rectangle r=new Rectangle(9,4);
       System.out.println(r.area());
       Triangle t=new Triangle(10,8);
       System.out.println(t.area());*/
       
	   
	   //dynamic method dispatch
	   f=new Rectangle(5,5);
	   System.out.println(f.area());
	   f=new Triangle(10,5);
	   System.out.println(f.area());
	}

}
