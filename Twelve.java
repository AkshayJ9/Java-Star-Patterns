// Pattern 12 : Butterfly Pattern
// Print the Butterfly Pattern

/*
 Enter the number :4
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *

*/
public class Twelve {

    public static void main(String[] args) {
        // Create a Scanner object
        java.util.Scanner Input = new java.util.Scanner(System.in);
        // Display message
        System.out.print("Enter the number :");
        // Read user input
        int n = Input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) { 
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
