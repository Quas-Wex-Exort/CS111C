public class QueueReview {

    public static void main(String []args) {
        QueueInterface<Integer> q1 = new LinkedQueue<Integer>();
        QueueInterface<Integer> q2 = new LinkedQueue<Integer>();
        splice(q1, q2);
        System.out.println("q1 empty: \ntrue\n" + q1.isEmpty());
        System.out.println("q2 empty: \ntrue\n" + q2.isEmpty());
        q1.enqueue(4);
        q1.enqueue(8);
        q1.enqueue(9);
        q1.enqueue(2);

        q2.enqueue(1);
        q2.enqueue(3);
        q2.enqueue(7);
        q2.enqueue(6);
        q2.enqueue(3);
        q2.enqueue(1);

        splice(q1, q2);
        //System.out.println("\nq1 contains: \n4 8 9 2");
        ((LinkedQueue<Integer>)q1).display();
    }

    public static void splice(QueueInterface firstQueue, QueueInterface secondQueue) {
        while (!secondQueue.isEmpty()) {
            firstQueue.enqueue(secondQueue.getFront());
        }
    }
}
