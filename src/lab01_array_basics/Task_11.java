/**
 * #
 * # ==============================================================================
 * # project name    : Data Structures in Java
 * # author          : Sajjad Ahmed Niloy
 * # date            : 02-Jan-2016
 * # license         : none
 * # ==============================================================================
 * #
 */
package lab01_array_basics;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        System.out.println(allDigitsOdd(number));
    }

    public static boolean allDigitsOdd(int num) {
        int digit_count = 0;
        int odd_count = 0;
        while (num > 0) {
            int p = num % 10;
            num = num / 10;
            digit_count++;
            if (p % 2 != 0)
                odd_count++;
        }
        if (odd_count == digit_count)
            return true;
        else
            return false;
    }
}
