// Pattern 30 : Zig - Zag Pattern
// Print a zig zag pattern with n rows
/*
eg.

*/

import java.util.Scanner;

public class Thirty {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Row Count :");
        int r = Input.nextInt();
        Scanner Input1 = new Scanner(System.in);
        System.out.print("Enter the Column Count :");
        int c = Input1.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c - i; j++) {
                if ((i + j) % 4 == 0 || (i == 2 && j % 4 == 0)) {
                    System.out.print("*");
                } else {

                    System.out.print(" ");
                }

            }

            System.out.println();
        }

        Input.close();
    }
}
