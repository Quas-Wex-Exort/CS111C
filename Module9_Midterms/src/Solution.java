import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int secondInt;
        double secondDouble;
        String secondString = "is the best place to learn and practice coding";

        /* Read and save an integer, double, and String to your variables.*/
        System.out.print("Enter second integer: ");
        secondInt = scan.nextInt();
        System.out.println();
        System.out.print("Enter second double: ");
        secondDouble = scan.nextDouble();
        System.out.println();
        System.out.print("Enter new string: ");
        secondString = scan.next();
        System.out.println();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + secondInt);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + secondDouble);

        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + secondString);

        scan.close();
    }
}