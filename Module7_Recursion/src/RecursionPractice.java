public class RecursionPractice {

    public static void main(String []args) {

        System.out.printf("%,d",keepAdding(20));
    }

    public static int keepAdding(int value) {
        if (value == 0 || value < 0) {
            return 0;
        } else {
            System.out.println("Value: " + value);
            System.out.println("Value - 1: " + (value-1));
            return value + keepAdding(value - 1);
        }

    }
}
