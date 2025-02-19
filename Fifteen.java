// Pattern : Hollow Square Pattern
// Print the Hollow square pattern of star with n rows and n columns

/* 
Enter the number :5
 *  *  *  *  *
 *           *
 *           *
 *           *
 *  *  *  *  *
*/

import java.util.Scanner;

public class Fifteen {
    public static void main(String[] args) {
        // Scanner Object of user Input
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = Input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }

            System.out.println();
        }
    }
}
