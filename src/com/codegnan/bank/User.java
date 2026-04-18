package com.codegnan.bank;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a User account in the Banking System.
 * Maintains credentials and a list of transactions in INR (₹).
 */
public class User {
    private String username;
    private String password;
    private List<Transaction> transactions;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.transactions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public boolean verifyPassword(String password) {
        return this.password.equals(password);
    }

    // Convert User to CSV format (excluding transactions)
    public String toCSV() {
        return username + "," + password;
    }

    // Parse a User from CSV format (excluding transactions)
    public static User parseUser(String csv) throws IllegalArgumentException {
        String[] parts = csv.split(",");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Invalid User CSV format: " + csv);
        }
        return new User(parts[0].trim(), parts[1].trim());
    }

    /**
     * Dynamically calculates the account balance based on transactions.
     *
     * @return the current balance in INR (₹).
     */
    public double calculateBalance() {
        return transactions.stream()
                           .mapToDouble(Transaction::getAmount)
                           .sum();
    }

    /**
     * Deposits a specified amount into the account.
     *
     * @param amount the amount to deposit in INR (₹).
     */
    public void deposit(double amount) {
        transactions.add(new Transaction(amount, "Deposit", null));
    }

    /**
     * Withdraws a specified amount from the account if balance permits.
     *
     * @param amount the amount to withdraw in INR (₹).
     * @throws IllegalArgumentException if the balance is insufficient.
     */
    public void withdraw(double amount) throws IllegalArgumentException {
        if (amount > calculateBalance()) {
            throw new IllegalArgumentException("Insufficient balance.");
        }
        transactions.add(new Transaction(-amount, "Withdrawal", null));
    }

    /**
     * Transfers a specified amount to another user if balance permits.
     *
     * @param amount    the amount to transfer in INR (₹).
     * @param recipient the recipient user.
     * @throws IllegalArgumentException if the balance is insufficient.
     */
    public void transfer(double amount, User recipient) throws IllegalArgumentException {
        if (amount > calculateBalance()) {
            throw new IllegalArgumentException("Insufficient balance for transfer.");
        }
        transactions.add(new Transaction(-amount, "Transfer", "To " + recipient.getUsername()));
        recipient.deposit(amount);
        recipient.addTransaction(new Transaction(amount, "Transfer", "From " + username));
    }

    private void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    /**
     * Saves the user's transactions to a file named <username>_transactions.csv.
     */
    public void saveTransactions() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(username + "_transactions.csv"))) {
            for (Transaction transaction : transactions) {
                writer.write(transaction.toCSV());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving transactions for " + username + ": " + e.getMessage());
        }
    }

    /**
     * Loads the user's transactions from a file named <username>_transactions.csv.
     */
    public void loadTransactions() {
        try (BufferedReader reader = new BufferedReader(new FileReader(username + "_transactions.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                transactions.add(Transaction.parseTransaction(line));
            }
        } catch (FileNotFoundException e) {
            System.out.println("No existing transactions found for " + username + ". Starting fresh.");
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("Error loading transactions for " + username + ": " + e.getMessage());
        }
    }

    /**
     * Prints the account statement, showing all transactions and the current balance.
     */
    public void printStatement() {
        System.out.println("\nAccount Statement for " + username + ":");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
        System.out.println("Current Balance: ₹" + calculateBalance());
    }
}
