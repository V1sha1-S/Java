package ATM_Service;

import Banking_exception.InsufficientBalanceException;

public class Account {
    private long accountNumber;
    private double balance;

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Enter valid amount");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Enter valid amount");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance: " + balance);
        }
        balance -= amount;

    }
}
