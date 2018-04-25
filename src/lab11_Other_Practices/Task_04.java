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


public class Task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        toBinary(scanner.nextInt());
    }

    public static int toBinary(int num) {
        if (num / 2 == 0) {
            System.out.print(1);
            return 1;
        } else {
            toBinary(num / 2);
            System.out.print(num % 2);
        }

        return 0;
    }
}
