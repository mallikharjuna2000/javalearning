package com.codegnan;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=scanner.nextInt();//6
		int fact=1;
		for(int i=1;i<=number;i++) {//6<=6
			fact=fact*i;//fact=720;
		}
		System.out.println("Factoarial of a Number "+number+" is : "+fact);
		scanner.close();
	}

}
