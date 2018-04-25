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


public class Task_07
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter a number between 0-9:");
        int n=sc.nextInt();
        for (int i = 0; i < array[n]; i++)
        {
            System.out.print('*');
        }
    }
}
