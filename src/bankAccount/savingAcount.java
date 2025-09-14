package bankAccount;

public class savingAcount extends bankAccount {
    private double intrestRate;

    savingAcount(String name, String acNum, double balance, double intrestRate) {
        super(name, acNum, balance);
        this.intrestRate = intrestRate;
    }

    public double getIntresetRate() {
        return intrestRate;
    }

    void display() {
        super.display();
        System.out.println("Intrest Rate: " + this.intrestRate + "%");
    }

}
