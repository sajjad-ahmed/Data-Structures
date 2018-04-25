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

public class StackUnderflowException extends Exception {
    public StackUnderflowException() {
        System.out.println("Error: Stack Underflow Exception");
    }

}