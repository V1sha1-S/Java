package ATM_Service;

import java.util.Scanner;

import Banking_exception.InsufficientBalanceException;
import Banking_exception.InvalidAccountException;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(5526712, 3000);
        Account acc2 = new Account(6621232, 2000);

        ATMService service = new ATMService();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the amount");
            double amount = sc.nextDouble();
            System.out.println("Account 1 balance before transfer: " + acc1.getBalance());
            System.out.println("Account 2 balance before transfer: " + acc2.getBalance());

            service.transfer(acc1, acc2, amount);

            System.out.println("Transfer Successful");
            System.out.println("Account 1 Balance: " + acc1.getBalance());
            System.out.println("Account 2 balance: " + acc2.getBalance());

        } catch (InvalidAccountException e) {
            System.out.println("Enter the valid ID");
        } catch (InsufficientBalanceException e) {
            System.out.println("Insufficient Balance");
        } catch (Exception e) {
            System.out.println("System Error");
        }
    }
}
