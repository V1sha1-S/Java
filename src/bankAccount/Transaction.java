package bankAccount;

abstract class Transaction {
    abstract double deposit(int amt);

    abstract double withdraw(int amt);
}
