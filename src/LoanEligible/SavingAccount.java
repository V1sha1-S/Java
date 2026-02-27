package LoanEligible;

import Banking_exception.InsufficientBalanceException;
import LoanEligible.Account.LoanEligible;

public class SavingAccount extends Account implements LoanEligible {

    String accountType;

    SavingAccount(double accountNumber, double balance, String accountType) {
        super(accountNumber, balance);
        this.accountType = accountType;
    }

    @Override
    public void withDraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Please enter valid amount");
        } else if (amount > getBalance()) {
            throw new InsufficientBalanceException("Insufficient balance: " + getBalance());
        }
        setBalance(amount);
    }

    @Override
    public void EligiblityCriteria() {
        if (accountType == "SB" && getBalance() > 1000) {
            System.out.println("You are eligible for Load");
        } else {
            System.out.println("Please have sufficient balance");
        }
    }
}
