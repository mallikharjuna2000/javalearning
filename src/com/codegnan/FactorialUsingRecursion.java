package com.codegnan;

public class FactorialUsingRecursion {
	// 6 5 120
	/*
	 * public static void factorial(int i, int n, int result) { if (i > n) {//6>5
	 * System.out.println("Factorial : " + result); return; } // 6 5 120 factorial(i
	 * + 1, n, result * i); }
	 */
                                //n=1
	/*public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);//5*4*3*f(2)*fact(1)
	}*/
	
	public static int fib(int n) {
		if(n<=1) {
			return n;
		}
		return fib(n-1)+fib(n-2);
	}                          

	public static void main(String[] args) {
		for(int i=0;i<=8;i++) {//4<=8
			System.out.println(fib(i));//0 1 1  2
		}
	}

}
