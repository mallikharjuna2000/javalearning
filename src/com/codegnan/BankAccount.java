package com.codegnan;

public class BankAccount {
	String accountHolderName;
	String accountNumber;
	double balance;

	public void createAccount(String name, String accNumber, double initialBalance) {
		accountHolderName = name;
		accountNumber = accNumber;
		balance = initialBalance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited Amount : " + amount);
			System.out.println("New Balance : " + balance);
		} else {
			System.out.println("Deposit Amount Must bee positive");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdraw : " + amount);
			System.out.println("new Balance : " + balance);
		} else {
			if (amount <= 0) {
				System.out.println("Withdrawl must be positive ");
			} else {
				System.out.println("Insufficient Funds ");
			}
		}
	}

	public void displayAccountDetails() {
		System.out.println("Account Holder Name : " + accountHolderName);
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Balance : " + balance);
	}
}
