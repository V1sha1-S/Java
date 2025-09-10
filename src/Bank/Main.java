package Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bank ac1 = new Bank();

        ac1.acNum = 12312312;
        ac1.name = "Vishal";
        ac1.balance = 1000;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Choice 1. Deposit, 2. Withdraw");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                ac1.deposit(500);
                System.out.println("balance: " + ac1.balance);
                break;
            case 2:
                ac1.withdraw(1550);
                System.out.println("balance: " + ac1.balance);
                break;
        }

    }
}
