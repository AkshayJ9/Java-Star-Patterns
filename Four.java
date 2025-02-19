// Pattern 4 : Diamond Pattern
// Print a Diamond pattern with n rows (where n is the height of the upper half)

// example
/* Enter the number :5
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    * 
*/

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        // taking input
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = Input.nextInt();

        // Upper Half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                // System.out.print(k);
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                // System.out.print(k);
                System.err.print("*");
            }
            System.out.println();
        }

        Input.close();

    }

}
