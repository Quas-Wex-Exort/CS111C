public class QNotFollowedByU {

    public static void main(String[] args) {
        System.out.println("******TESTING Q WITHOUT U");
        System.out.println("ququququq: true " + qNotFollowedByU("ququququq"));
        System.out.println("\nAll of these should be false. They do NOT contain a \"q\" that is not immediately followed by a \"u\"");
        System.out.println("hello: \t\tfalse: " + qNotFollowedByU("hello")); // no q at all- odd length
        System.out.println("cats: \t\tfalse: " + qNotFollowedByU("cats")); // no q at all- even length
        System.out.println("a: \t\tfalse: " + qNotFollowedByU("a")); // no q at all- single letter
        System.out.println("quite: \t\tfalse: " + qNotFollowedByU("quite")); // q followed by u at the beginning
        System.out.println("equal: \t\tfalse: " + qNotFollowedByU("equal")); // q followed by u in the middle- odd length
        System.out.println("aqua: \t\tfalse: " + qNotFollowedByU("aqua"));    // q followed by u in the middle- even length
        System.out.println("nonsensewordqu: false: " + qNotFollowedByU("nonsensewordqu")); // q followed by u at the end
        System.out.println("QUOTE: \t\tfalse: " + qNotFollowedByU("QUOTE")); // q followed by u in caps
        System.out.println("qu: \t\tfalse: " + qNotFollowedByU("qu")); // q followed by u and nothing else
        System.out.println("\"\": \t\tfalse: " + qNotFollowedByU("")); // empty string

        System.out.println("\nAll of these should be true. They DO contain a \"q\" that is not immediately followed by a \"u\"");
        System.out.println("qat: \t\ttrue: " + qNotFollowedByU("qat")); // q without u at the beginning
        System.out.println("cinq: \t\ttrue: " + qNotFollowedByU("cinq")); // q without u at the end- even length
        System.out.println("drinq: \t\ttrue: " + qNotFollowedByU("drinq")); // q without u at the end- odd length
        System.out.println("nonsenseqword: \ttrue: " + qNotFollowedByU("nonsenseqword")); // q without u in the middle
        System.out.println("aquaq: \t\ttrue: " + qNotFollowedByU("aquaq")); // q without u in a word that also has a "qu" before it
        System.out.println("qaqu: \t\ttrue: " + qNotFollowedByU("qaqu")); // q without u in a word that also has a "qu" after it
        System.out.println("qiteu: \t\ttrue: " + qNotFollowedByU("qiteu")); // q without u right after, but with a u later on
        System.out.println("q: \t\ttrue: " + qNotFollowedByU("q")); // q all on its own- single letter
        System.out.println("qq: \t\ttrue: " + qNotFollowedByU("qq")); // q all on its own- double letter
        System.out.println("uq: \t\ttrue: " + qNotFollowedByU("uq")); // q with a u before it
        System.out.println("Qtip: \t\ttrue: " + qNotFollowedByU("Qtip")); // q without a u in caps
    }

    public static boolean qNotFollowedByU(String word) {
        return qNotFollowedByUHelper(word, 0, 1);
    }

    private static boolean qNotFollowedByUHelper(String word, int start, int next) {
        if (word.length() == 0 || word.length() == start) {
            return false;
        }
        if (start < next) {
            if (word.toLowerCase().charAt(word.length() - 1) == 'q') {
                return true;
            }
            if (word.toLowerCase().charAt(start) == 'q' && word.toLowerCase().charAt(next) == 'u') {
                return false;
            } else if (word.toLowerCase().charAt(start) == 'q' && word.toLowerCase().charAt(next) != 'u') {
                return true;
            } else {
                return qNotFollowedByUHelper(word, start + 1, next + 1);
            }
        }
        return qNotFollowedByUHelper(word, start + 1, next + 1);
    }

}