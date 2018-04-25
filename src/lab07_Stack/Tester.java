package lab07_Stack;

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

public class Tester {
    public static void main(String[] args) {
        System.out.println("//---------------- List stack ----------------//");
        Object[] obj1 = {10, 20, 30, 40};
        ListStack l1 = new ListStack(obj1);
        System.out.println(l1);
        System.out.println("//---------------- Task 1 push----------------//");
        try {
            l1.push(25);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(l1);
        System.out.println("//---------------- Task 2 pop----------------//");
        try {
            System.out.println(l1.pop());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(l1);
        System.out.println("//---------------- Task 3 peek----------------//");
        try {
            System.out.println(l1.peek());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(l1);

        System.out.println("//---------------- Task 3 search----------------//");
        try {
            System.out.println(l1.search(40));
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(l1);
        System.out.println("//---------------- Task 3 toArray----------------//");
        try {
            Object[] o1 = l1.toArray();
            for (Object x : o1)
                System.out.println(x);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(l1);

        System.out.println();
        System.out.println("//--------------------------------------------//");
        System.out.println();

        System.out.println("//---------------- Array Stack----------------//");
        Object[] obj2 = {100, 200, 300, 400};
        ArrayStack l2 = new ArrayStack(obj2);
        System.out.println(l2);
        System.out.println("//---------------- Task 1 push----------------//");
        try {
            l2.push(25);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(l2);
        System.out.println("//---------------- Task 2 pop----------------//");
        try {
            System.out.println(l2.pop());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(l2);
        System.out.println("//---------------- Task 3 peek----------------//");
        try {
            System.out.println(l2.peek());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(l2);

        System.out.println("//---------------- Task 3 search----------------//");
        try {
            System.out.println(l2.search(40));
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(l2);
        System.out.println("//---------------- Task 3 toArray----------------//");
        try {
            Object[] o1 = l2.toArray();
            for (Object x : o1)
                System.out.println(x);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(l2);
    }
}
