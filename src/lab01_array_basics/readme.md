Due – 15th May, Sunday
### Task  1:

Given an array of ints, return true if 6 appears as either the first or. Last element in the array. The array will be length 1 or more. 

firstLast6({1, 2, 6}) → true
firstLast6({6, 1, 2, 3}) → true
firstLast6({13, 6, 1, 2, 3}) → false

### Task  2
Read in 10 input from the keyboard, and store them in an array. Find the position (or index) of the maximum and minimum values in the array, and swap them (move the biggest element to the position of the smallest, and move the smallest element to the position of the biggest) and print that again. If the user enters 7, 13, -5, 10, 6 then your program should print 7,-5,13,10,6

### Task  3

Write a program which reads 5 numbers into an array, sorts/arranges the numbers from low to high and prints all numbers in the array and the even number in that list.
If the user enters 7, 13, 2, 10, 6 then your program should print 13, 10, 7, 6, 2,10 ,6 ,2 .

### Task  4

Write a Java program that would ask the user to enter ten numbers. As the user enters the ten numbers the program will make sure that all the numbers entered by the user are unique. For example if the user enters 2, 3, 4, 6, and then tries to enter 3 again the program will display that 3 is already in among the entered numbers and would ask the user to enter a new number.

### Task  5

Write a Java program that would ask the user to enter 15 numbers. All the numbers are between 0 to 9.  The program should count how many time the number been given. 
In the Input:
1,1,2,5,6,8,7,2,4,6,9,4,2,5,6

Output should look like: 

0 was found 0 times
1 was found 2 times
2 was found 3 times
3 was found 0 times
4 was found 2 times
5 was found 2 times
6 was found 3 times
7 was found 1 times
8 was found 1 times
9 was found 1 times


Hint: Using an array, use the element a[n] to count frequency / occurrence of the number n.


### Task 6

An array is a palindrome if it reads the same in both directions. For example,
3 5 7 2 4 is not a palindrome; however, the following one is. 4 2 6 2 4
Write a program that reads in an array and checks if it is a palindrome


### Task 7

Read 10 input from the user, and store them in an array. Then ask the user to give another input between 0 and 9 for choosing an array cell. Display a line with that many "*" characters.

Eg. Say if the user enter 15,6,7,9,45,2,26,84,8,10 then the user again give input as 3 the output will be “ *********” 


### Task 8

Ask user for dimension/size of two row matrices, take all values in each matrix and print the summation. If matrices are A and B, then you need to calculate C=5A-B. For example, if the user enters 3, then size of each matrix is 3. Then you need to take 3 values for first matrix which will form A=[5  6  7]. Then take 3 values for second matrix, B=[2  3  4]. You need to print result, C=[23  27  31]. The output will be 23  27  31. You must use array, loop (while or for), and array.length for this program.		

### Task 9

Write a Java Code of a program that declares an array of integer type of size 10 and takes input of your choice. Have the program print the values, square all the values, and then display the new values. Write a static method (in the same class as main method) to do the displaying and a second static method to find out the squares. Have the methods take the array name and the array size as arguments. 	



### Task 10

Write a method named season that takes two integers as parameters representing a month and day and that returns a String indicating the season for that month and day. Assume that months are specified as an integer between 1 and 12 (1 for January, 2 for February, and so on) and that the day of the month is a number between 1 and 31.
If the date falls between 12/16 and 3/15, you should return "Winter". If the date falls between 3/16 and 6/15, you should return "Spring". If the date falls between 6/16 and 9/15, you should return "Summer". And if the date falls between 9/16 and 12/15, you should return "Fall".

### Task 11

Write a method named allDigitsOdd that returns whether every digit of a positive integer is odd. Your method should return true if the number consists entirely of odd digits and false if any of its digits are even. 0, 2, 4, 6, and 8 are even digits, and 1, 3, 5, 7, 9 are odd digits.
For example, allDigitsOdd(135319) returns true but allDigitsOdd(9145293) returns false.

### Task 12

Write a method before that takes as parameters two month/day combinations and that returns whether or not the first date comes before the second date (true if the first month/day comes before the second month/day, false if it does not). The method will take four integers as parameters that represent the two month/day combinations.

The first integer in each pair represents the month and will be a value between 1 and 12 (1 for January, 2 for February, etc, up to 12 for December). The second integer in each pair represents the day of the month (a value between 1 and 31). One date is considered to come before another if it comes earlier in the year.






### Task 13

Write the removeOdd method bellow which take in an array of numbers that has even and odd numbers mixed. This function removes the odd numbers and returns a compact array which only has the even numbers. For example output of the following code is:
21 33 44 66 11 1 88 45 10 9 
44 66 88 10
public class Test{
  public static int [] removeOdd (int [] input){
	//Your code here
  }
  public static void main(String [] args){
    int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
    for (int i = 0; i < mixedArray.length; i++) {
      System.out.print(mixedArray[i] + " ");
    }
    System.out.println();
    int [] noOdd = removeOdd(mixedArray);
    for (int i = 0; i < noOdd.length; i++) {
      System.out.print(noOdd[i] + " ");
    }    
  }
}




-The End-

