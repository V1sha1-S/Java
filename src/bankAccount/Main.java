package bankAccount;

public class Main {
    public static void main(String[] args) {
        bankAccount b1 = new bankAccount();
        b1.display();

        savingAcount s1 = new savingAcount("vishal", "66152521", 10000, 10);
        s1.display();
    }
}
