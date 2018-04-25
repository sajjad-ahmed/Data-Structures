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

public class ArrayQueue implements Queue
{
    int size;
    int front;
    int rear;
    Object[] data;

    public ArrayQueue()
    {
        size = 0;
        front = -1;
        rear = -1;
        data = new Object[5];
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
        if (data.length == size)
            throw new StackOverflowError();
        if (size == 0)
        {
            rear = (++rear) % data.length;
            data[rear] = o;
            front = rear;
        } else
        {
            rear = (++rear) % data.length;
            data[rear] = o;
        }
        size++;
    }

    @Override
    public Object dequeue() throws QueueUnderflowException
    {
        Object o = null;
        if (size == 0)
            throw new QueueUnderflowException();
        o = data[front];
        data[front] = null;
        front = (++front) % data.length;

        size--;

        return o;
    }

    @Override
    public Object peek() throws QueueUnderflowException
    {
        if (size == 0)
            throw new QueueUnderflowException();
        return data[front];
    }

    @Override
    public Object[] toArray()
    {
        Object[] objArr = new Object[size];
        int j = front;
        for (int i = 0; i < size; i++)
        {
            objArr[i] = data[j];
            j = (++j) % data.length;
        }
        return objArr;
    }

    @Override
    public int search(Object o)
    {
        int count = 0;
        int j = front;
        for (int i = 0; i < size; i++, count++)
        {
            if (data[j].equals(o))
            {
                return count;
            }
            j++;
            if (j > data.length)
                j = 0;
        }
        return -1;
    }

    public String toString()
    {
        String output = "";
        int count=front;
        for (int i = 0; i < size; i++, count=(++count)%data.length)
        {
            output = output + data[count] + " ";
        }
        return "[ " + output + "]";
    }
//TO DO

}