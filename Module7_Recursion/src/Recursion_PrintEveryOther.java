public class Recursion_PrintEveryOther {

    public static void main(String []args) {
        int[] nums = new int[] {1,2,3,4,5,6,7,8,9,11};
        printEveryOther(nums);

    }

    public static void printEveryOther(int[] numbersArray) {
        printEveryOtherHelper(numbersArray, 0);
    }

    private static void printEveryOtherHelper(int[] numbersArray, int index) {
        if (index >= numbersArray.length) {
            return;
        } else {
            System.out.println(numbersArray[index]);
            printEveryOtherHelper(numbersArray, index+2);
        }
    }

}
