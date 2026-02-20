package ATM_Service;

import Banking_exception.InsufficientBalanceException;
import Banking_exception.InvalidAccountException;

public class ATMService {
    public void transfer(Account from, Account to, double amount)
            throws InsufficientBalanceException, InvalidAccountException {
        if (from == null || to == null) {
            throw new InvalidAccountException("Enter valid account number");
        }
        from.withdraw(amount);
        to.deposit(amount);
    }
}
