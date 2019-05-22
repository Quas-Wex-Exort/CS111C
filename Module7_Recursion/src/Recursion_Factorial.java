public class Recursion_Factorial {

    public static void main(String[] args) {
        /*
        1! = 1
        2! = 2*1 = 2
        3! = 3*2*1 = 6
        ...
         */
        System.out.printf("%,d",getFactorial(8));
    }

    public static int getFactorial(int n) {
        int result = 0;
        if (n == 0 || n == 1) {
            return 1;

        }
        result = getFactorial(n - 1) * n;

        return result;
    }
}