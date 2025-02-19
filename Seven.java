//  Pattern 7: Pascal's Triangle

// Problem: Print Pascal's triangle up to `n` rows.

import java.util.Scanner;

public class Seven {
    public static void main(String args[]) {

        // Input from user
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = Input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + num);
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

/*
 * Step-by-Step Explanation:
 * 
 * int num = 1;
 * for (int j = 0; j <= i; j++) {
 * System.out.print(" " + num);
 * num = num * (i - j) / (j + 1);
 * }
 * 
 * 
 * int num = 1;:
 * 
 * Initializes the first number of the row to 1.
 * In Pascal's Triangle, every row starts with 1.
 * Second Inner Loop (for (int j = 0; j <= i; j++)):
 * 
 * Controls the number of numbers printed in each row.
 * j = 0: Starts at the first column of the row.
 * j <= i:
 * Ensures that the number of numbers in the row equals the row index + 1.
 * For example:
 * Row 0 has 1 number.
 * Row 1 has 2 numbers.
 * Row 2 has 3 numbers, and so on.
 * System.out.print(" " + num):
 * 
 * Prints the current number with a space before it for proper alignment.
 * 
 * 
 * num = num * (i - j) / (j + 1);
 * 
 * This formula calculates the next number in the row using the properties of
 * Pascal's Triangle:
 * The next number is derived from the current number using:
 * num * (i - j):
 * Multiplies the current number by (i - j), where i is the current row index
 * and j is the current column index.
 * / (j + 1):
 * Divides the result by (j + 1) to get the next number.
 * 
 * 
 */