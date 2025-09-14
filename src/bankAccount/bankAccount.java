package bankAccount;

public class bankAccount {
    private String Name;
    private String acNum;
    double balance;

    bankAccount() {
        this.Name = "N/A";
        this.acNum = "N/A";
        this.balance = -1;
    }

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

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void display() {
        System.out.println("Name: " + this.Name + " Account Number: " + this.acNum + " Balance: " + this.balance);
    }
}
