

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

public class Task_05 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[15];
        int[] count = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number 0-9");
            array[i] = sc.nextInt();
            count[array[i]] = count[array[i]] + 1;
        }
        for (int i = 0; i < count.length; i++) {
            System.out.printf("%d was found %d times\n", i, count[i]);
        }
    }
}