import java.util.*;

public class RandomArray {

    private int[] array;

    public RandomArray(int sizeOfArray){
        array =  new int[sizeOfArray];
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * array.length);
            System.out.print("Value " + (i+1) + ": " + array[i] + "\n");
        }
    }

    public int getMax(){
        int maxValue = array[0];
        for (int i : array) {
            if(array[i] > maxValue){
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public int getMin() {
        int minValue = array[0];
        for (int i : array) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public double getAverage() {
        int sum = 0;
        for (int i : array) {
            sum += array[i];
        }
        return Double.valueOf(sum) / array.length;
    }

    @Override
    public String toString() {
        return "These are the unsorted contents of your array: " + Arrays.toString(array);
    }

}