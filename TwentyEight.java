// Pattern 28 : Pascal's Pattern
// Print pascals triangle with n rows. Pascals triangle is a triangular array where each number is the sum of the two numbers directly above it

import java.util.Scanner;

public class TwentyEight {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = Input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = (value * (i - j) / (j + 1));
            }
            System.out.println();

        }

        Input.close();
    }
}
