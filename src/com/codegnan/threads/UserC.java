package com.codegnan.threads;

public class UserC implements Runnable {
	BankAccount account;

	public UserC(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		account.withdraw(Thread.currentThread().getName(), 5000);

	}

}
