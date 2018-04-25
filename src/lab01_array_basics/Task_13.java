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

public class Task_13 {

    public static void main(String[] args) {
        int[] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
        for (int i = 0; i < mixedArray.length; i++) {
            System.out.print(mixedArray[i] + " ");
        }
        System.out.println();
        int[] noOdd = removeOdd(mixedArray);
        for (int i = 0; i < noOdd.length; i++) {
            System.out.print(noOdd[i] + " ");
        }
    }


    public static int[] removeOdd(int[] input) {
        int evenCount = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0)
                evenCount++;
        }
        int output[] = new int[evenCount];
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                output[count] = input[i];
                count++;
            }
        }
        return output;
    }
}
