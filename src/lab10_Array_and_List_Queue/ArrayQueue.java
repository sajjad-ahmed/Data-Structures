package lab10_Array_and_List_Queue;

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
public class ArrayQueue {
    int[] idArray;
    String[] name;
    public int size;
    int front;
    static int Auto_id = 0;

    public ArrayQueue() {
        idArray = new int[5];
        name = new String[5];
        size = 0;
        front = -1;
    }

    public void RegisterPatient(String n) {
        if (size == idArray.length)
            System.out.println("Maximum 5 reached");
        if (size == 0) {
            front = (++front) % idArray.length;
            idArray[front] = Auto_id;
            name[front] = n;
        } else {
            int rear = front + size - 1;
            rear = (++rear) % idArray.length;
            idArray[rear] = Auto_id;
            name[rear] = n;
        }
        Auto_id++;
        size++;
    }

    public String ServePatient() {
        if (size == 0) {
            return "No patient left";
        }
        int ti = idArray[front];
        String tn = name[front];

        idArray[front] = 0;
        name[front] = null;

        front = (++front) % idArray.length;
        Auto_id--;
        size--;
        if (front > idArray.length - 1)
            front = 0;
        return "Name: " + ti + " ID: " + tn + " is served!!!";
    }

    public boolean CanDoctorGoHome() {
        if (size == 0)
            return true;
        else
            return false;
    }

    public void CancelAll() {
        int j = front;
        for (int i = 0; i < size; i++) {
            idArray[j] = 0;
            name[j] = null;
            j = (++j) % idArray.length;
        }
        size = 0;
        front = -1;
    }

    public void ShowAllPatient() {
        System.out.println("---------------------");
        if (size == 0) {
            System.out.println("No patient to show");
            System.out.println("---------------------");
            return;
        }
        sort();
        int j = front;
        for (int i = 0; i < size; i++) {
            System.out.println("NAME: " + name[j] + " ID: " + idArray[j]);
            j = (++j) % idArray.length;
        }
        System.out.println("---------------------");

    }


    private void sort() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (name[j].compareTo(name[j + 1]) > 0) {
                    String temp = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = temp;
                    int t = idArray[j];
                    idArray[j] = idArray[j + 1];
                    idArray[j + 1] = t;
                }
            }
        }
    }
}