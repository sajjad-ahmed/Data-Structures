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

public class Task_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Object[] fv = new Object[5];
        for (int i = 0; i < fv.length; i++) {
            fv[i] = scanner.nextInt();
        }
        recursiveBubbleSort(fv, fv.length);
        System.out.println("After sorting...");
        for (int i = 0; i < fv.length; i++) {
            System.out.println(fv[i]);
        }
    }

    public static Object[] recursiveBubbleSort(Object[] list, int n) {
        if (n == 1) {
            return list; //finished sorting
        }

        Object temp;
        for (int i = 0; i < n - 1; i++) {
            if (((Comparable) (list[i + 1])).compareTo(list[i]) < 0) {
                temp = list[i];
                list[i] = list[i + 1];
                list[i + 1] = temp;
            }
        }
        return recursiveBubbleSort(list, n - 1);
    }

}