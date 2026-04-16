package com.codegnan;

public class BankAccount_01 {
	double balance;

	public BankAccount_01(double balance) {
		super();
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited Cash : " + amount);
	}

	public void deposit(double amount, String chequeNumber) {
		balance += amount;
		System.out.println("Deposited : " + amount + " via Cheque " + chequeNumber);
	}

	public void deposit(double amount, String transactionId, String bankName) {
		balance += amount;
		System.out.println("Depositeed Amount " + amount + " via Online Tranfer");
		System.out.println("Transaction Id : " + transactionId + " Bank : " + bankName);
	}
	public void showBalance() {
		System.out.println("Current Balance : "+balance);
	}

	public static void main(String[] args) {
     BankAccount_01 bc=new BankAccount_01(30000);
     bc.showBalance();
     bc.deposit(3000);
     bc.showBalance();
     bc.deposit(2000,"63654656436");
     bc.showBalance();
     bc.deposit(5000,"TX874657836", "hdfc");
     bc.showBalance();
     
	}

}
