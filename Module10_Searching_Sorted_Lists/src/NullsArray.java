import java.util.*;

public class NullsArray {

    public static void main(String[] args) {
        String[] stringArr = {"ant", null, null, "ball", null, null, null, "drive", null, null,
                "food"};
        String[] stringArr2 = {"ant", "drive", null, "food"};

        for (int i = 0; i < stringArr.length; i++) {
            System.out.println(stringArr[i]);
        }

        System.out.println(binarySearchWithNulls(stringArr, "drive"));
    }
    public static int binarySearchWithNulls(String[] words, String target) {
        return binarySearchWithNullsHelper(words,target,0,words.length-1);
    }

    public static int binarySearchWithNullsHelper(String[] words, String target, int a, int b) {
        if(b <= a)
            return -1;

        if(b - a == 1)
            return words[a].equals(target) ? a : -1;

        int mid = (a + b)/2;
        if(target.compareTo(words[mid]) < 0) {
            return binarySearchWithNullsHelper(words,target, 0, mid);
        } else if(target.compareTo(words[mid]) > 0) {
            return binarySearchWithNullsHelper(words,target,mid,b);
        } else {
            return mid;
        }
    }

}