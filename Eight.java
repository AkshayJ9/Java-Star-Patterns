// Pattern: 8 Fibonacci Triangle
// Print a Triangle Pattern of Fibonacci Series upto n terms  
/* eg: Enter the number :5
 1 
 1 2
 3 5 8
 13 21 34 55
 89 144 233 377 610
 987 1597 2584 4181 6765 10946
 */

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner Input = new Scanner(System.in);
        // Display message
        System.out.print("Enter the number :");
        // Read user input
        int n = Input.nextInt();
        int a = 1, b = 1, c;
        // Loop through the numbers
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                c = a + b;
                a = b;
                b = c;

            }
            System.out.println();
        }
        Input.close();

    }
}

// Fibonacci Series

// import java.util.Scanner; // Importing Scanner class from java.util package

// public class Eight {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number of terms: ");
// int n = sc.nextInt();
// int a = 0, b = 1;

// System.out.print("Fibonacci Series: " + a + " " + b);
// for (int i = 2; i < n; i++) {
// System.out.print(" " + (a + b));
// b = a + b;
// a = b - a;
// }

// }
// }