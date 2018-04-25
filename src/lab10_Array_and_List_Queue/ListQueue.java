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
public class ListQueue {
    int size;
    Node front;
    Node rear;
    public static int auto_ID = 0;

    public ListQueue() {
        size = 0;
        front = null;
        rear = null;
    }


    public boolean CanDoctorGoHome() {
        if (size == 0)
            return true;
        else
            return false;
    }

    public void RegisterPatient(String n) {

        Node mn = new Node(n, auto_ID, null);
        if (size == 0) {
            front = mn;
            rear = front;
        } else {
            rear.next = mn;
            rear = mn;
        }
        auto_ID++;
        size++;
    }


    public Object ServePatient() {
        if (size == 0) {
            System.out.println("No patient left");
            return null;
        }
        Object temp1 = front.name;
        Object temp2 = front.id;
        Node succ = front.next;
        front.name = null;
        front.id = 0;
        front.next = null;
        front = succ;
        size--;
        return "Name: " + temp1 + " ID: " + temp2 + " is served!!!";
    }


    public void ShowAllPatient() {
        System.out.println("---------------------");

        if (size == 0) {
            System.out.println("No patient left");
            System.out.println("---------------------");

            return;
        }
        for (Node n = front; n != null; n = n.next) {
            System.out.println("Name: " + n.name + " ID: " + n.id);
        }
        System.out.println("---------------------");

    }

    private void sort() {
        Node n = front.next;

        for (int i = 0; i < size; i++) {
            String p = (String) n.name;
            String q = (String) n.next.name;
            for (int j = 0; j < size - 1; j++, n = n.next) {
                if (p.compareTo(q) > 0) {
                    Object tp = n.name;
                    n.name = n.next.name;
                    n.next.name = tp;
//                    String t=p;
//                    p=q;
//                    q=t;
                }
            }
        }
    }


    public void CancellAll() {
        for (Node n = front; n != null; n = n.next) {
            n.name = null;
            n.id = 0;
            n.next = null;
        }
        size = 0;
        front = null;
        rear = null;
    }
}