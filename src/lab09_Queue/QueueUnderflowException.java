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

public class QueueUnderflowException extends Exception{
    public QueueUnderflowException()
    {
        System.out.println("Error! QueueUnderflowException...");
    }
}