/**
 #
 # ==============================================================================
 # project name    : Data Structures in Java
 # author          : Sajjad Ahmed Niloy
 # date            : 02-Jan-2016
 # license         : none
 # ==============================================================================
 #
 */
package lab01_array_basics;
import java.util.Scanner;

public class Task_08
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row dimension:");
        int n = sc.nextInt();

        int[][] ab_array = new int[2][n];

        for (int i = 0; i < ab_array.length; i++)
        {
            for (int j = 0; j < n; j++)
            {
                ab_array[i][j] = sc.nextInt();
            }
        }

        int[] c_array = new int[n];

        for (int j = 0; j < n; j++)
        {
            c_array[j] = 5 * ab_array[0][j] - ab_array[1][j];
        }
        for (int i = 0; i < c_array.length; i++)
        {
            System.out.println(c_array[i]);
        }
    }
}
