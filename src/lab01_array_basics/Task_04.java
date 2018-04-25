
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


public class Task_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < array.length; ) {
            int flag = 0;
            int n = sc.nextInt();
            for (int j = 0; j < i; j++) {
                if (array[j] == n)
                    flag = 2;
            }
            if (flag == 0) {
                array[i] = n;
                i++;
            } else
                System.out.println("Enter another number");
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " , ");
        }
    }

}

