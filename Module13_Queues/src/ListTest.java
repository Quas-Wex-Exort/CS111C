import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String []args) {
        List<Integer> list = new ArrayList <>();

        list.add(1);
        list.add(40);
        list.add(2);
        list.add(40);
        list.add(3);
        list.add(40);
        list.add(4);
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.toString());
        System.out.println(list.remove(2));
        System.out.println(list.toString());
    }
}
