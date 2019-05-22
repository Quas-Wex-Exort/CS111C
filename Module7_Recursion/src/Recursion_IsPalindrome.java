public class Recursion_IsPalindrome {

    public static void main(String []args) {
        System.out.println(isPalindrome("ava"));
    }

    public static boolean isPalindrome(String word) {
        return isPalindromeHelper(word, 0, word.length()-1);
    }

    private static boolean isPalindromeHelper(String word, int start, int end) {
        int length = word.length();
        boolean isPalindromeChecker = false;
        if (length < 2 || start == end || start > end) {
            isPalindromeChecker = true;
        } else {
            if (word.charAt(start) == word.charAt(end)) {
                isPalindromeChecker = isPalindromeHelper(word,start+1,end-1);
                return isPalindromeChecker;
            }
        }
        return isPalindromeChecker;
    }
}
