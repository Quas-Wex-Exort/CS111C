import java.text.NumberFormat;

public class CompareTo_Test {

    public static void main(String []args) {
        NumberFormat formatter = NumberFormat.getPercentInstance();
        Integer[] array1 = {1, 2, 3, 3, 5};
        int n = array1.length-1;
        int count = 3;

        double results = ((double) count) / array1.length;
        System.out.println(formatter.format(results));

    }
}
