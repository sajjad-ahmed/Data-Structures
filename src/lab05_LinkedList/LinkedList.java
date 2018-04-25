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


public class LinkedList {
    public Node head;


    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */
    public LinkedList(Object[] a) {
        head = new Node(a[0], null);
        Node tail = head;
        for (int i = 1; i < a.length; i++) {
            Node temp = new Node(a[i], null);
            tail.next = temp;
            tail = temp;

        }
    }

    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public LinkedList(Node h) {
        head = h;
    }

    /* Counts the number of Nodes in the list */
    public int countNode() {
        int count = 0;
        for (Node n = head; n != null; n = n.next)
            count++;
        return count; // please remove this line!
    }

    /* prints the elements in the list */
    public void printList() {
        for (Node n = head; n != null; n = n.next) {
            System.out.print(n.element);
            Node printHelper = n.next;
            if (!(printHelper == null))
                System.out.print(", ");
        }
        System.out.print(".");
        System.out.println();
    }

    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx) {
        if (idx < 0 || idx > countNode()) {
            return null;
        } else {
            int i = 0;
            for (Node n = head; n != null; n = n.next, i++) {
                if (i == idx)
                    return n;
            }
        }
        return null;
    }


    // returns the element of the Node at the given index. For invalid idx return null.
    public Object get(int idx) {
        Node node = nodeAt(idx);
        return node.element; // please remove this line!
    }


    /* updates the element of the Node at the given index.
     * Returns the old element that was replaced. For invalid index return null.
     * parameter: index, new element
     */
    public Object set(int idx, Object elem) {
        // TO DO
        if (idx < 0 || idx > countNode())
            return null;
        else {
            Node node = nodeAt(idx);
            Object temp = node.element;
            node.element = elem;
            return temp;
        }

    }


    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem) {
        int count = 0;
        for (Node n = head; n != null; n = n.next) {
            if (n.element.equals(elem))
                return count;
            count++;
        }
        return -1; // please remove this line!
    }

    // returns true if the element exists in the List, return false otherwise.
    public boolean contains(Object elem) {
        for (Node n = head; n != null; n = n.next) {
            if (n.element.equals(elem))
                return true;
        }
        return false; // please remove this line!
    }

    // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
    public Node copyList() {
        Node copyHead = new Node(head.element, null);
        Node tail = copyHead;
        for (Node n = head.next; n != null; n = n.next) {
            Node node = new Node(n.element, null);
            tail.next = node;
            tail = node;
        }
        return copyHead; // please remove this line!
    }

    // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
    public Node reverseList() {
        Node reverseHead = null;
        for (Node n = head; n != null; n = n.next) {
            Node node = new Node(n.element, null);
            node.next = reverseHead;
            reverseHead = node;
        }
        return reverseHead; // please remove this line!
    }

    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx) {
        if (idx < 0 || idx > countNode()) {
            System.out.println("Invalid index");
            return;
        } else if (idx == 0) {
            Node node = new Node(elem, null);
            node.next = head;
            head = node;
        } else {
            Node pred = nodeAt(idx - 1);
            Node succ = pred.next;

            Node node = new Node(elem, null);
            node.next = succ;
            pred.next = node;
        }
    }


    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index) {
        if (index < 0 || index > countNode()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Node removeNode = null;
        if (index == 0) {
            removeNode = head;
            head = head.next;
        } else {
            Node pred = nodeAt(index - 1);
            removeNode = pred.next;
            Node succ = pred.next.next;
            pred.next = succ;
        }
        removeNode.next = null;
        Object temp = removeNode.element;
        removeNode.element = null;
        return temp; // please remove this line!
    }

    // Rotates the list to the left by 1 position.
    public void rotateLeft() {
        Node oldHead = head;
        head = head.next;
        Node tail = head;
        for (Node n = head; n != null; n = n.next) {
            tail = n;
        }
        tail.next = oldHead;
        oldHead.next = null;
    }

    // Rotates the list to the right by 1 position.
    public void rotateRight() {
        Node tail = head;
        Node tailPrevious = null;
        for (Node n = head; n.next != null; n = n.next) {
            tailPrevious = n;
            tail = tailPrevious.next;
        }
        tail.next = head;
        head = tail;
        tailPrevious.next = null;
    }

}