package com.codegnan.stringexamples;

public class Frequency {
	   public static void main(String[] args) {
	       // Input string
	       String str = "hello";
	       // Call method to calculate and print frequency
	       printFrequency(str);
	   }
	   // Method to calculate and print frequency of each character
	   public static void printFrequency(String str) {
	       // Step 1: Traverse each character in the string
	       for (int i = 0; i < str.length(); i++) {
	           // Variable to count occurrences of current character
	           int count = 0;
	           // Flag to check whether character is already processed
	           boolean visited = false;
	           // Step 2: Check if this character appeared earlier
	           // If yes, skip it to avoid duplicate printing
	           for (int k = 0; k < i; k++) {
	               if (str.charAt(i) == str.charAt(k)) {
	                   visited = true; // already counted
	                   break;
	               }
	           }
	           // If already visited, skip this iteration
	           if (visited) {
	               continue;
	           }
	           // Step 3: Count how many times this character appears
	           for (int j = 0; j < str.length(); j++) {
	               if (str.charAt(i) == str.charAt(j)) {
	                   count++; // increase count
	               }
	           }
	           // Step 4: Print character and its frequency
	           System.out.println(str.charAt(i) + " : " + count);
	       }
	   }
	}

