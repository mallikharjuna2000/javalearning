package com.codegnan.stringexamples;

public class RemoveDuplicates {

	public static void main(String[] args) {
		   // Input string
	       String str = "programming world";
	       // This will store the final result (without duplicates)
	       String result = "";
	       // Step 1: Traverse each character of the original string
	       for (int i = 0; i < str.length(); i++) {
	           // Get current character from string
	           char ch = str.charAt(i);
	           // This flag checks whether character already exists in result
	           boolean found = false;
	           // Step 2: Check if current character is already present in result
	           for (int j = 0; j < result.length(); j++) {
	               // Compare current character with characters in result
	               if (ch == result.charAt(j)) {
	                   found = true; // character already exists
	                   break;        // no need to check further
	               }
	           }
	           // Step 3: If character is NOT found in result, add it
	           if (!found) {
	               result = result + ch; // append character
	           }
	       }
	       // Step 4: Print final result (duplicates removed)
	       System.out.println("Result: " + result);


	}

}
