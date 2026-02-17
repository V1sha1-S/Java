package Banking_exception;

public class BankService {
    public void transfer(Account from, Account to, double amount)
            throws InsufficientBalanceException, InvalidAccountException {
        if (from == null || to == null) {
            throw new InvalidAccountException("Enter the valid account number");
        }

        from.withdraw(amount);
        to.deposit(amount);
    }
}
