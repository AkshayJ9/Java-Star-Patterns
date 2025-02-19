// Pattern 23 : Palindromic Number Pyramid
// Print the Palindromic Number Pyramid with n rows.
/*
eg.
Enter the number :5
    1
   2 1 2 
  3 2 1 2 3
 4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5

*/

import java.util.Scanner;

public class TwentyThree {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = Input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        Input.close();

    }
}
