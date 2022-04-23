package com.brentaronsen.section6OOP1;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount() {
        this("56789", 2.50, "Default name", "Default address",
                "Default phone"); //use detailed constructor with default values
        System.out.println("empty constructor called");
    }

    // major constructor - other constructors use this
    public BankAccount(String number, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
        System.out.println("bank account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this("99999", 100.55, customerName, customerEmail, customerPhoneNumber);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void depositFunds(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit of " + amount + " made. New balance: " + this.balance);
        } else {
            System.out.println("Cannot deposit a negative amount.");
        }
    }

    public void withdrawFunds(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + " processed. Remaining balance: " + this.balance);
        } else {
            if (amount <= 0) {
                System.out.println("Cannot withdraw a negative amount.");
            } else {
                System.out.println("Only " + balance + " available. Withdrawal not processed.");
            }
        }
    }

}
