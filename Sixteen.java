
// Pattern : 16 
// Print the hollow box in stars and in that any letter
/*
Enter the number :5 
Enter the letter :A
 *  *  *  *  *
 *           *
 *     A     * 
 *           *
 *  *  *  *  *

 */
import java.util.Scanner;

public class Sixteen {
    public static void main(String[] args) {
        // Scanner object of user input
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = Input.nextInt();

        // For Character Input
        System.out.print("Enter the letter :");
        char letter = Input.next().charAt(0);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(" * ");

                    // Center the character position
                } else if (i == (n + 1) / 2 && j == (n + 1) / 2) {
                    System.out.print(" " + letter + " ");
                }

                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        Input.close();
    }
}
