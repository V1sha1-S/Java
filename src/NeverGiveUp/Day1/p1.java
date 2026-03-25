package NeverGiveUp.Day1;

import java.util.Scanner;

public class p1 {
    // public static void squarePattern(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // public static void rightTrianglePattern(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // public static void invertedTrianglePattern(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= 2 * (i - 1); j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= 2 * (n - i) + 1; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // public static void trianglePattern(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= 2 * (n - i); j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= (2 * i) - 1; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    public static void pyramidPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (n - i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // System.out.println("Square pattern");
        // squarePattern(n);
        // System.out.println("Right Triangle pattern");
        // rightTrianglePattern(n);

        // invertedTrianglePattern(n);
        // trianglePattern(n);

        pyramidPattern(n);
    }
}
