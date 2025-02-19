// Pattern : 14 Zig-Zag Pattern
// Print the zig-zag pattern with n levels and columns width

import java.util.Scanner;

public class Fourteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter number of levels and columns: ");
        int n = scanner.nextInt();
        int columns = scanner.nextInt();

        // Loop through rows
        for (int i = 1; i <= n; i++) {
            // Loop through columns
            for (int j = 1; j <= columns; j++) {
                // Check zig-zag condition
                if ((i + j) % (2 * n - 2) == 0 || (j - i) % (2 * n - 2) == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next row
        }

        scanner.close(); // Close the scanner
    }
}
