package bankAccount;

public class Bank extends Transaction {
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

    public String custDetails() {
        return "Name: " + Name + " Account Number: " + accNum + " Balance: " + balance;
    }

    double deposit(int amt) {
        System.out.println("inside deposit:" + amt);
        return balance += amt;

    }

    double withdraw(int amt) {
        System.out.println("inside withdraw:" + amt);
        return balance -= amt;
    }
}
