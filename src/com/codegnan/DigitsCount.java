package com.codegnan;

import java.util.Scanner;

public class DigitsCount {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=scanner.nextInt();//12345
		int count=0;
		int originalNumber=number;
		while(number!=0) {//1!=0
		number=number/10;//1/10==>0
		count++;//5
		}
		System.out.println("The Count of Digits in a Giveen Number"+originalNumber+" is "+count);
	scanner.close();
	}

}
