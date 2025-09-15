package bankAccount;

abstract class Deposit {
    abstract void Deposit(double amt);
}

public class bankAccount extends Deposit {
    private String Name;
    private String acNum;
    private double balance;

    void Deposit(double amt) {
        this.balance += amt;
        // System.out.println("Deposited: " + amt + " | New Balance: " + this.balance);
    }

    // bankAccount() {
    // this.Name = "N/A";
    // this.acNum = "N/A";
    // this.balance = -1;
    // }

    bankAccount(String name, String acNum, double balance) {
        this.Name = name;
        this.acNum = acNum;
        this.balance = balance;
    }

    public String getName() {
        return Name;
    }

    public String getAcNumber() {
        return acNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double total) {
        this.balance = total;
    }

    void display() {
        System.out.println("Name: " + this.Name + " Account Number: " + this.acNum + " Balance: " + this.balance);
    }
}
