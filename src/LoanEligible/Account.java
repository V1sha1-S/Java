package LoanEligible;

import Banking_exception.InsufficientBalanceException;

public abstract class Account {

    private double accountNumber;
    private double balance;

    Account(double accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double setBalance(double amount) {
        return balance -= amount;
    }

    public void deposite(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("enter the valid amount");
        }
        balance += amount;
    }

    abstract void withDraw(double amount) throws InsufficientBalanceException, IllegalArgumentException;

    interface LoanEligible {
        void EligiblityCriteria();
    }
}
