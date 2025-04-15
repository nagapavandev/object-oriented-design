package org.oops.java;

public class EncapsulationRealWorld {
	private static class BankAccount {
	    private String accountHolder;
	    private double balance;

	    // Constructor
	    public BankAccount(String accountHolder, double initialBalance) {
	        this.accountHolder = accountHolder;
	        if (initialBalance >= 0) {
	            this.balance = initialBalance;
	        } else {
	            System.out.println("Initial balance cannot be negative.");
	        }
	    }

	    // Getter method
	    public double getBalance() {
	        return balance;
	    }

	    // Setter method (Deposit)
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: $" + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    // Setter method (Withdraw)
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: $" + amount);
	        } else {
	            System.out.println("Invalid withdrawal amount or insufficient funds.");
	        }
	    }
	}
	    public static void main(String[] args) {
	        BankAccount account = new BankAccount("John Doe", 1000);
	        account.deposit(500);
	        account.withdraw(200);
	        System.out.println("Remaining Balance: $" + account.getBalance());
	    }
}
