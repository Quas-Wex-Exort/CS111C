public class RunningTimePracticeOne {

    public static void main(String []args) {
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum++;
        }


        long startTime = System.nanoTime();

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        // 1 billion nanoseconds == 1 second
        System.out.println(totalTime + " \'nanoseconds\'");
    }
}
