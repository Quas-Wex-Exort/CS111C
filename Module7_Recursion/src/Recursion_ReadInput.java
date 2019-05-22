/*
    Write a recursive method to read input within a specified range and return that input.
 */

import java.util.Scanner;

public class Recursion_ReadInput {

    public static void main(String []args) {
        System.out.println("Number entered: " + readUserInput(1,10));
    }

    public static int readUserInput(int lower, int upper) {
        System.out.println("Enter a number between " + lower + " and " + upper + ": ");
        Scanner scan = new Scanner(System.in);
        int userNumber = Integer.parseInt(scan.nextLine());

        if (userNumber < lower || userNumber > upper) {
            System.out.println("Input out of range. Try again.");
            userNumber = readUserInput(lower,upper); // recursive calls are linked together by
            // storing the expected result in a local variable!
        }
        return userNumber;
    }
}
