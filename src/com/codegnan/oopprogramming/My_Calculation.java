package com.codegnan.oopprogramming;

public class My_Calculation extends Calculation {

	public My_Calculation(int num1, int num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

//	public int product() {
//		return num1 * num2;
//	}
	public void product() {
		int product=num1*num2;
		System.out.println(product);
	}
}
