
// Print Right angle Triangle of stars with n rows

// Example : for n = 5;

/*

*
**
***
****
*****

*/

import java.util.Scanner;

public class One {
    public static void main(String args[]) {

        // Taking User Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Row :");
        int n = input.nextInt();

        // Main Logic To Print Star Pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(" * ");
            }
            System.out.println();
        }
        input.close();
    }
}