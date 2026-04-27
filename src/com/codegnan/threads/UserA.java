package com.codegnan.threads;

public class UserA implements Runnable {
	BankAccount account;

	public UserA(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		account.withdraw(Thread.currentThread().getName(), 7000);

	}

}
