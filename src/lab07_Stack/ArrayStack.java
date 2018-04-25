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
public class ArrayStack implements Stack {
    int size;
    int top;
    Object[] data;

    public ArrayStack(Object[] ob) {
        if (ob.length > 0) {
            size = ob.length;
            top = ob.length - 1;
            data = ob;
        } else {
            size = 0;
            top = -1;
            data = ob;
        }
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        boolean b = false;
        for (Object x : data) {
            if (x != null)
                b = true;
        }
        return b;
    }

    @Override
    public void push(Object e) throws StackOverflowException {
        Object[] tempArray = new Object[data.length + 1];

        for (int x = 0; x < data.length; x++) {
            tempArray[x] = data[x];
        }
        tempArray[tempArray.length - 1] = e;
        size++;
        top = tempArray.length - 1;
        data = tempArray;
    }

    @Override
    public Object pop() throws StackUnderflowException {
        Object removedObject = null;
        if (size != 0) {
            Object[] tempArray = new Object[data.length - 1];
            for (int x = 0; x < tempArray.length; x++) {
                tempArray[x] = data[x];
            }
            removedObject = data[data.length - 1];
            size--;
            data = tempArray;
            top = data.length - 1;

        } else
            throw new StackUnderflowException();
        return removedObject;
    }

    @Override
    public Object peek() throws StackUnderflowException {
        Object popElement = null;
        if (size != 0) {
            popElement = data[top];
        } else
            throw new StackUnderflowException();
        return popElement;
    }

    @Override
    public Object[] toArray() {
        return data;
    }

    @Override
    public String toString() {
        String output = "";
        for (Object o : data) {
            output = output + o + " ";
        }
        return "[ " + output + " ]";
    }

    @Override
    public int search(Object e) {
        int x = -1;
        for (int y = 0; y < data.length; y++) {
            if (data[y].equals(e))
                x = y;
        }
        return x;
    }
}