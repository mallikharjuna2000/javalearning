package com.codegnan.stringexamples;

public class VowelConsonant {
	   public static void main(String[] args) {
	       // Input string
	       String str = "JavaProgramming";
	       // Call method
	       printVowelsAndConsonants(str);
	   }
	   // Method to print vowels and consonants
	   public static void printVowelsAndConsonants(String str) {
	       // Strings to store vowels and consonants
	       String vowels = "";
	       String consonants = "";
	       // Step 1: Traverse each character in the string
	       for (int i = 0; i < str.length(); i++) {
	           char ch = str.charAt(i);
	           // Step 2: Check if character is alphabet
	           if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
	               // Step 3: Check if vowel
	               if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
	                   ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                   // Add to vowels string
	                   vowels = vowels + ch;
	               } else {
	                   // Otherwise it is consonant
	                   consonants = consonants + ch;
	               }
	           }
	       }
	       // Step 4: Print results
	       System.out.println("Vowels: " + vowels);
	       System.out.println("Consonants: " + consonants);
	   }
	}

