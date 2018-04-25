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

public class List {
    public Node head;

    public List(Object a[]) {
        head = new Node(a[0], null);
        Node tail = head;
        for (int i = 1; i < a.length; i++) {
            Node mn = new Node(a[i], null);
            tail.next = mn;
            tail = mn;
        }
    }
}

class Node {
    Object value;
    Node next;

    public Node(Object o, Node nxt) {
        value = o;
        next = nxt;
    }
}
