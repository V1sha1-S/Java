package LoanEligible;

import java.util.Scanner;

import Banking_exception.InsufficientBalanceException;

public class Main {
    public static void main(String[] args) {

        SavingAccount SA = new SavingAccount(41121421, 500, "SB");
        CurrentAccount CA = new CurrentAccount(64273682, 2000, "CA");

        System.out.println("Balance available in Saving account: " + SA.getBalance() + " and in Current Account: "
                + CA.getBalance());

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the amount to deposit");
            double amount = sc.nextDouble();

            SA.deposite(amount);
            CA.deposite(amount);

            System.out.println("Balance available after deposite in Saving account: " + SA.getBalance()
                    + " and in Current Account: "
                    + CA.getBalance());

            SA.withDraw(amount);
            SA.EligiblityCriteria();
            CA.withDraw(amount);

            System.out.println("Balance available after withdrawal in Saving account: " + SA.getBalance()
                    + " and in Current Account: "
                    + CA.getBalance());

        } catch (IllegalArgumentException e) {
            System.out.println("Input error: " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println("Business error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("System Error: " + e.getMessage());
        }
    }
}
