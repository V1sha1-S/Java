import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Pyramid
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n - i; j++) {
        // System.err.print(" ");
        // }
        // for (int j = 0; j < i + 1; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Square
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // right angle
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < i + 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n - i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n - i; j++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

    }
}
