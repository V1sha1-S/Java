package Banking_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Account acc1 = new Account(54321, 2000);
        Account acc2 = new Account(674832, 3000);
        BankService service = new BankService();

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the amount");
            Double amount = sc.nextDouble();

            service.transfer(acc1, acc2, amount);

            System.out.println("Transfer successful");
            System.out.println("Account 1 balance " + acc1.getBalance());
            System.out.println("Account 1 balance " + acc2.getBalance());

        } catch (InsufficientBalanceException e) {
            System.out.println("Business error " + e.getMessage());
        } catch (InvalidAccountException e) {
            System.out.println("Invalid account " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Input Error " + e.getMessage());
        } catch (Exception e) {
            System.out.println("System Error");
            e.printStackTrace();
        }
    }
}
