package lab11_Other_Practices;

/**
 * #
 * # ==============================================================================
 * # project name    : Data Structures in Java
 * # author          : Sajjad Ahmed Niloy
 * # date            : 02-May-2016
 * # license         : none
 * # ==============================================================================
 * #
 */

import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your m:");
        int m = scanner.nextInt();

        System.out.println("Enter your n:");
        int n = scanner.nextInt();
        System.out.println(power(m, n));
    }


    public static int power(int m, int n) {
        if (n == 0)
            return 1;
        else {
            return m * power(m, --n);
        }
    }

}
