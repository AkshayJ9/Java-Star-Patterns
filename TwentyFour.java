// Pattern 24 : Numeric Hollow Diamond
// Print a hollow diamond pattern with numbers on the edges.
/*
eg.

*/

import java.util.Scanner;

public class TwentyFour {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = Input.nextInt();

        // Upper half
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n - i; ++j) {
                System.out.print(" ");
            }
            System.out.print("1");
            for (int j = 1; j <= 2 * (i - 1) - 1; ++j) {
                System.out.print(" ");
            }
            if (i != 1) {
                System.out.print(i);
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; --i) {
            for (int j = 1; j <= n - i; ++j) {
                System.out.print(" ");
            }
            System.out.print("1");
            for (int j = 1; j <= 2 * (i - 1) - 1; ++j) {
                System.out.print(" ");
            }
            if (i != 1) {
                System.out.print(i);
            }
            System.out.println();
        }

        Input.close();
    }
}
