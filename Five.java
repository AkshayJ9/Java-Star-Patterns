// Pattern 5 : Hollow Rectangle
// Print the Hollow rectangle of stars with given rows and columns
// example :
/*
 Enter the No of Rows :5
Enter the No of Cols :4
****
*  *
*  *
*  *
****
*/

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        // Taking input

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the No of Rows :");
        int row = Input.nextInt();
        System.out.print("Enter the No of Cols :");
        int col = Input.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }
}

/*
 * 
 * Condition (i == 1 || i == row || j == 1 || j == col):
 * 
 * i == 1: First row.
 * i == row: Last row.
 * j == 1: First column.
 * j == col: Last column.
 * If any of these conditions is true, the current position is a boundary, so we
 * print a *.
 * System.out.print(" * "):
 * 
 * Prints a star with a space around it for the boundary.
 * System.out.print(" "):
 * 
 * Prints spaces (3 spaces to match the width of the star) for the inside of the
 * rectangle.
 * 
 */