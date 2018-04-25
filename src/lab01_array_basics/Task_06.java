
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

public class Task_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        System.out.println("Enter numbers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int mid = arraySize / 2;
        int flag = 0;
        if (arraySize != 0) {
            int j = mid + 1;
            for (int i = mid - 1; i >= 0; i--) {
                if (array[i] == array[j])
                    flag = 2;
                mid++;
            }
        } else {
            int j = mid + 1;
            for (int i = mid; i >= 0; i--) {
                if (array[i] == array[j])
                    flag = 2;
                mid++;
            }
        }
        if (flag == 2)
            System.out.println("Array is a palindrome");
        else
            System.out.println("Array is not a palindrome");

    }
}