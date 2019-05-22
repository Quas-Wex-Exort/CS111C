/*
    Write a recursive method to sum up all the numbers from 1 to some number.
 */

public class Recursion_SumOfNumbers {

    public static void main(String []args) {
        System.out.println(sumFromOne(6));
        System.out.println(sumFromOneWithLocalVariables(6));
    }

    public static int sumFromOne(int number) {
        if (number == 1) { // base case
            return 1;
        } else {
            return number + sumFromOne(number - 1); // recursive case
        }
    }

    public static int sumFromOneWithLocalVariables(int number) {
        int sum= 0; // local variable!
        if (number == 1) {
            sum = 1;
        } else {
            sum += number + sumFromOneWithLocalVariables(number-1);
            // this recursive method call updates the actual local variable!
            // return sumFromOneWithLocalVariables(number-1); <-- never updates the local
            // variable sum!!!!, so sum == 0 always!
        }
        return sum;
    }
}