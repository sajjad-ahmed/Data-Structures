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

public class Task_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Object[] fv = new Object[5];
        for (int i = 0; i < fv.length; i++) {
            fv[i] = scanner.nextInt();
        }
        List l1 = new List(fv);
        System.out.println("Enter the number you want to find:");
        System.out.println(index(l1.head, scanner.nextInt(), 0));
    }


    public static int index(Node nd, Object elm, int count) {
        if (elm.equals(nd.value))
            return count;
        else if (nd.next == null) {
            return -1;
        } else {
            return index(nd.next, elm, ++count);
        }
    }

}
