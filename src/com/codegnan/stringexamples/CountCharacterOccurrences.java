package com.codegnan.stringexamples;

public class CountCharacterOccurrences {
	   public static int countOccurrences(String str, char c) {
	       // 1. Initialize a counter to keep track of occurrences
	       int count = 0;
	       // 2. Iterate through each character in the string
	       for (int i = 0; i < str.length(); i++) {
	           // 3. Check if the current character matches the target character
	           if (str.charAt(i) == c) {
	               // 4. If a match is found, increment the count
	               count++;
	           }
	       }
	       // 5. Return the total count of occurrences
	       return count;
	   }
	   public static void main(String[] args) {
	       // 6. Define the input string and the target character
	       String inputString = "hello world";
	       char targetChar = 'l';
	       // 7. Call the countOccurrences method to get the result
	       int occurrences = countOccurrences(inputString, targetChar);
	       // 8. Print the result to the console
	       System.out.println("Occurrences of '" + targetChar + "' in '" + inputString + "': " + occurrences);
	   }
	}

