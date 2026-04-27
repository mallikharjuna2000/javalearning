package com.codegnan.threads;

public class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public synchronized void withdraw(String user, double amount) {
		System.out.println(user + " Trying to withdraw " + amount);
		if (balance >= amount) {
			System.out.println(user + " processing the withdrawl..amount.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance-=amount;
			System.out.println(user+" completed withdrawl Remaing balanacee "+balance);
		}else {
			System.out.println(user+" insufficient funds avilable balanace : "+balance);
		}
		System.out.println("--------------------------------");
	}
}
