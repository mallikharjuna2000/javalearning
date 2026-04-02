package com.codegnan;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int n = scanner.nextInt();//153
		int originalNumber=n;//153
		int numDigits=0;
		
		while(n!=0) {//15
			n/=10;//1/10-->0
			numDigits++;//3
		}
		n=originalNumber;//153
		int temp=n;//153
		int sum=0;
		while(temp!=0) {//15
			int digit=temp%10;//1%10===>1
			sum=(int) (sum+Math.pow(digit,numDigits));//27+125-->152+1-->153
			temp/=10;//1/10-->15/10-->0.10
		}
		if(sum==originalNumber) {//153==153
			System.out.println(originalNumber+" is an Armstrong Number ");
		}else {
			System.out.println(originalNumber+" is not an Armstrong Number ");
		}
		scanner.close();
	}

}
