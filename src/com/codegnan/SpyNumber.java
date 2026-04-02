package com.codegnan;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=scanner.nextInt();//123
		int originalNumber=num;//123
		int sum=0;
		int product=1;
		while(num!=0) {//1!=0
			int digit=num%10;//12%10->1
			sum+=digit;//0+3->3+2->5+1->6
			product*=digit;//3*2->6*1=6
			num/=10;//12/10->1
		}
		if(sum==product) {
			System.out.println(originalNumber+" is a Spy Number");
		}else {
			System.out.println(originalNumber+" is not a Spy Number");
		}
		scanner.close();
	}
}
/*
 * iteration -1
 * num=153 --> 
 */
