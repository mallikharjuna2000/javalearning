package com.codegnan.stringexamples;

public class FirstNonRepeated {
	   public static void main(String[] args) {
	       // Input string
	       String str = "aabbcde";
	       // Call method to find first non-repeated character
	       findFirstNonRepeated(str);
	   }
	   // Method to find first non-repeated character
	   public static void findFirstNonRepeated(String str) {
	       // Step 1: Traverse each character
	       for (int i = 0; i < str.length(); i++) {
	           int count = 0;
	           // Step 2: Count occurrences of current character
	           for (int j = 0; j < str.length(); j++) {
	               if (str.charAt(i) == str.charAt(j)) {
	                   count++;
	               }
	           }
	           // Step 3: If count is 1 → first non-repeated character found
	           if (count == 1) {
	               System.out.println("First Non-Repeated: " + str.charAt(i));
	               break; // stop after first match
	           }
	       }
	   }
	}
