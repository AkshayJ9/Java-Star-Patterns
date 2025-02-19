// Pattern 10 is the reverse of Pattern 9.
// Print the Half Pyramid using numbers from 1 to n in reverse order.

/*
 Enter the number :5
 1 2 3 4 5
 1 2 3 4
 1 2 3
 1 2
 1
*/

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner Input = new Scanner(System.in);
        // Display message
        System.out.print("Enter the number :");
        // Read user input
        int n = Input.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
        Input.close();

    }
}
