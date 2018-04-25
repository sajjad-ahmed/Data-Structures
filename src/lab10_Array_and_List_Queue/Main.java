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

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1) Register New patient\n 2) Serve patient \n 3) CancelAll \n 4) CanDoctorGoHome \n 5) ShowAllPatient \n 6) Exit");
        int n = 0;

//        ArrayQueue aq1 = new ArrayQueue();
//        while (true)
//        {
//            System.out.println("--------------------");
//            System.out.println("Enter your choice");
//            System.out.println("--------------------");
//
//            int p=sc.nextInt();
//            sc.nextLine();
//            if (p==1)
//            {
//                System.out.println("-----NEW patient----");
//                System.out.println("Enter name");
//                String ns = sc.nextLine();
//                aq1.RegisterPatient(ns);
//            }
//            else if (p==2)
//            {
//                System.out.println("Serve patient");
//                System.out.println(aq1.ServePatient());
//            }
//            else if (p==3)
//            {
//                System.out.println("Cancel all");
//                aq1.CancelAll();
//            }
//            else if (p==4)
//            {
//                System.out.println("Can doctor go home?");
//                System.out.println(aq1.CanDoctorGoHome());
//            }
//            else if (p==5)
//            {
//                System.out.println("Show all Patients:");
//                aq1.ShowAllPatient();
//            }
//            else  if(p==6)
//            {
//                System.out.println("Thank you!!!");
//                break;
//            }
//            System.out.println();
//            n++;
//        }


        System.out.println();
        System.out.println("----List-----");
        System.out.println();
        ListQueue lq1 = new ListQueue();
        while (true) {
            System.out.println("--------------------");
            System.out.println("Enter your choice");
            System.out.println("--------------------");

            int p = sc.nextInt();
            if (p == 1) {
                System.out.println("-----NEW patient----");
                System.out.println("Enter name");
                String ns = sc.next();
                lq1.RegisterPatient(ns);
            } else if (p == 2) {
                System.out.println("Serve patient");
                System.out.println(lq1.ServePatient());
            } else if (p == 3) {
                System.out.println("Cancel all");
                lq1.CancellAll();
            } else if (p == 4) {
                System.out.println("Can doctor go home?");
                System.out.println(lq1.CanDoctorGoHome());
            } else if (p == 5) {
                System.out.println("Show all Patients:");
                lq1.ShowAllPatient();
            } else if (p == 6)
                break;

        }
    }


}
