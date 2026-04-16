package com.codegnan.oopprogramming;

import java.util.Scanner;

public class MainCalculation {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		My_Calculation myCalculation=new My_Calculation(num1,num2);
		int sum=myCalculation.addition();
		
		System.out.println(sum);
		myCalculation.product();
		scanner.close();

	}

}
