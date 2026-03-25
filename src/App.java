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

        // Inverted triangle
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n - i; j++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }

        // number triangle
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }

        // System.out.println();
        // }

        // Alphabet triangle
        // for (int i = 1; i <= n; i++) {
        // char ch = 'A';
        // for (int j = 1; j <= i; j++) {
        // System.out.print(ch);
        // ch++;
        // }
        // System.out.println();
        // }

        // Mirrored right angled triangle
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Pyramid
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= 2 * i - 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // inverted pyramid
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i + 1; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= 2 * (n - i) + 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (j == 1 || i == 1 || i == n || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }
}
