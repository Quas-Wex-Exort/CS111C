/*
    Write a recursive method that counts the number of times a character appears in a string.
 */

import java.util.Scanner;

public class Recursion_CountCharacterAppearance {

    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = scan.nextLine();

        System.out.print("Enter character to search for: ");
        char character = scan.next().charAt(0);

        System.out.println(countOccurrence(word, character,0));
    }

    public static int countOccurrence(String word, char character, int index) {
        int count = 0;
        if (index < word.length()) {
            if (word.charAt(index) == character) {
                count = 1;
            }
            count += countOccurrence(word, character, index + 1);
            // The above line updates the local variable for proper return!
        }
        return count;
    }

    /*public static int countOccurrence(String word, char character) {
        return countOccurrenceHelper(word, character, 0);
    }

    private static int countOccurrenceHelper(String word, char character, int index) {
        int count = 0;
        if (index < word.length()) {
            if (word.charAt(index) == character) {
                count = 1;
            }
            count += countOccurrence(word, character, index + 1);
        }
        return count;
    }
    */
}
