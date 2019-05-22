import java.util.Stack;
import java.util.Scanner;

public class StackIsPalindrome {

    public static void main(String []args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String inputString = scan.nextLine();

        System.out.println(isPalindrome(inputString));

    }

    public static boolean isPalindrome(String s) {

        int i = 0;
        Stack<Character> stack = new Stack<>();
        while (i < s.length()) {
            stack.push(s.charAt(i));
            i++;
        }
        for (i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == stack.pop())) {
                return false;
            }

        }
        return true;
    }
}
