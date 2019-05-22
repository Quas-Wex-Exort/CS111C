import java.util.Arrays;

public class Recursion_ReverseArray {

    public static void main(String []args) {
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println("Before reverse: " + Arrays.toString(array1));
        System.out.println("After reverse: ");
        printReverse(array1);
        System.out.println("Your answer below: ");
        reverseArray(array1);
        System.out.println(Arrays.toString(array1));

        System.out.println();
        printReverse(array1);
        reverseArray(array1);
        System.out.println(Arrays.toString(array1));
        /*
        System.out.println("\n******TESTING ARRAY REVERSER");
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println("Before reverse: " + Arrays.toString(array1));
        System.out.println("After reverse should be");
        printReverse(array1);
        reverseArray(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println("After reversing back should be");
        printReverse(array1);
        reverseArray(array1);
        System.out.println(Arrays.toString(array1));
        /*
        int[] array2 = {1, 2, 3, 4, 5, 6};
        System.out.println("\nBefore reverse: " + Arrays.toString(array2));
        System.out.println("After reverse should be");
        printReverse(array2);
        reverseArray(array2);
        System.out.println(Arrays.toString(array2));
        System.out.println("After reversing back should be");
        printReverse(array2);
        reverseArray(array2);
        System.out.println(Arrays.toString(array2));

        int[] array3 = {1, 2};
        System.out.println("\nBefore reverse: " + Arrays.toString(array3));
        System.out.println("After reverse should be");
        printReverse(array3);
        reverseArray(array3);
        System.out.println(Arrays.toString(array3));
        int[] array4 = {1};
        System.out.println("\nBefore reverse: " + Arrays.toString(array4));
        System.out.println("After reverse should be");
        printReverse(array4);
        reverseArray(array4);
        System.out.println(Arrays.toString(array4));
        int[] array5 = {};
        System.out.println("\nBefore reverse: " + Arrays.toString(array5));
        System.out.println("After reverse should be");
        printReverse(array5);
        reverseArray(array5);
        System.out.println(Arrays.toString(array5));
        */
    }

    public static void reverseArray(int[] array) {
        //reverseArrayHelper(array,0);
        reverseArrayHelper(array,0, array.length-1);
    }

    private static void reverseArrayHelper(int[] array, int start, int end) {
        if (array.length > 0) {
            if (start == end) {
                System.out.println(array[start]);
            } else {
                System.out.print(array[end] + ", ");
                reverseArrayHelper(array, start, end - 1);
            }
        } else {
            return;

        }
    }
    /*
    private static void reverseArrayHelper(int[] array, int start, int end) {
        if (end >= 1 && start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            reverseArrayHelper(array, start + 1, end - 1);
        }
    } */

    /*
    private static void reverseArrayHelper(int[] array, int index) {
        if (index!=array.length) {
            reverseArrayHelper(array, index+1);
            System.out.print(array[index] + " ");
        }
    }
    */
    public static void printReverse(int[] array) {
        System.out.print("[");
        for (int i = array.length - 1; i > 0; i--) {
            System.out.print(array[i] + ", ");
        }
        if (array.length > 0) {
            System.out.print(array[0]);
        }
        System.out.println("]");
    }
}
