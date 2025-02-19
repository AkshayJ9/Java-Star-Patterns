// Pattern : Right aligned Star Pattern 
// Print the Right-aligned Triangle of star with 'n' rows. 
/*
Enter the number : 5 
     *
    **
   ***
  ****
 *****
*/

import java.util.Scanner;

public class Eighteen {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = Input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        Input.close();
    }
}
