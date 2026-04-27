package com.codegnan.threads;

public class UserB implements Runnable {
	BankAccount account;

	public UserB(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		account.withdraw(Thread.currentThread().getName(), 4000);

	}

}