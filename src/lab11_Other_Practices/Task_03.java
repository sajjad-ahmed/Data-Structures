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


public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] fv = new int[5];
        for (int i = 0; i < fv.length; i++) {
            fv[i] = scanner.nextInt();
        }

        for (int i = 0; i < fv.length; i++) {
            for (int j = 0; j < fv.length - 1; j++) {
                if (fv[j] > fv[j + 1]) {
                    int temp = fv[j];
                    fv[j] = fv[j + 1];
                    fv[j + 1] = temp;
                }
            }
        }
        System.out.println("Enter the numer you want to search:");
        System.out.println(binarySearch(fv, 0, fv.length - 1, scanner.nextInt()));


    }

    public static int binarySearch(int[] a, int start, int end, int num) {
        int mid = (start + end) / 2;
        if (start < end)
            return -1;
        if (a[mid] == num)
            return mid;
        else if (num < a[mid]) {
            end = mid - 1;
            return binarySearch(a, start, end, num);
        } else if (num > a[mid]) {
            start = mid + 1;
            return binarySearch(a, start, end, num);
        }

        return -1;
    }
}
