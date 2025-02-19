// Pattern : Left-Aligned Number Triangle
// Print the left aligned triangle of numbers where each row contained the row number repeated

// eg.
/*
Enter the Number :5
1
22
333
4444
55555
*/

import java.util.Scanner;

public class Seventeen {
    public static void main(String args[]) {

        // Scanner object for user input
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = Input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(i);
            }
            System.out.println();
        }

        Input.close();
    }
}
