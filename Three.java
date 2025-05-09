
// Pattern 3 : Pyramid Pattern
// Print a Pyramid of Star with n rows

/*
     *
    ***
   *****
  *******

*/
import java.util.Scanner;

public class Three {

    public static void main(String[] args) {

        // Taking inputs from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                // System.out.print(" * " + k);
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
