package lab05_LinkedList;

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

public class Node {
    public Object element;
    public Node next;

    public Node(Object e, Node n) {
        element = e;
        next = n;

    }

}