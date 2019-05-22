import java.util.Scanner;

public class HW6 {

    public static void main(String []args) {

        int sum = 0;
        int counter;
        // The loop is always half of what the data size is.
        // If n (counter) = 4, the loop shall iterate 2 times
        // If n (counter) = 8, the loop shall iterate 4 times.
        // So, O(log n) -> similar to binary search
        /* for(counter = 32; counter > 0; counter = counter-2) {
            sum = sum + counter;
            System.out.println("COUNTER: " + counter);
            System.out.println("SUM " + sum);
            System.out.println();
        } */

        // n=2, loop=1
        // n=4, loop=2
        // n=8, loop=3
        // n=16, loop=4

        for(counter = 1; counter < 16; counter = 2 * counter) {
            sum = sum + counter;
            System.out.println("COUNTER: " + counter);
            System.out.println("SUM " + sum);
            System.out.println();
        }


    }
}
