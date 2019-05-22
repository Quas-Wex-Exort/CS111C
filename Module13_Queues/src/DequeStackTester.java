public class DequeStackTester {
    public static void main(String []args) {
        DequeStack<Integer> dq1 = new DequeStack <>();
        DequeStack<Integer> dq2 = new DequeStack <>();

        dq1.push(1);
        dq1.push(22);
        dq1.pop();

        System.out.println(dq1.peek());
        dq1.pop();
        System.out.println(dq1.peek());


    }
}
