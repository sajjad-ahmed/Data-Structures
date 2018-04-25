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

public class Task_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st Month/Date & 2nd Month/Date respectively");
        System.out.println(before(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }

    public static boolean before(int month1, int day1, int month2, int day2) {
        if (month1 < month2)
            return true;
        else if (month1 > month2)
            return false;
        else {
            if (day1 < day2)
                return true;
            else
                return false;
        }
    }
}
