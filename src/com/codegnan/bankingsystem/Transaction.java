package com.codegnan.bankingsystem;

/**
 * Represents a single financial transaction in INR (₹). Includes details of
 * amount, type, and additional notes like recipient.
 */
public class Transaction {
	private double amount; // Positive for deposits, negative for withdrawals
	private String type; // Deposit, Withdrawal, Transfer
	private String details; // Additional info like recipient username

	public Transaction(double amount, String type, String details) {
		this.amount = amount;
		this.type = type;
		this.details = details;
	}

	public double getAmount() {
		return amount;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return type + ": ₹" + amount + (details != null ? " (" + details + ")" : "");
	}
}
