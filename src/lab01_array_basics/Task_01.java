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

public class Task_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        System.out.println("Enter numbers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int flag = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[0] == 6) || (array[array.length - 1] == 6)) {
                flag = 2;
            }
        }
        if (flag == 2) {
            System.out.println("True");
        } else
            System.out.println("False");
    }
}
