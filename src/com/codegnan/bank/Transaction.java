package com.codegnan.bank;

/**
 * Represents a single financial transaction in INR (₹).
 * Includes details of amount, type, and additional notes like recipient.
 */
public class Transaction {
    private double amount;
    private String type; // Deposit, Withdrawal, Transfer
    private String details; // Additional info like recipient username

    public Transaction(double amount, String type, String details) {
        this.amount = amount;
        this.type = type;
        this.details = details;
    }

    // Convert Transaction to CSV format
    public String toCSV() {
        return amount + "," + type + "," + (details != null ? details : "");
    }

    // Parse a Transaction from CSV format
    public static Transaction parseTransaction(String csv) throws IllegalArgumentException {
        String[] parts = csv.split(",");
        if (parts.length < 2) {
            throw new IllegalArgumentException("Invalid Transaction CSV format: " + csv);
        }
        double amount;
        try {
            amount = Double.parseDouble(parts[0].trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid amount in Transaction CSV: " + parts[0]);
        }
        String type = parts[1].trim();
        String details = parts.length > 2 ? parts[2].trim() : null;

        return new Transaction(amount, type, details);
    }

    @Override
    public String toString() {
        return type + ": ₹" + amount + (details != null ? " (" + details + ")" : "");
    }

    public double getAmount() {
        return amount;
    }
}

