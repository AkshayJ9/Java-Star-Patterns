// Pattern 2 : Inverted Right-Angled Triangle
// Print an Inverted Right-Angled Triangle of stars with n rows 

import java.util.Scanner;

public class Two {

    public static void main(String args[]) {

        // Input object is created here
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = Input.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        Input.close();

    }
}
