public class RandomArray_Test {

    public static void main(String []args) {

        RandomArray array1 = new RandomArray(20);
        System.out.printf("\nThe largest value in your array is: %,d\n",array1.getMax());
        System.out.printf("\nThe smallest value in your array is: %,d\n",array1.getMin());
        System.out.println(array1.toString());
        System.out.printf("The average value of your array is: %,.2f\n", array1.getAverage());
    }
}
