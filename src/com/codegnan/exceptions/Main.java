package com.codegnan.exceptions;

public class Main {
	

	
	public static void main(String[] args) throws InterruptedException {
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			throw new NullPointerException();
		}
	}

}
