package com.codegnan.stringexamples;

public class VowelConsonantCount {
	   public static void main(String[] args) {
	       // Input string
	       String str = "JavaProgramming";
	       // Call method to count vowels and consonants
	       countVowelsAndConsonants(str);
	   }
	   // Method to count vowels and consonants
	   public static void countVowelsAndConsonants(String str) {
	       int vowels = 0;
	       int consonants = 0;
	       // Step 1: Traverse each character in string
	       for (int i = 0; i < str.length(); i++) {
	           char ch = str.charAt(i);
	           // Step 2: Check if character is an alphabet
	           if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
	               // Step 3: Check if character is a vowel
	               if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
	                   ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                   vowels++; // increase vowel count
	               } else {
	                   consonants++; // otherwise it is a consonant
	               }
	           }
	       }
	       // Step 4: Print results
	       System.out.println("Vowels: " + vowels);
	       System.out.println("Consonants: " + consonants);
	   }
	}
