import java.util.*;

public class M10_PracticeQuestion {

    public static void main(String []args) {

        SortedListInterface<Integer> sortedList = new SortedLinkedList<>();
        sortedList.add(59);
        sortedList.add(14);
        sortedList.add(46);
        sortedList.add(22);
        sortedList.add(35);
        sortedList.remove(Integer.valueOf(22));  // the remove(T) method
        sortedList.display();
        System.out.println();
        System.out.println(sortedList.getPosition(59));
        System.out.println(sortedList.getPosition(14));
        System.out.println(sortedList.getPosition(46));
        System.out.println(sortedList.getPosition(22));
    }
}
