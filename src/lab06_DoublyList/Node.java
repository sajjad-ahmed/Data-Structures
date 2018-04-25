

package lab06_DoublyList;

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
    public Node prev;

    public Node(Object e, Node n, Node p) {
        element = e;
        next = n;
        prev = p;

    }

}