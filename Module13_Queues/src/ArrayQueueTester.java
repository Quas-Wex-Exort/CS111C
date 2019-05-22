import java.lang.reflect.Array;
import java.util.*;

public class ArrayQueueTester {

    public static void main(String []args) {
        ArrayQueue<Integer> aq1 = new ArrayQueue<>();
        ArrayQueue<Integer> aq2 = new ArrayQueue<>();
        ArrayQueue<Integer> aq3 = new ArrayQueue<>();

        aq1.enqueue(100);
        aq1.enqueue(300);
        aq1.enqueue(500);
        aq1.enqueue(700);

        aq2.enqueue(2);
        aq2.enqueue(4);
        aq2.enqueue(6);
        aq2.enqueue(8);

        aq1.splice(aq2);
        aq2.display();
        aq1.display();
        aq2.splice(aq3);
        aq2.display();
        aq3.display();
    }
}
