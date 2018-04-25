
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
public class DoublyList {
    public Node head;


    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */
    public DoublyList(Object[] a) {
        head = new Node(null, null, null);
        Node tail = head;

        for (int i = 0; i < a.length; i++) {
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev = tail;
            tail = tail.next;
        }
        tail.next = head;
        head.prev = tail;
    }

    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h) {
        head = h;
    }

    /* Counts the number of Nodes in the list */
    public int countNode() {
        int count = 0;
        for (Node n = head.next; n != head; n = n.next) {
            count++;
        }
        return count;
    }

    /* prints the elements in the list */
    public void forwardprint() {

        for (Node n = head.next; n != head; n = n.next) {
            System.out.print(n.element);
            if (!(n.next == head))
                System.out.print(", ");
        }
        System.out.print(".");
        System.out.println();
    }


    public void backwardprint() {
        for (Node n = head.prev; n != head; n = n.prev) {
            System.out.print(n.element);
            if (!(n.prev == head))
                System.out.print(", ");
        }
        System.out.print(".");
        System.out.println();
    }


    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx) {
        if (idx < -1 || idx > countNode())
            return null;

        if (idx == -1)
            return head;
        else {
            int c = 0;
            for (Node n = head.next; n != head; n = n.next) {
                if (idx == c)
                    return n;
                c++;
            }
        }
        return null;
    }


    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem) {
        int c = 0;
        for (Node n = head.next; n != head; n = n.next) {
            if (n.element.equals(elem))
                return c;
            c++;
        }


        return -1;
    }


    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx) {
        Node pred = nodeAt(idx - 1);
        Node succ = pred.next;
        Node mn = new Node(elem, null, null);
        mn.prev = pred;
        mn.next = succ;
        pred.next = mn;
        succ.prev = mn;

    }


    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index) {
        Object val = null;

        Node pred = nodeAt(index - 1);
        Node target = pred.next;
        Node succ = target.next;

        val = target.element;

        succ.prev = pred;
        pred.next = succ;

        target.element = null;
        target.next = null;
        target.prev = null;


        return val;
    }
}