// Pattern 25 : Solid Rhombus
// Print a solid rhombus of starts with n rows 
/*
eg.
Enter the Number :5
    *****
   *****
  *****
 *****
*****
*/

import java.util.Scanner;

public class TwentyFive {
    public static void main(String[] args) {
        // Creating Scanner Object for User Input

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = Input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {

                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        Input.close();
    }
}
