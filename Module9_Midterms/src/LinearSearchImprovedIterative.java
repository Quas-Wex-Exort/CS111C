import java.util.Scanner;

public class LinearSearchImprovedIterative {

    public static boolean linearSearch(Integer target, int[] data) {
        boolean found = false;

        for (int i = 0;i < data.length && !found; i++) {
            if (target.equals(data[i])) {
                found = true;
            }
        }
        return found;
    }

    public static void main(String []args) {

        Scanner scan = new Scanner(System.in);

        int[] arr = {18,45,669,474,212,45,4845,1556,4,54,1233,6,644,6,4,1,94};


        System.out.print("Enter item to search for: ");
        int item = scan.nextInt();

        System.out.println(linearSearch(item,arr));
        String something = "vince";;
        System.out.println(something.substring(1,5));
    }


}
