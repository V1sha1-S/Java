package Lets_Crack;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        double balance = sc.nextDouble();
        if (age >= 18 && balance >= 1000) {
            System.out.println("Age is above 18 or above and balance is greater than or equal to 1000");
        } else {
            System.out.println("age is less than 18 and balance is less than 1000");
        }
    }

}
