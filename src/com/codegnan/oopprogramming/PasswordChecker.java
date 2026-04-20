package com.codegnan.oopprogramming;

public interface PasswordChecker {
	public abstract String checkLength(String password);

	public abstract String checkComplexity(String password);
}
