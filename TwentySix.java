// Pattern : Hollow Rhombus
// Print the Hollow Rhombus with n rows
/*
Enter the Number :5
    *****
   *   *
  *   *
 *   *
*****
*/

import java.util.Scanner;

public class TwentySix {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = Input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {

                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        Input.close();
    }
}
