package com.codegnan;

import java.util.Scanner;

public class MoveZeros {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Step 1: Read size
	        System.out.println("Enter the Size of Array :");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        // Step 2: Read elements
	        System.out.println("Enter Array Elements :");
	        for(int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // index keeps track of where next non-zero element should go
	        int index = 0;

	        // Step 3: Traverse array
	        for(int i = 0; i < n; i++) {

	            if(arr[i] != 0) {
	                // If element is non-zero

	                int temp = arr[i];      // store current value
	                arr[i] = arr[index];   // swap with index position
	                arr[index] = temp;

	                index++; // move index forward
	            }
	            else {
	                // If element is zero → do nothing
	                // It will automatically move to end
	            }
	        }

	        // Step 4: Print result
	        System.out.print("Modified Array : ");
	        for(int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        sc.close();
	    }
}
