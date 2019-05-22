public class Divisibility {

    public static void main(String []args) {

        for (int i = 1; i <= 50; i++) {
            System.out.print(i + ", ");
            if (i % 2 == 0) {
                System.out.print("Even, ");
            } else {
                System.out.print("Odd, ");
            }
            if (i % 3 == 0 && i % 8 == 0) {
                System.out.print("divisible by both 3 and 8.\n ");
            } else if (i % 3 == 0 || i % 8 == 0) {
                System.out.print("divisible by either 3 or 8.\n");
            } else {
                System.out.print("not divisible by neither 3 and 8.\n");
            }
        }
    }
}
