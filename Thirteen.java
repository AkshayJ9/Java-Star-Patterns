// Pattern 13 : Hollow Dimand Pattern
// Print the hollow diamand pattern with n rows (for upper half )
/*
Enter the number :5
    *
   * *
  *   *
 *     *
*       *
*       *
 *     *
  *   *
   * *
    *
*/

import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner Input = new Scanner(System.in);
        // Display message
        System.out.print("Enter the number :");
        // Read user input
        int n = Input.nextInt();

        // Upper Half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 1) {
                for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower Half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 1) {
                for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
