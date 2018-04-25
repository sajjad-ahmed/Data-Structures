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

public class Node{
    Object val;
    Node next;
    
    public Node(Object v, Node n){
        val = v;
        next = n;
    }
}