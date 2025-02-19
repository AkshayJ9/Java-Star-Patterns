// Pattern 31 : Hollow Square with Diagonals
// Print a hollow square pattern with diagonals for n rows
/*
 eg.

*/

import java.util.Scanner;

public class ThirtyOne {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n = Input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n || i == j || j == (n - i + 1)) {
                    System.out.print("* ");

                } else {
                    System.out.print(" ");
                }
                System.out.println();

            }
            Input.close();
        }

    }
}
