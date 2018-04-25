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


public class Task_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your m:");
        int m = scanner.nextInt();

        System.out.println("Enter your n:");
        int n = scanner.nextInt();
        System.out.println(powerD(m, n));
    }


    public static int powerD(int m, int n) {
        // n = n / 2;
        if (n == 0)
            return 1;
        else {
            if (n % 2 == 0) {
                return powerD(m, n / 2) * powerD(m, n / 2);
            } else {
                return powerD(m, n / 2) * powerD(m, n / 2) * m;
            }
        }
    }
}
