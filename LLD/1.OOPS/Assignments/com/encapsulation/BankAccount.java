package com.encapsulation;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccount(String accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Balance should be a negative value!");
        } else {
            this.balance = balance;
        }

    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String toString() {
        return "AccountNumber: " + accountNumber + " AccountHolderName: " + accountHolderName + " Balance: " + balance;
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("123456789", 9258000, "Faiz");
        System.out.println(myAccount);
        System.out.println(myAccount.getBalance());
        myAccount.setBalance(145625);
        System.out.println(myAccount.getBalance());
        myAccount.setBalance(-125);
    }
}
