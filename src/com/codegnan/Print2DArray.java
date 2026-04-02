package com.codegnan;

import java.util.Scanner;

public class Print2DArray {

	public static void main(String[] args) {
		/*int[][] numbers = { { 1, 2, 3 }, { 5, 30, 6 }, { 7, 8 } };
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("Printing 2d array elements using enhanced for loop");
		for(int[] num:numbers) {
			for(int x:num) {
				System.out.print(x+" ");
			}
			System.out.println();
		}*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows=sc.nextInt();//2
		int[][]numbers=new int[rows][];//int[][] numbers=new int[2][];
		
		for(int i=0;i<rows;i++) {//0<2
			System.out.println("Enter number of elements in row : "+i+" : ");
			int cols=sc.nextInt();//3
			numbers[i]=new int[cols];//numbers[0]=new int[3];
			
			System.out.println("Enter elements for row "+i+": ");
			for(int j=0;j<cols;j++) {//0<3
				numbers[i][j]=sc.nextInt();//[0][0]=50 60 70
				//[1][0]= 1000
			}
		}
		int sum=0;
		System.out.println("Printing 2d array elements using enhanced for loop");
		for(int[] num:numbers) {
			for(int x:num) {
				sum+=x;
			}
			
		}
		System.out.println("sum of elements in array : "+sum);
		sc.close();
	}

}
