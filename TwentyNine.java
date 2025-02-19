// Pattern 29 : Diamond of Numbers
// Print a diamond pattern with numbers for `n` rows.

/*
 Enter the number : 4 
   1
  2 3
 4 5 6
7 8 9 10
 7 8 9 
  4 5
   2 
 
*/

import java.util.Scanner;

public class TwentyNine {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = Input.nextInt();

        int num = 1;

        // Upper half
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }

        // Adjust `num` to the starting value for the lower half
        num -= n;

        // Lower half
        for (int i = n - 1; i >= 1; --i) {
            // Print spaces
            for (int j = 1; j <= n - i; ++j) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 1; j <= i; ++j) {
                System.out.print(num++ + " ");
            }
            // Adjust `num` for the next row
            num -= 2 * i;
            System.out.println();
        }

        Input.close();
    }
}

/*
 * Row Spaces Numbers Example_Output
 * 1 n−1 = 3 1 1
 * 
 * 
 * 
 * Upper Half:
 * Numbers are
 * printed incrementally, starting from 1,
 * with appropriate spaces for
 * alignment.Row Spaces
 * Numbers Example Output 1𝑛−1 n−1=3 1 1 2𝑛−2 n−2=2 2 3 2 3 3𝑛−3 n−3=1 4 5 6
 * 4 5 6 4𝑛−4 n−4=0 7 8 9 10 7 8 9 10
 * Lower Half:
 * Numbers are
 * printed in reverse,
 * starting from
 * the last
 * number of
 * the corresponding
 * row in
 * the upper
 * half.After each row,
 * the starting
 * number is
 * adjusted.Row Spaces
 * Numbers Adjustment
 * Example Output 3𝑛−3 n−3=1 4 5 6 num-=2*3 4 5 6 2𝑛−2 n−2=2 2 3 num-=2*2 2 3
 * 1𝑛−1 n−1=3 1 num-=2*1 1
 */