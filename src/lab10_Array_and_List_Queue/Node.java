package lab10_Array_and_List_Queue;

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
    Object id;
    Node next;
    Object name;

    public Node(Object n1, int i, Node n) {
        name = n1;
        id = i;
        next = n;
    }
}