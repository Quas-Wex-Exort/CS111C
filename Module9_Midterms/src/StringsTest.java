import java.util.Scanner;


public class StringsTest {

    public static String normalizeText(String word) {
        return word.replaceAll("[a-zA-Z]", "*");
    }

    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userString = scan.nextLine();
        System.out.println(normalizeText(userString));
    }
}
