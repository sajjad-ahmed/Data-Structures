package lab03_Array_Operations;
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
public class Main {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60};

        System.out.println("\n///// TEST 01: Copy Array example /////");
        int[] b = copyArray(a, a.length);
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 }

        System.out.println("\n///// TEST 02: Print Reverse example /////");
        printArray(a); // This Should Print: { 10, 20, 30, 40, 50, 60 }
        printReverse(a); // This Should Print: { 60, 50, 40, 30, 20, 10 }


        System.out.println("\n///// TEST 03: Reverse Array example /////");
        reverseArray(b);
        printArray(b); // This Should Print: { 60, 50, 40, 30, 20, 10 }


        System.out.println("\n///// TEST 04a: Shift Left k cell example /////");
        b = copyArray(a, a.length);
        b = shiftLeft(b, 3);
        printArray(b); // This Should Print: { 40, 50, 60, 0, 0, 0 }

        System.out.println("\n///// TEST 05: Rotate Left k cell example /////");
        b = copyArray(a, a.length);
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 }
        b = rotateLeft(b, 3);
        System.out.println();
        printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 }

        System.out.println("\n///// TEST 06: Shift Right k cell example /////");
        b = copyArray(a, a.length);
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 }
        System.out.println();
        b = shiftRight(b, 3);
        printArray(b);  // This Should Print: { 0, 0, 0, 10, 20, 30 }

        System.out.println("\n///// TEST 07: Rotate Right k cell example /////");
        b = copyArray(a, a.length);
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 }
        b = rotateRight(b, 3);
        printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 }


        System.out.println("\n///// TEST 08: Insert example 1 /////");

        b = copyArray(a, a.length);
        printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 }
        boolean bol = insert(b, 6, 70, 2); // This Should Print: No space Left
        System.out.println(bol); // This Should Print: false
        printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 }

        System.out.println("\n///// TEST 09: Insert example 2 /////");
        int[] c = {10, 20, 30, 40, 50, 0, 0};
        printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 }
        bol = insert(c, 5, 70, 2);  // This Should Print: Number of elements after insertion: 6
        System.out.println(bol); // This Should Print: true
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 }

        System.out.println("\n///// TEST 10: Insert example 3 /////");
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 }
        bol = insert(c, 6, 70, 6); // This Should Print: Number of elements after insertion: 7
        System.out.println(bol); // This Should Print: true
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 }

        System.out.println("\n///// TEST 11: Remove example 1 /////");

        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 }
        bol = removeAll(c, 7, 90);
        System.out.println(bol); // This Should Print: false
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 }

        System.out.println("\n///// TEST 12: Remove example 2 /////");
        printArray(c);  // This Should Print: { 10, 20, 70, 30, 40, 50, 70 }
        bol = removeAll(c, 7, 70);
        System.out.println(bol); // This Should Print: true
        printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 }


    }

    // Prints the contents of the source array
    public static void printArray(int[] source) {
        for (int i = 0; i < source.length; i++) {
            System.out.print(source[i]);
            if (i < source.length - 1)
                System.out.print(", ");
        }
        System.out.println();
    }

    // Prints the contents of the source array in reverse order
    public static void printReverse(int[] source) {
        for (int i = source.length - 1; i >= 0; i--) {
            System.out.print(source[i]);
            if (i >= 1)
                System.out.print(", ");
        }
        System.out.println();
    }

    // creates a copy of the source array and returns the reference of the newly created copy array
    public static int[] copyArray(int[] source, int len) {
        int[] copy = new int[source.length];
        for (int i = 0; i < source.length; i++)
            copy[i] = source[i];
        return copy;
    }

    // creates a reversed copy of the source array and returns the reference of the newly created reversed array
    public static void reverseArray(int[] source) {
        //int j=source.length-1;
        for (int i = 0; i < source.length / 2; i++) {
            int temp = source[i];
            source[i] = source[source.length - 1 - i];
            source[source.length - 1 - i] = temp;
        }
    }

    // Shifts all the elements of the source array to the left by 'k' positions
    // Returns the updated array
    public static int[] shiftLeft(int[] source, int k) {
        for (int i = 0; i < source.length - k; i++) {
            source[i] = source[i + k];
        }
        for (int i = source.length - k; i < source.length; i++) {
            source[i] = 0;
        }
        return source;
    }

    // Rotates all the elements of the source array to the left by 'k' positions
    // Returns the updated array
    public static int[] rotateLeft(int[] source, int k) {
        int[] tempArray = new int[k];
        for (int i = 0; i < source.length - k; i++) {
            tempArray[i] = source[i];
            source[i] = source[i + k];
        }
        int j = 0;
        for (int i = source.length - k; i < source.length; i++, j++) {
            source[i] = tempArray[j];
        }
        return source;
    }

    // Shifts all the elements of the source array to the right by 'k' positions
    // Returns the updated array
    public static int[] shiftRight(int[] source, int k) {
        int len = 0;
        for (int i = 0; i < source.length; i++) {
            if (source[i] != 0)
                len++;
        }
        int empty7End = 0;
        if (len == source.length) {
            empty7End = len - k;
            for (int i = len - 1 - k; i >= 0; i--) {
                source[i + k] = source[i];
            }
        } else if (len + k <= source.length) {
            empty7End = len;
            for (int i = len - 1; i >= 0; i--) {
                source[i + k] = source[i];
            }
        } else {
            empty7End = source.length - k;
            for (int i = source.length - 1 - k; i >= 0; i--) {
                source[i + k] = source[i];
            }
        }
        for (int i = 0; i < empty7End; i++) {
            source[i] = 0;
        }
        return source;
    }

    // Rotates all the elements of the source array to the right by 'k' positions
    // Returns the updated array
    public static int[] rotateRight(int[] source, int k) {
        int[] tempArray = new int[k];
        int len = 0;
        for (int i = 0; i < source.length; i++) {
            if (source[i] != 0)
                len++;
        }
        if (len == source.length) {
            for (int i = len - 1 - k; i >= 0; i--) {
                tempArray[i] = source[i + k];
                source[i + k] = source[i];
            }
        } else if (len + k <= source.length) {
            for (int i = len - 1; i >= 0; i--) {
                tempArray[i] = source[i + k];
                source[i + k] = source[i];
            }
        } else {
            for (int i = source.length - 1 - k; i >= 0; i--) {
                tempArray[i] = source[i + k];
                source[i + k] = source[i];
            }
        }
        for (int i = 0; i < tempArray.length; i++) {
            source[i] = tempArray[i];
        }
        return source;
    }

    /**
     * @param arr   the reference to the linear array
     * @param size  the number of elements that exists in the array. size<=arr.length
     * @param elem  the element that is to be inserted
     * @param index the index in which the element is required to be inserted
     *              if insertion is not successful due to lack space, print "No space Left"
     *              if given index is invalid, print "Invalid Index"
     *              if insertion is successful, print the 'Number of elements after insertion' is completed
     * @return true if insertion is successful; @return false otherwise
     */
    public static boolean insert(int[] arr, int size, int elem, int index) {

        if (size == arr.length) {
            System.out.println("No space Left");
            return false;
        }
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid Index");
            return false;
        } else {
            int j = 0;
            for (int i = arr.length - 1; i >= 0; i--) {
                if (i == index) {
                    arr[i] = elem;
                    break;
                } else {
                    arr[i] = arr[i - 1];
                }
            }
            System.out.println("Number of elements after insertion: " + (size + 1));
            return true;
        }
    }

    /**
     * removes all the occurences of the given element
     *
     * @param arr  the reference to the linear array
     * @param size the number of elements that exists in the array. size<=arr.length
     * @param elem the element to be removed
     * @return true if removal is successful; return false otherwise
     * if removal is successful, print the 'Number of elements after removal' is completed
     */
    public static boolean removeAll(int[] arr, int size, int elem) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                for (int j = i; j < size; j++) {
                    if (j == size - 1)
                        arr[j] = 0;
                    else
                        arr[j] = arr[j + 1];

                }
                count++;
                size--;
            }
        }
        if (count == 0)
            return false;
        else
            return true;

    }
}