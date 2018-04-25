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


public class Task_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Object[] fv = new Object[5];
        for (int i = 0; i < fv.length; i++) {
            fv[i] = scanner.nextInt();
        }
        List l1 = new List(fv);
        reverseList(l1.head);
    }


    public static Object reverseList(Node nd) {

        if (nd.next == null) {
            System.out.println(nd.value);
            return nd.value;
        } else {
            reverseList(nd.next);
            System.out.println(nd.value + " ");
        }
        return null;
    }
}
