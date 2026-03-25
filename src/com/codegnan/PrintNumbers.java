package com.codegnan;

import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a NuMBER");
		int n=scanner.nextInt();//50
		for(int i=1;i<=n;i++) {
			
			if(i%2!=0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
