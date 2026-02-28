package LoanEligible;

import Banking_exception.InsufficientBalanceException;

public class CurrentAccount extends Account {
    String accountType;

    CurrentAccount(double accountNumber, double balance, String accountType) {
        super(accountNumber, balance);
        this.accountType = accountType;
    }

    @Override
    void withDraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Please enter valid amount");
        } else if (amount > getBalance()) {
            throw new InsufficientBalanceException("Insufficient balance: " + getBalance());
        }
        setBalance(amount);
    }

}
