import java.util.*;

public class Recursion_Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("anna"));

    }
    /*
    private static boolean isPalindrome(String word) {
        if (word.length() > 1) {
            if (word.substring(0, 1).equalsIgnoreCase(word.substring(word.length() - 1))) {
                return isPalindrome(word.substring(1, word.length() - 1));
            }
        }
        return word.length() == 1 || word.length() == 0;
    } */

    private static boolean isPalindrome(String word) {
        return isPalindromeHelper(word, 0, word.length() - 1);
    }

    private static boolean isPalindromeHelper(String word, int start, int end) {
        if (start >= end) {
            return true;
        } else if (word.length() > 1) {
            if (word.charAt(start) == word.charAt(end)) {
                return isPalindromeHelper(word, start + 1, end - 1);
            }
        }
        return false;
    }
}
