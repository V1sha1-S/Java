package bankAccount;

public class Main {
    public static void main(String[] args) {
        Bank acc1 = new Bank(66277328, "Vishal", 10002.12);

        System.out.println(
                "Account Number: " + acc1.getAccNum() + " Name: " + acc1.getName() + " Balance: " + acc1.getBalance());

        acc1.setBalance(1000);
        System.out.println(
                "Account Number: " + acc1.getAccNum() + " Name: " + acc1.getName() + " Balance: " + acc1.getBalance());

    }
}
