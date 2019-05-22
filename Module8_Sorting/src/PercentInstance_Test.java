import java.text.NumberFormat;

public class PercentInstance_Test {

    public static void main(String []args) {
        NumberFormat formatter = NumberFormat.getPercentInstance();

        double number = 0.6;
        System.out.println(formatter.format(number));
    }
}
