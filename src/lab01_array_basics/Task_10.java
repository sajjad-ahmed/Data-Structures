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

public class Task_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month:");
        int m = sc.nextInt();
        System.out.println("Enter Day:");
        int d = sc.nextInt();
        season(m - 1, d - 1);
    }

    public static void season(int month, int day) {
        String[][] month_date_array = new String[12][];
        for (int i = 0; i < month_date_array.length; i++) {
            if (i == 3 || i == 5 || i == 8 || i == 10)
                month_date_array[i] = new String[30];
            else if (i == 1)
                month_date_array[i] = new String[28];
            else
                month_date_array[i] = new String[31];
        }

        for (int i = 0; i < month_date_array.length; i++) {
            for (int j = 0; j < month_date_array[i].length; j++) {
                if (i >= 0 && i <= 2) {
                    if (i == 2 && j <= 14)
                        month_date_array[i][j] = "Winter";
                    else if (i == 2 && j > 14)
                        month_date_array[i][j] = "Spring";
                    else
                        month_date_array[i][j] = "Winter";
                } else if (i >= 3 && i <= 5) {
                    if (i == 5 && j <= 14)
                        month_date_array[i][j] = "Spring";
                    else if (i == 5 && j > 14)
                        month_date_array[i][j] = "Summer";
                    else
                        month_date_array[i][j] = "Spring";
                } else if (i >= 6 && i <= 8) {
                    if (i == 8 && j <= 14)
                        month_date_array[i][j] = "Summer";
                    else if (i == 8 && j > 14)
                        month_date_array[i][j] = "Fall";
                    else
                        month_date_array[i][j] = "Summer";
                } else if (i >= 9 && i <= 11) {
                    if (i == 11 && j <= 14)
                        month_date_array[i][j] = "Fall";
                    else if (i == 11 && j > 14)
                        month_date_array[i][j] = "Winter";
                    else
                        month_date_array[i][j] = "Fall";
                }
            }
        }
        System.out.println(month_date_array[month][day]);
    }
}
