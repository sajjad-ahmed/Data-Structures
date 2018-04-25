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

public class Task_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        array = square(array, array.length);
        display(array);
    }

    public static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] square(int[] array, int arraySize) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }
        return array;
    }
}
