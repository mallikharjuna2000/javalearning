package com.codegnan;

import java.util.Scanner;

public class Patterns_01 {

	public static void main(String[] args) {
		int rows=5,cols=5;
		/*for (int i = 0; i < rows; i++) {
			for (int j = 0; j <=i; j++) {
				// System.out.print("* ");
				// System.out.print(i+" ");
				// System.out.print((9-i)+" ");
				// System.out.print(j+" ");
				// System.out.print((9-j)+" ");
				// System.out.print((char)(97+i)+" ");
				// System.out.print((char)(106-i)+" ");
				// System.out.print((char)(97+j)+" ");
				//System.out.print((char) (106 - j) + " ");
			}
			System.out.println();
		}*/
		
		/*// inverted pyramind Pattern
		// outer for loop starts each row
		for(int i=0;i<rows;i++) {//1<5
			// inner loop to print star for each row.
			for(int j=0;j<rows-i;j++) {//j<5;
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		/*for(int i=0;i<rows;i++) {//1<5
			// inner loop to print spaces before stars
			for(int j=0;j<i;j++) {
				System.out.print("  ");
			}
			for(int k=0;k<rows-i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		//pyramid Pattern
		// outer for loop:
		/*for(int i=rows;i>=1;i--) {//2<=5
			// inner loop 1 print leading spaces and alignment
			// the number of spaces decreses as i increse
			for(int j=1;j<=rows-i;j++) {//2
				System.out.print(" ");
			}
		 // inner loop2 print the stars for the current row.
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		// squareHallowPattern
		for(int i=0;i<rows;i++) {//1<5
			for(int j=0;j<rows;j++) {//4<5
				if(i==0||j==0||i==rows-1||j==rows-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
