package lab04_Circular_Array;

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

public class CircularArray {
    private int start;
    private int size;
    private Object[] cir;

    /*
     * if Object [] lin = {10, 20, 30, 40, null}   // This Should Print: 40, null, 10, 20, 30.
     * then, CircularArray(lin, 2, 4) will generate
     * Object [] cir = {40, null, 10, 20, 30}
     */
    public CircularArray(Object[] lin, int st, int sz) {
        cir = new Object[lin.length];
        size = sz;
        start = st;
        int t = start;
        for (int i = 0; i < size; i++) {
            cir[t] = lin[i];
            t++;
            if (t >= cir.length)
                t = 0;
        }

    }

    //Prints from index --> 0 to cir.length-1
    public void printFullLinear() {
        for (int i = 0; i < cir.length; i++) {
            System.out.print(cir[i]);
            if (i < cir.length - 1)
                System.out.print(", ");
            else
                System.out.print(".");
        }
        System.out.println();
    }

    // Starts Printing from index start. Prints a total of size elements
    public void printForward() {
        int x = start;
        for (int i = 0; i < size; i++) {
            System.out.print(cir[x]);
            x = (x + 1) % cir.length;
            if (i < size - 1)
                System.out.print(", ");
            else
                System.out.print(".");
        }
        System.out.println();
    }


    public void printBackward() {
        int x = (start + size - 1) % cir.length;
        for (int i = 0; i < size; i++) {
            System.out.print(cir[x]);
            x--;
            if (x < 0)
                x = cir.length - 1;
            if (i < size - 1)
                System.out.print(", ");
            else
                System.out.print(".");
        }
    }

    // With no null cells
    public void linearize() {
        Object[] linearArray = new Object[cir.length];
        int t = start;
        for (int i = 0; i < cir.length; i++) {
            if (cir[t] != null)
                linearArray[i] = cir[t];
            t = (t + 1) % cir.length;
        }
        cir = linearArray;
    }

    // Do not change the Start index
    public void resizeStartUnchanged(int newcapacity) {
        Object[] resizeArray = new Object[newcapacity];
        int k = start;
        int m = start;
        for (int i = 0; i < size; i++) {
            resizeArray[m] = cir[k];
            k = (k + 1) % cir.length;
            m = (m + 1) % resizeArray.length;
        }
        cir = resizeArray;
    }

    // Start index becomes zero
    public void resizeByLinearize(int newcapacity) {
        Object[] resizeArray = new Object[newcapacity];
        int k = start;
        for (int i = 0; i < size; i++) {
            resizeArray[i] = cir[k];
            k = (k + 1) % cir.length;
        }
        cir = resizeArray;
    }

    /* pos --> position relative to start. Valid range of pos--> 0 to size.
     * Increase array length by 3 if size==cir.length
     * use resizeStartUnchanged() for resizing.
     */
    public void insertByRightShift(Object elem, int pos) {
        if (size == cir.length) {
            resizeStartUnchanged(size + 3);
        }
        int from = (start + size - 1) % cir.length;
        int to = (from + 1) % cir.length;
        int nshift = size - pos;
        for (int i = 0; i < nshift; i++) {
            cir[to] = cir[from];
            to = from;
            from--;
            if (from < 0)
                from = cir.length - 1;
        }
        cir[(start + pos) % cir.length] = elem;
        size++;
    }

    public void insertByLeftShift(Object elem, int pos) {
        if (size == cir.length) {
            resizeStartUnchanged(size + 3);
        }
        int from = start;
        int to = (start - 1) % cir.length;
        int nshift = pos + 1;
        for (int i = 0; i < nshift; i++) {
            cir[to] = cir[from];
            to = from;
            from = (from + 1) % cir.length;
        }
        cir[start + pos] = elem;
        size++;
        start--;
        if (start < 0)
            start = cir.length - 1;
    }

    /* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     */
    public void removeByLeftShift(int pos) {
        int to = (start + pos) % cir.length;
        int from = (to + 1) % cir.length;
        int nshift = size - (pos + 1);
        for (int i = 0; i < nshift; i++) {
            cir[to] = cir[from];
            to = from;
            from = (from + 1) % cir.length;
        }
        cir[(start + size - 1) % cir.length] = null;
        size--;
    }

    /* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     */
    public void removeByRightShift(int pos) {
        int to = (start + pos) % cir.length;
        int from = (to - 1) % cir.length;
        int nshift = pos;
        for (int i = 0; i < nshift; i++) {
            cir[to] = cir[from];
            to = from;
            from--;
            if (from < 0)
                from = cir.length - 1;
        }
        cir[start] = null;
        size--;
        start++;
    }

}