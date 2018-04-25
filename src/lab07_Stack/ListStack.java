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
public class ListStack implements Stack {
    int size;
    Node top;


    public ListStack(Object[] a) {
        size = 0;
        top = null;
        top = new Node(a[0], null);
        Node tail = top;
        for (int i = 1; i < a.length; i++) {
            Node temp = new Node(a[i], null);
            tail.next = temp;
            tail = temp;

        }
        size = size();
    }


    @Override
    public int size() {
        int c = 0;
        for (Node n = top; n != null; n = n.next) {
            c++;
        }
        return c;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0)
            return true;
        return false;
    }

    @Override
    public void push(Object e) throws StackOverflowException {
        Node mn = new Node(e, null);
        mn.next = top;
        top = mn;
        size++;
    }

    @Override
    public Object pop() throws StackUnderflowException {
        if (size == 0)
            throw new StackUnderflowException();
        Node temp = top;
        top = temp.next;
        Object elem = temp.val;
        temp.val = null;
        temp.next = null;
        size--;
        return elem;
    }

    @Override
    public Object peek() throws StackUnderflowException {
        if (size == 0)
            throw new StackUnderflowException();

        return top.val;
    }

    @Override
    public Object[] toArray() {
        Object[] objArray = new Object[size];
        int t = 0;
        for (Node n = top; n != null; n = n.next, t++) {
            objArray[t] = n.val;
        }
        return objArray;
    }

    @Override
    public int search(Object e) {
        int t = 0;
        for (Node n = top; n != null; n = n.next, t++) {
            if (e == n.val)
                break;
        }
        return t;
    }

    public String toString() {
        String output = "";
        for (Node n = top; n != null; n = n.next) {
            output = output + n.val + " ";
        }
        return "[ " + output + " ]";
    }
}