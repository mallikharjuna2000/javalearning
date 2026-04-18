package com.codegnan.bankingsystem;

import java.util.*;

/**
 * Main Banking System class to manage users, accounts, and admin operations.
 * All operations are handled in INR (₹).
 */
public class BankingSystem {
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "password";

    private Map<String, User> activeAccounts = new HashMap<>();
    private List<User> pendingAccounts = new ArrayList<>();

    public static void main(String[] args) {
        BankingSystem system = new BankingSystem();
        system.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Admin Login");
            System.out.println("2. User Login");
            System.out.println("3. New User Registration");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    adminLogin(scanner);
                    break;
                case 2:
                    userLogin(scanner);
                    break;
                case 3:
                    newUserRegistration(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the Banking System. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void adminLogin(Scanner scanner) {
        System.out.print("Enter admin username: ");
        String username = scanner.nextLine();
        System.out.print("Enter admin password: ");
        String password = scanner.nextLine();

        if (ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password)) {
            handleAdminActions(scanner);
        } else {
            System.out.println("Invalid admin credentials.");
        }
    }

    private void handleAdminActions(Scanner scanner) {
        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Approve Pending Accounts");
            System.out.println("2. View All Active Accounts");
            System.out.println("3. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    approvePendingAccounts(scanner);
                    break;
                case 2:
                    viewActiveAccounts();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void approvePendingAccounts(Scanner scanner) {
        if (pendingAccounts.isEmpty()) {
            System.out.println("No pending accounts to approve.");
            return;
        }

        System.out.println("\nPending Accounts:");
        for (int i = 0; i < pendingAccounts.size(); i++) {
            System.out.println((i + 1) + ". " + pendingAccounts.get(i).getUsername());
        }

        System.out.print("Enter the number of the account to approve (or 0 to cancel): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice > 0 && choice <= pendingAccounts.size()) {
            User user = pendingAccounts.remove(choice - 1);
            activeAccounts.put(user.getUsername(), user);
            System.out.println("Account approved for " + user.getUsername());
        } else if (choice == 0) {
            System.out.println("Approval process canceled.");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    private void viewActiveAccounts() {
        if (activeAccounts.isEmpty()) {
            System.out.println("No active accounts.");
            return;
        }

        System.out.println("\nActive Accounts:");
        for (String username : activeAccounts.keySet()) {
            System.out.println("- " + username);
        }
    }

    private void newUserRegistration(Scanner scanner) {
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        if (activeAccounts.containsKey(username)) {
            System.out.println("Username already exists. Please try again.");
        } else {
            pendingAccounts.add(new User(username, password));
            System.out.println("Registration successful. Awaiting admin approval.");
        }
    }

    private void userLogin(Scanner scanner) {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        User user = activeAccounts.get(username);
        if (user != null && user.verifyPassword(password)) {
            handleUserActions(scanner, user);
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private void handleUserActions(Scanner scanner, User user) {
        while (true) {
            System.out.println("\nUser Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. View Account Statement");
            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter deposit amount in ₹: ");
                        double depositAmount = scanner.nextDouble();
                        user.deposit(depositAmount);
                        System.out.println("Deposit successful.");
                        break;
                    case 2:
                        System.out.print("Enter withdrawal amount in ₹: ");
                        double withdrawalAmount = scanner.nextDouble();
                        user.withdraw(withdrawalAmount);
                        System.out.println("Withdrawal successful.");
                        break;
                    case 3:
                        System.out.print("Enter recipient username: ");
                        String recipientUsername = scanner.nextLine();
                        User recipient = activeAccounts.get(recipientUsername);
                        if (recipient == null) {
                            System.out.println("Recipient not found.");
                        } else {
                            System.out.print("Enter transfer amount in ₹: ");
                            double transferAmount = scanner.nextDouble();
                            user.transfer(transferAmount, recipient);
                            System.out.println("Transfer successful.");
                        }
                        break;
                    case 4:
                        user.printStatement();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

