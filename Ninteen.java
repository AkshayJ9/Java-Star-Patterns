// Pattern : 19 Alternating Rectangle Pattern (0 and 1)
// Print an alternating pattern of '0' and '1' with 'n' rows and 'm' columns.

import java.util.Scanner;

public class Ninteen {
    public static void main(String[] args) {

        Scanner Input1 = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = Input1.nextInt();
        Scanner Input2 = new Scanner(System.in);
        System.out.print("Enter the number :");
        int m = Input2.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }

            System.out.println();
        }
        Input1.close();
        Input2.close();

    }
}
