package ru.sbrf.banking;

public class BankAccount {
    private String owner;
    private double balance;

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        if (balance < 0)
            throw new IllegalArgumentException("Balance can't be lower than 0");
        else
            this.balance = balance;
    }

    public BankAccount(String owner) {
        this.owner = owner;
        this.balance = 0D;
    }

    public boolean deposit(double amount) {
        if (amount < 0)
            return false;
        this.balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount > this.balance)
            return false;
        else
            this.balance -= amount;
        return true;
    }

    public static boolean transfer(BankAccount source, BankAccount target, double amount) {
        boolean canWithdraw = source.withdraw(amount);

        if (!canWithdraw)
            return false;
        else {
            target.balance += amount;
            return true;
        }
    }

    @Override
    public String toString() {
        return String.format("Account of %s with balance %f", owner, balance);
    }
}
