package Bank;

public class Bank {
    int acNum;
    String name;
    double balance;

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        if (balance > amt) {
            balance -= amt;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
