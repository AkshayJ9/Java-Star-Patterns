
// Pattern 6 : Print Number Pyramid
// Print Pyramid of a number where each row has incremental numbers starting from 1

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {

        // Taking Input
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = Input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" " + k);
            }
            System.out.println();
        }
        Input.close();
    }
}

/*
 * What it does:
 * Prints spaces before the numbers in each row to align them as a pyramid.
 * int j = 1: Starts from the first space in the current row.
 * j <= n - i:
 * The number of spaces decreases as the row number (i) increases.
 * For example:
 * If n = 5 and i = 1, n - i = 4 spaces are printed.
 * If i = 2, n - i = 3 spaces are printed.
 * System.out.print(" "):
 * Prints a single space without moving to the next line.
 * 
 * What it does:
 * Prints numbers in each row, starting from 1 up to the current row number (i).
 * int k = 1: Starts with the number 1.
 * k <= i:
 * The number of numbers printed in each row equals the row number.
 * For example:
 * In row 1, 1 is printed.
 * In row 2, 1 2 is printed.
 * In row 3, 1 2 3 is printed.
 * System.out.print(" " + k):
 * Prints the current number (k) with a leading space for proper alignment.
 * 
 * 
 */