package Lets_Crack;

import java.util.InputMismatchException;
import java.util.Scanner;

class Account {
    private double balance;
    private int AccountNumber;

    Account(double balance, int AccountNumber) {
        this.balance = balance;
        this.AccountNumber = AccountNumber;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Enter a valid amount");
        } else {
            balance += amount;
        }
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount <= 0) {
            System.out.println("Enter a valid amount");
        } else {
            balance -= withdrawAmount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int accNo) {
        AccountNumber = accNo;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

}

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accNo = 0;

        System.out.println("Enter the amount");
        double amount = sc.nextDouble();
        while (true) {
            try {
                System.out.println("Enter the Account Number");
                accNo = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Enter the valid account number ");
                sc.next();
            }
        }
        System.out.println("Enter the amount to be withdraw");
        double withdrawAmount = sc.nextDouble();

        Account account = new Account(0, accNo);
        account.deposit(amount);
        System.out.println(
                "Amount deposited to the " + account.getAccountNumber() + " total balance: " + account.getBalance());

        System.out.println("Total balance after deposit: " + account.getBalance());

        account.withdraw(withdrawAmount);
        System.out.println("Balance after withdrawal: " + account.getBalance());

    }
}
