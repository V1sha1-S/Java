package bankAccount;

public class Bank {
    private int accNum;
    private String Name;
    private double balance;

    Bank(int accNum, String Name, double balance) {
        this.accNum = accNum;
        this.Name = Name;
        this.balance = balance;
    }

    public int getAccNum() {
        return accNum;
    }

    public String getName() {
        return Name;
    }

    public double getBalance() {
        return balance;
    }

    public double setBalance(int amt) {
        return balance += amt;
    }
}
