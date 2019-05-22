public class Recursion_Blastoff {

    public static void main(String []args) {
        blastoffCountdown(10);
    }

    public static void blastoffCountdown(int n) {
        if (n==0) { // base case - this is when recursion stops
            System.out.println("Blastoff!");
        } else {
            System.out.println(n); // solves the small part now!
            blastoffCountdown(n-1); // solves the rest of the problem later;
            // this is the recursive call to the method
            // always make sure the recursive call moves up closer to the base case!
        }

    }
}
