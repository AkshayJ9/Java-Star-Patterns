// Pattern 11 : Floyd's Triangle
// Print the Floyd's Triangle using numbers from 1 to n / with n rows .

/*
 Enter the number :5
 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15 

 */

import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner Input = new Scanner(System.in);
        // Display message
        System.out.print("Enter the number :");
        // Read user input
        int n = Input.nextInt();
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + num);
                num++;
            }
            System.out.println();
        }
        Input.close();
    }
}
