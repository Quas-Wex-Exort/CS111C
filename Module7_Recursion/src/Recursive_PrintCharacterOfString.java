public class Recursive_PrintCharacterOfString {
    public static void main(String []args) {
        printCharacters("Bitch");

    }

    public static void printCharacters(String word) {
        // Think of both the method's base case and recursive case
        // base case tells the recursion when to stop
        /*if (word.length() ==1) { // base case
            System.out.println(word.charAt(0));
        } else {

            System.out.println(word.charAt(0)); // word.substring(0,1); prints the first character
            //printCharacters(word minus the first character); // recursively repeat the task with
            // word minus first character
            printCharacters(word.substring(1));
        }
        */

        System.out.println(word.charAt(0));
        if(word.length() > 1) {
            printCharacters(word.substring(1));
        }
        //System.out.println(word.charAt(0));
    }

    public static void printCharactersEfficient(String word) {
        printCharactersEfficientHelper(word, 0);
    }

    public static void printCharactersEfficientHelper(String word, int index) {
        System.out.println(word.charAt(index));
        if (index < word.length()) { // recursive call
            printCharactersEfficientHelper(word, index+1);
        }
    }
}
