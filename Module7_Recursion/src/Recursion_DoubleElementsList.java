import java.util.*;

public class Recursion_DoubleElementsList {

    public static void main(String []args) {
        List<Integer> list = new ArrayList <>();
        list.add(10);
        list.add(-2);
        list.add(3);
        list.add(4);
        list.add(111);
        list.add(23);
        list.add(34);
        list.add(14);

        doubleElements(list);
        System.out.println(list);

    }

    public static void doubleElements(List<Integer> list) {
        doubleElementsHelper(list,0);
    }

    private static void doubleElementsHelper(List<Integer> list, int index) {
        if (index < list.size()) { // recursive case
            int value = list.get(index);
            list.set(index,value*2);
            doubleElementsHelper(list, index+1);
        }
    }
}
