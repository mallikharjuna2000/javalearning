package com.codegnan.oopprogramming;

public class SimplePasswordChecker implements PasswordChecker {

	@Override
	public String checkLength(String password) {
		return "Length : " + password.length();
	}

	@Override
	public String checkComplexity(String password) {
		if (password.length() < 8) {
			return "weak";
		} else {
			if (password.length() == 8) {
				return "Medium";
			} else {
				return "strong";
			}
		}

	}

}
