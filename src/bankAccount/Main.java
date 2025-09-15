package bankAccount;

public class Main {
    public static void main(String[] args) {
        bankAccount b1 = new bankAccount("Vishal S", "99002352", 1000);
        b1.display();
        b1.Deposit(100);
        b1.display();

        savingAcount s1 = new savingAcount("vishal", "66152521", 10000, 10);
        s1.display();
    }
}
