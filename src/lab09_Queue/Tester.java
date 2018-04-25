package lab09_Queue;

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
        System.out.println("Array");
        ArrayQueue a1 = new ArrayQueue();
        try {
            a1.enqueue(new Integer(25));
        } catch (QueueOverflowException e) {
            e.printStackTrace();
        }
        try {
            a1.enqueue(new Integer(35));
        } catch (QueueOverflowException e) {
            e.printStackTrace();
        }
        System.out.println(a1);
        try {
            a1.dequeue();
        } catch (QueueUnderflowException e) {
            e.printStackTrace();
        }
        System.out.println(a1);
        try {
            System.out.println("peek=" + a1.peek());
        } catch (QueueUnderflowException e) {
            e.printStackTrace();
        }
        System.out.println("size=" + a1.size());
        System.out.println("se=" + a1.size());

        System.out.println();
        System.out.println("List");
        ListQueue l1 = new ListQueue();
        try {
            l1.enqueue(new Integer(25));
        } catch (QueueOverflowException e) {
            e.printStackTrace();
        }
        System.out.println(l1);
        try {
            l1.dequeue();
        } catch (QueueUnderflowException e) {
            e.printStackTrace();
        }
        System.out.println(l1);
    }
}
