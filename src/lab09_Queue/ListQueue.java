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

public class ListQueue implements Queue
{
    int size;
    Node front;
    Node rear;


    public ListQueue()
    {
        size = 0;
        front = null;
        rear = null;
    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public boolean isEmpty()
    {
        if (size == 0)
            return true;
        else
            return false;
    }

    @Override
    public void enqueue(Object o) throws QueueOverflowException
    {

        Node mn = new Node(o, null);
        if (size == 0)
        {
            front = mn;
            rear = front;
        } else
        {
            rear.next = mn;
            rear = mn;
        }
        size++;
    }


    @Override
    public Object dequeue() throws QueueUnderflowException
    {
        if (size == 0)
            throw new QueueUnderflowException();
        Object temp = front.val;
        Node succ = front.next;
        front.val = null;
        front.next = null;
        front = succ;
        size--;
        return temp;
    }

    @Override
    public Object peek() throws QueueUnderflowException
    {
        if (size == 0)
            throw new QueueUnderflowException();

        return front.val;
    }

    @Override
    public Object[] toArray()
    {
        Object[] objArr = new Object[size];
        int i = 0;
        for (Node n = front; n != null; n = n.next, i++)
        {
            objArr[i] = n.val;
        }
        return objArr;
    }

    @Override
    public int search(Object o)
    {
        int c = 0;
        for (Node n = front; n != null; n = n.next, c++)
        {
            if (o.equals(n.val))
                return c;
        }
        return -1;
    }

    public String toString()
    {
        String output = "";
        for (Node n = front; n != null; n = n.next)
        {
            output = output + n.val + " ";
        }
        return "[ " + output + "]";
    }
}